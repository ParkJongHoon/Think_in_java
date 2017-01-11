package org.uengine.Chap10.Error_Handling_with_Exceptions.Exception_chaining;
import static net.mindview.util.Print.*;

/**
 * 작성일: 2017-01-11
 * 작성자: 박종훈
 * 작성내용: 임의로 만든 Container에서 value값에 null 집어넣을 때 
 * 임의로 만든 Exception에다가 다른 Exception을 삽입하여 stack trace로 표현하는 방법
 * @author XNote
 *
 */

public class DynamicFields {

		private Object[][] fields;
		public DynamicFields(int initialSize){
			fields = new Object[initialSize][2];
			for(int i =0; i < initialSize; i++)
				fields[i] = new Object[] {null, null};
		}
		public String toString(){
			StringBuilder result = new StringBuilder();
			for(Object[] obj : fields){
				result.append(obj[0]);
				result.append(": ");
				result.append(obj[1]);
				result.append("\n");
			}
			return result.toString();
		}
		private int hasField(String id){
			for(int i =0; i < fields.length; i++)
				if(id.equals(fields[i][0]))
						return i;
			return -1;
		}
		private int getfieldnumber(String id) throws NoSuchFieldException{
			int fieldNum = hasField(id);
			if(fieldNum ==  -1)
				throw new NoSuchFieldException();
			return fieldNum;
		}
		private int makeFiled(String id){
			for(int i =0; i < fields.length; i++)
				if(fields[i][0]  == null){
					fields[i][0] = id;
					return i;
				}
			// No empty fields, Add one:
			Object[][] tmp = new Object[fields.length + 1][2];
			for(int i =0; i< fields.length; i++)
				tmp[i] = fields[i];
			for(int i = fields.length; i < tmp.length; i++)
				tmp[i] = new Object[] {null, null};
			fields = tmp;
			// Recursive call with expanded fields:
			return makeFiled(id);
		}
		public Object getField(String id) throws NoSuchFieldException{
			
			return fields[getfieldnumber(id)][1];
		}
		public Object setField(String id, Object value) throws DynamicFieldsException{
			if(value == null){
				
				// Most exceptions don't have a "cause" constructor.
				// In these cases you must use initCause(),
				// available in all Throwable subclasses.
				DynamicFieldsException dfe = new DynamicFieldsException();
				dfe.initCause(new NullPointerException());
				throw dfe;
			}
			int fieldNumber = hasField(id);
			if(fieldNumber == -1){
				System.out.println("fieldNumber.id: " + id);
				fieldNumber = makeFiled(id);
				System.out.println("if.fieldNumber: " + fieldNumber);
			}else{
				System.out.println("else.fieldNumber: " + fieldNumber);
			}
			Object result = null;
			try{
				result = getField(id); // Get old value
			}catch(NoSuchFieldException e){
				// Use constructor that takes "cause"
				throw new RuntimeException(e);
			}
			fields[fieldNumber][1] = value;
			return result;
		}
	


		public static void main(String[] args) {
			DynamicFields df = new DynamicFields(3);
			print(df);
			try{
				df.setField("d", "A value for d");
				df.setField("number", 47);
				df.setField("number2", 48);
				print(df);
				df.setField("d", "A new value for d");
				df.setField("number3", 11);
				print("df: " + df);
				print("df.getField(\"d\") : " + df.getField("d"));
				Object field = df.setField("d", null); // Exception
			}catch(NoSuchFieldException e){
				e.printStackTrace(System.out);
			}catch(DynamicFieldsException e){
				e.printStackTrace(System.out);
			}
		
		}
}

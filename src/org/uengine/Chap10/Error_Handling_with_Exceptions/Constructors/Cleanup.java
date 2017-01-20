package org.uengine.Chap10.Error_Handling_with_Exceptions.Constructors;

import java.io.File;

public class Cleanup {
	
	/**
	 * �ۼ���: 2017-01-17
	 * �ۼ���: ������
	 * �ۼ�����: Exception ���� �ϴ� ��Ŀ� ���� �ڵ�
	 * main �޼ҵ�ȿ��� Exception ���踦 �ϴ� ���� �ƴ϶�
	 * ����� ��ü(InputFile) �ȿ��� Exception ���� ��ü�� ������
	 *  
	 */

	public static void main(String[] args) {
		try{
			String path = Cleanup.class.getResource("").getPath();
			int indexNum = path.indexOf("bin");
			int indexNum2 = path.indexOf("/org");
			String pathEdit1 = path.substring(0, indexNum);
			String pathEdit2 = path.substring(indexNum2);
			// System.out.println(pathEdit1 + "src" + pathEdit2);
			path = pathEdit1 + "src" + pathEdit2;
			InputFile in = new InputFile(path + "Cleanup.java");
			try{
				String s;
				int i = 1;
				while((s = in.getLine()) != null)
					System.out.println(s + ": " + i++);
					; // Performline-by-line processing here...
			}catch(Exception e){
				System.out.println("Caught Exception in main");
				e.printStackTrace(System.out);
			}finally{
				in.dispose();
			}
		}catch(Exception e){
			System.out.println("InputFile construction failed");
		}

	}

}

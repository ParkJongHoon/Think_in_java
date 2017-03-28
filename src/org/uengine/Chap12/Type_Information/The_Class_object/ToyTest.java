package org.uengine.Chap12.Type_Information.The_Class_object;
import static net.mindview.util.Print.*;

/**
 * 작성일: 2017-03-28
 * 작성자: 박종훈
 * 작성내용: Class 객체 리플렉션 사용의 예
 * @author XNote
 *
 */

public class ToyTest {

	static void printInfo(Class cc){
		print("Class name: " + cc.getName() +
			" is interface? [" + cc.isInterface() + "]");
		System.out.println();
		print("Simple name: " + cc.getSimpleName());
		System.out.println();
		print("Canonical name : " + cc.getCanonicalName());
		System.out.println();
	}
	
	public static void main(String[] args) {
		Class c = null;
		try{
			c = Class.forName("org.uengine.Chap12.Type_Information.The_Class_object.FancyToy");
		}catch(ClassNotFoundException e){
			print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		System.out.println("----------------------");
		int index = 0;
		for(Class face : c.getInterfaces()){
			index ++;
			printInfo(face);
			System.out.println("index: " + index);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try{
			// Requires default constructor:
			obj = up.newInstance();
		}catch(InstantiationException e){
			print("Cannot instantiate");
			System.exit(1);
		}catch(IllegalAccessException e){
			print("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}

}

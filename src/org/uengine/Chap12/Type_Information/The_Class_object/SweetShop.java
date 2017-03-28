package org.uengine.Chap12.Type_Information.The_Class_object;
import static net.mindview.util.Print.*;


public class SweetShop {
	public static void main(String[] args) {
		print("inside main");
		new Candy();
		print("After creating Candy");
		try{
		Class.forName("org.uengine.Chap12.Type_Information.The_Class_object.Gum");
		}catch(ClassNotFoundException e){
			print("Couldn't find Gum");
		}
		print("After Class.forName(\"Gum\")");
		new Cookie();
		print("After creating Cookie");
	}

}

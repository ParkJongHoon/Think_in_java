package org.uengine.chap06.Polymorphism.Downcasting_and_runtime_type_information;

public class RTTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Useful[] x= {new Useful(), new MoreUseful()};
		
		x[0].f();
		x[1].g();
		
		((MoreUseful)x[1]).u();
		((MoreUseful)x[0]).u();
	}

}

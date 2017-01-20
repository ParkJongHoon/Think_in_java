package org.uengine.Chap10.Error_Handling_with_Exceptions.Constructors;

import java.io.File;

public class Cleanup {
	
	/**
	 * 작성일: 2017-01-17
	 * 작성자: 박종훈
	 * 작성내용: Exception 설계 하는 방식에 관한 코드
	 * main 메소드안에서 Exception 설계를 하는 것이 아니라
	 * 사용할 객체(InputFile) 안에서 Exception 설계 자체를 수행함
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

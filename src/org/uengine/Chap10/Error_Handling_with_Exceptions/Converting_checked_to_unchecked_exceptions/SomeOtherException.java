package org.uengine.Chap10.Error_Handling_with_Exceptions.Converting_checked_to_unchecked_exceptions;
import static net.mindview.util.Print.*;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 작성일: 2017-02-03
 * 작성자: 박종훈
 * 작성내용: 타클래스에서 Exception type을 정의 후 
 * 해당 Exception을 RuntimeException 귀속시키는 코드<- WrapCheckedException
 * 즉 Exception 겉은 RuntimeException이고 그 속은 지정된 Exception이 들어간다.
 *
 */

public class SomeOtherException extends Exception {

	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		// You can call throwRuntimeException() without a try
		// block, and let Runtimeexceptions leave the method:
		wce.throwruntimeException(3);
		// Or you can choose to catch exceptions:
		for(int i =0; i < 4; i++)
			try{
				if(i < 3){
					System.out.println("@@@@@@");
					wce.throwruntimeException(i);
					
				}
				else
					throw new SomeOtherException();
			}catch(SomeOtherException e){
				print("SomeOtherException: " + e);
			}catch(RuntimeException re){
				try{
					throw re.getCause();
				}catch(FileNotFoundException e){
					System.out.println("1");
					print("FileNotFoundException: " + e);
				}catch(IOException e){
					System.out.println("2");
					print("IOException: " + e);
				}catch(Throwable e){
					System.out.println("3");
					print("Throwable: " + e);
				}
			}
		}
}

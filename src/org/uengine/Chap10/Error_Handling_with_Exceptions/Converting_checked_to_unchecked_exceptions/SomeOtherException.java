package org.uengine.Chap10.Error_Handling_with_Exceptions.Converting_checked_to_unchecked_exceptions;
import static net.mindview.util.Print.*;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ۼ���: 2017-02-03
 * �ۼ���: ������
 * �ۼ�����: ŸŬ�������� Exception type�� ���� �� 
 * �ش� Exception�� RuntimeException �ͼӽ�Ű�� �ڵ�<- WrapCheckedException
 * �� Exception ���� RuntimeException�̰� �� ���� ������ Exception�� ����.
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

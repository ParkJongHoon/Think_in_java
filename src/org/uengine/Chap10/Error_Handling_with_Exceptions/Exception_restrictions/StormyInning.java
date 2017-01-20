package org.uengine.Chap10.Error_Handling_with_Exceptions.Exception_restrictions;

public class StormyInning extends Inning implements Storm {
	/**
	 * 
	 * �ۼ���: 2017-01-17
	 * �ۼ���: ������
	 * �ۼ�����
	 * 1) Exception �� ������ �ִ� �߻�Ŭ������ ��ӹ�����
	 * ��� ���� �߻�Ŭ������ �޼ҵ带 ������ �� �� throws�� ���ص� �ȴ�.
	 * (�ϸ� Error �߻� -> Exception ��ü�� �����ϰ� �ֱ� ������)
	 * 
	 * 2) Exception �� ������ �ִ� �������̽��� ������ ��
	 * �������̽����� Exception�� ���� �� �޼ҵ带 override �Ѵٰ� �Ҷ�
	 * throws�� ���ǰ� �����ϴ�(�̶��� Exception�� ����)
	 */

	// OK to add new exceptions for constructors, but you
	// must deal with the base constructor exceptions:
	public StormyInning() throws RainedOut, BaseballException {}
	
	public StormyInning(String s) throws Foul, BaseballException{}
	// regular methods must conform to base class:
//! void walk() throws PopFoul {} // Compile error 
	// Interface CANNOT add exceptions to existing
	// methods from the base class:
//! public void event() throws RainedOut{}
	// If the method doesn't already exist in the
	// base class, the exception is Ok:
	@Override
	public void rainHard() throws RainedOut {}
	// You can choose to not throw any exceptions,
	// even if the base version does:
	public void event() {}
	// Overridden methods can throw inherited exceptions:
	@Override
	public void atBat() throws Strike, Foul {}
	public static void main(String[] args) {
		try{
			StormyInning si = new StormyInning();
			si.atBat();
		}catch(PopFoul e){
			System.out.println("Pop foul");
		}catch(RainedOut e){
			System.out.println("Rained out");
		}catch(BaseballException e){
			System.out.println("Generic baseball exception");
		}
		// Strike not thrown in derived version.
		try{
			// What happens if you upcast?
			Inning i = new StormyInning();
			i.atBat();
		}catch(Strike e){
			System.out.println("Strike");
		}catch(Foul e){
			System.out.println("Foul");
		}catch(RainedOut e){
			System.out.println("Rained out");
		}catch(BaseballException e){
			System.out.println("Generic baseball exception");
		}

	}

}

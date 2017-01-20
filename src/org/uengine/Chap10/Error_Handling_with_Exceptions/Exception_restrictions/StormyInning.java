package org.uengine.Chap10.Error_Handling_with_Exceptions.Exception_restrictions;

public class StormyInning extends Inning implements Storm {
	/**
	 * 
	 * 작성일: 2017-01-17
	 * 작성자: 박종훈
	 * 작성내용
	 * 1) Exception 을 가지고 있는 추상클래스를 상속받으면
	 * 상속 받은 추상클래스의 메소드를 재정의 할 때 throws를 안해도 된다.
	 * (하면 Error 발생 -> Exception 자체를 포함하고 있기 때문에)
	 * 
	 * 2) Exception 을 가지고 있는 인터페이스를 구현할 때
	 * 인터페이스에서 Exception을 정의 한 메소드를 override 한다고 할때
	 * throws로 정의가 가능하다(이때는 Exception이 없음)
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

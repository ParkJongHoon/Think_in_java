package org.uengine.Chap07.Interfaces.Name_collisions_when_combining_interfaces;

public class C5 extends C implements I2 { //I1 {

	/*
	 * C의 f()와 I1의 f()가 리턴 타입이 다르면 오류 메시지가 뜬다
	@Override
	public void f() {}
*/
@Override
public int f(int i) {
	// TODO Auto-generated method stub
	return 0;
}

}

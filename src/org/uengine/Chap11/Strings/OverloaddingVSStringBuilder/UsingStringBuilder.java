package org.uengine.Chap11.Strings.OverloaddingVSStringBuilder;

import java.util.Random;

/**

작성일: 2017-02-07
작성자: 박종훈
작성내용: StringBuilder에 사용법
StringBuilder는 java SE5에서 소개되었다.

기능은 아래와 같습니다
append(String str) : 문자열 뒤에 str을 덧붙임
insert(int offset, String str) : 문자열의 offset위치에 str을 삽입
delete(int start, int end) : start부터 end -1 까지의 부분 문자열을 삭제
deleteCharAt(int index) :  index 위치에 있는 하나의 문자를 삭제
length() : 버퍼의 문자열 길이를 int타입의 값으로 리턴하는 함수
toString() : 버퍼의 문자열을 String 객체로 만들어서 리턴하는 함수 
capacity() : StringBuffer(Builder)객체의 버퍼 크기를 int 타입의 값으로 리턴 (버퍼의 크기를 확인하고자 할때 사용) 
예) int bufsize = sb.capacity();  
ensureCapacity(int minimumCapacity) : 버퍼 크기를 입력받은 만큼 늘린다
trimToSize() : 문자의 수에 맞게 적당한 크기로 버퍼를 줄인다
 */

public class UsingStringBuilder {
	public static Random rand = new Random(47);
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		for(int i = 0; i <25; i++){
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length() -2, result.length());
		result.append("]");
		return result.toString();
	}
	public static void main(String[] args){
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}

}

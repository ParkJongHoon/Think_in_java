package org.uengine.Chap11.Strings.Reqular_expressions.creating_reqular_expressions;

public class Rudolph {

	/**
	 * 작성일: 2017-03-22
	 * 작성자: 박종훈
	 * 작성내용: String.matches()를 이용한 문자 비교값 출력
	 * -> Reqular_expressions를 이용하여 문자표현의 scope를 정의함
	 * 1) Rudolph : 일반문자를 표현
	 * 2) [rR]udolph: 맨 앞글자가 'r' 또는 'R' 이며 나머지 글자는 'udolph' 라는 표현
	 * 3) [rR][aeiou][a-z]ol.*:  맨 앞글자가 'r' 또는 'R' 이며 두번째 글자는
	 * 'a', 'e', 'i', 'o', 'u' 중 한 글자이고, 세 번째 글자는 a부터 z까지 문자 중 한 글자이고
	 * 넷번째 다섯번째 글자는 'ol'이면서 나머지 뒷문자는 상관없는 문자로 표현
	 * 4) R.*: 맨 앞글자가 'R'이면 됨
	 * 
	 * 
	 */
	public static void main(String[] args) {
		for(String pattern : new String[]{
				"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"
		})
			System.out.println("Rudolph".matches(pattern));

	}

}

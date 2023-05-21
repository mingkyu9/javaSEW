package section15;
/*
 * String 클래스
 * 자바에서 문자열을 다루기 위해 사용되는 내장 클래스
 * 'java.lang' 패키지에 포함
 * 
 * 불변(immutable)의 객체-생성된 후 메모리에서 문자열 값이 변경되지 않는다.
 * 						변경 불가능 객체
 * 
 * 	1.메모리 절약
 * 	2.보안성 UP
 * 	3.Thread Safe
 * 
 * StringBuffer 
 * 문자열을 동적으로 다루기위한 클래스
 * Thread Safe O
 * 
 * StringBuilder //멀티 스레드 할게 아니면 얘가 더 빠름 그러나 실무엔 StringBuffer를 더 많이 씀
 * 문자열을 동적으로 다루기 위한 클래스
 * Thread Safe X
 */
public class JavaLangClass03 {

	public static void main(String[] args) {
		String str1="ABC";
		String str2="ABC";
		String str3=new String("ABC");
				
		if(str1.equals(str3)) { //값 비교 문자열은 대부분 equals 씀
			System.out.println("str1 과 str3는 같다");
		}
		else {
			System.out.println("str1 과 str3는 다르다");
		}
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		System.out.println("======================================");
		
		if(str1==str2) {
			System.out.println("str1 과 str2는 같다");
		}
		else {
			System.out.println("str1 과 str2는 다르다");
		}
		
		if(str1==str3) { //주소값 비교
			System.out.println("str1 과 str3는 같다");
		}
		else {
			System.out.println("str1 과 str3는 다르다");
		}
		System.out.println("============================");
		System.out.println(System.identityHashCode(str1));
		str1="def";
		System.out.println(System.identityHashCode(str1));
		
		//문자열을 동적으로 다루기위한 클래스
		StringBuffer sb=new StringBuffer();
		sb.append("abc");
		System.out.println("sb: "+sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println("sb: "+sb);
		System.out.println(System.identityHashCode(sb));
		
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append("abc");
		sBuilder.append("def");
		System.out.println(System.identityHashCode(sBuilder));
		
	}
}


package section02;

public class Variable06 {
/*
 * 5. String 형 (문자열)
 * 문자열을 저장할 수 있다.
 * 참조형 
 * 선언 방법
 * 	String 변수명;
 * 
 * 기본형 - boolean, char , byte, short, int , long ,float, double
 * 참조형 - 기본형을 제외한 모든 객체(클래스 코드로 되어있다)
 * 		주소 값을 전달
 * 		속성(값-변수), 기능(메소드)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="안녕하세요.";
		
		System.out.println("str: "+str);
		
		String hello="hello";
		System.out.println("1번 인덱스: "+hello.charAt(1));
		System.out.println("2번 인덱스부터 4번 인덱스까지: "+hello.substring(2,4));
		
		String addr="서울 특별시 서대문구 신촌";
		boolean isContain=addr.contains("특별시"); //contains 있는지 없는지 있으면 True
		if(isContain) {
			System.out.println("특별시민 입니다!!");
		}
	}

}

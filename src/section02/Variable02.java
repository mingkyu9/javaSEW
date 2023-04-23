package section02;
/*
 * 2. 문자형 (char)
 * 데이터를 작음 따음표 ' ' 로 감싼다 . ex) 'A' ,'가'
 * 
 * 선언 방법 
 * char 변수명;
 */
public class Variable02 {

	public static void main(String[] args) {
		char ch1='A';
		System.out.println("char 형 변수에 저장된 문서: "+ch1);
		
		char ch2='朴';
		char ch3='뷁';
		
		int num=ch1; // cha형을 int 형으로 형 변환
		System.out.println("대문자 A에 해당하는 숫자코드 : "+num);
		
		char ch4=66;
		System.out.println("숫자 66에 해당하는 문자: "+ch4);
		
		int num2=110;
		char ch5=(char)num2; // int형을 char 형으로 강제 형변환
		System.out.println(ch5);

	}

}

package section02;
/*
 * System.out.printf() : 문자열을 서식 문자를 이용해 형식화된 내용 출력 행 바꿈 X
 */
public class ConsolePrint {
	public static void main(String[] args) {
		System.out.print("Welcom.");
		
		System.out.println("java World");
		
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 4,22);
		
		System.out.printf("%d은 첫번재 ,%f은 두번째, %s은 세번째",1,2.0,"셋");
	}
}

/*
 * %s :문자열 //여러개의 문자
 * %c :문자 //하나의 문자 
 */
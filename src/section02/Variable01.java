package section02;
/*
 * 1. 논리형(boolean)
 * true, false 두가지 값을 가지는 기본 자료형
 * 
 * 선언방법
 * boolean 변수명;
 */
public class Variable01 {

	public static void main(String[] args) {
		//논리형 변수 선언하기
		boolean isWait;
		//선언한 변수에 값 대입하기
		isWait=true;
		//저장된 값을 문자열로 출력
		System.out.println("논리형 변수에 지정된 값: "+isWait);
		
		//선언과 동시 대입
		boolean isRun=false;
		isRun= true;
		
		System.out.println(isRun);
	}

}

/*
 * syso는 System.out.println()
 */

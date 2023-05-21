package section14;

import java.nio.file.spi.FileSystemProvider;

public class ExceptionClass03 {
/*
 * try-catch-finally
 * 
 * finally 
 * 예외 발생 여부와 관계없이 항상 실행되는 코드블록
 */
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		int result=0;
		
		try {
			System.out.println("DB를 연결합니다");
			result=num1/num2;
			System.out.println("result :"+result);
		}catch(Exception e) {
			System.out.println("에외가 발생하였습니다");
		}finally {
			System.out.println("DB 연결 해제합니다");
		}
	}

}

package section14;

import section14.access1.NumberPrinter;

public class ExceptionClass05 {
/*
 * throws
 * 자바에서 메소드나 생성자가 예외를 던질 수 있음을 선언하는 메소드
 * 메소드가 예외를 처리하지 않고 해당 예외를 호출한 곳으로 넘기고자 할 때 사용
 */
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter np=new NumberPrinter();
		
		//첫번째 예외처리 try ~ catch
		
//		try {
//			np.printNumber(); //Checked Exception 예외처리 필수
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} 
		//두번째 예외처리 throws
		np.printNumber();
		
		//강제로 익셉션 발생시키기
		throw new NullPointerException(); 
	}

}

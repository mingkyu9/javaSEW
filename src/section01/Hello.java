package section01;
/*여러 줄 주석
 * 
 *
 */

public class Hello {

	public static void main(String[] args) {
		// 한줄 주석
		System.out.println("Hello Java!");
		
		printNum(422);

	}
	/**
	 *auth : 박민규
	 *생성일 : 2023.04.22
	 * printNum -입력받은 정수 출력
	 * @param num
	 */
	public static void printNum(int num) {
		System.out.println("num: "+num);
	}
}

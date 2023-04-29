package section03;
/*
 * 6. 비트 연산자
 * 	2진수로 표현된 두 비트 연산자
 * 
 * &: 대응 되는 비트가 모두 1이면 1을 반한
 * | : 하나라도 1이면 1
 * ^: 대응되는 비트가 서로 다르면 1을 반환
 * ~: 비트가 1이면 0. 0이면 1로 반전
 * 
 * 7. 쉬프트 연산자
 * <<: 지정한 수만큼 비트들을 전부 왼쪽으로 이동시킴( left shift 연사자)
 * >>: 부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴(right shift 연산자)
 */
public class Operator06 {

	public static void main(String[] args) {
		int num1=3; // 0 0011
		int num2=5; // 0 0101
		
		System.out.println("num1 & num2: "+(num1 & num2));
		System.out.println("num1 | num2: "+(num1 | num2));
		System.out.println("num1 ^ num2: "+(num1 ^ num2));
		System.out.println("~num1 "+~num1);
		
		int x,y;
		x=3; //0011
		y=x<<2; // 1100
		System.out.printf("%d <<2 = %d\n ",x,y);
		y=x>>2; // 0011 -> 0000 부호비트는 쉬프트 영향 X
		System.out.printf("%d >>2 = %d\n ",x,y);
	}

}

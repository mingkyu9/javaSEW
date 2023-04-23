package section02;
/*
 * 형 변환
 * 1. 업캐스팅 
 * -표현 범위가 더 큰 데이터형으로 변환
 * 자동으로 가능
 * 데이터 손실이 없음.
 * 
 * 2. 다운캐스팅
 * 표현 범위가 더 작은 데이터형으로 변환
 * 명시적으로 해야 됨. 
 * 데이터 손실이 있을 수 있음
 */
public class Variable07 {

	public static void main(String[] args) {
		// 업캐스팅
		byte iByte=10;
		int iInt=iByte;
		
		float iFloat=10.1f;
		double iDouble=iFloat;
		
		// 다운캐스팅
		float iFloat2=(float)iDouble;
		System.out.println("iFloat2: "+iFloat2);
		int iInt2=(int)iDouble;
		System.out.println("iInt2: "+iInt2);
		
	}

}

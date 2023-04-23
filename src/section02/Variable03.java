package section02;
/*
 정수형
 byte (1byte)
 short(2byte)
 int  (4byte) -2,147,483,648 + 2,147,483,647
 long (8byte)
 */
public class Variable03 {

	public static void main(String[] args) {
		byte iByte=10;
		short iShort=100;
		int iInt=1000;
		long iLong=10000;
		
		System.out.println("byte 형: "+iByte);
		System.out.println("short 형: "+iShort);
		System.out.println("int 형: "+iInt);
		System.out.println("long 형: "+iLong);
		
		// overflow 테스트
		iByte+=120;
		System.out.println("byte overflow: "+iByte);
		
	}

}
 
/*
 * ctrl D 줄삭제
 * ctrl alt 아래 복사
 */
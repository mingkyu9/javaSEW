package section05;

public class Loop02 {

	public static void main(String[] args) {
		int count=0;
		do { //조건이 맞지 않아도 최소 한번은 실행.
			System.out.println(count);
			count++;
		}while(count<100);
		
	}

}

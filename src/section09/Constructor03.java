package section09;

public class Constructor03 {

	public static void main(String[] args) {
		Phone p1=new Phone();
		p1.phoneInfo();
		
		
		Phone p2=new Phone("아이폰",14,"black");
		p2.phoneInfo();
		
		Phone p3=new Phone("아이폰",15,"white",200);
		p3.phoneInfo();
	}

}

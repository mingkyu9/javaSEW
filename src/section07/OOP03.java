package section07;

public class OOP03 {

	public static void main(String[] args) {
		Car car1=new Car();
		//Car 객체 멤버변수 접근 출력하기
		System.out.println(car1.wheel);
		
		car1.drive();
		car1.cleanUp();
		
		OOP03 oop03=new OOP03();
		oop03.add(1,3);

		sum(4,5);
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}

}

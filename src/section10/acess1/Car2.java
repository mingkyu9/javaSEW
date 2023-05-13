package section10.acess1;

public class Car2 {
	private Car2() {
		System.out.println("car2()생성자입니다");
	}
	// 팩토리 패턴(Factory Pattern)
	public static Car createCar() {
		return new Car2();
	}
}

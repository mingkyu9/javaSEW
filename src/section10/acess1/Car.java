package section10.acess1;

public class Car {

	private static Car car=-new Car();
	
	private Car() {
		System.out.println("car()생성자입니다");
	}
	public static Car getInstance() {
		return car;
	}
}

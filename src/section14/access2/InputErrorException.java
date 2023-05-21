package section14.access2;

public class InputErrorException extends Exception {
	private String message; //"입력값이 잘못되었습니다"
	
	//객체 생성시 실행
	public InputErrorException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return this.message; //return "입력값이 잘못되었습니다"
	}
}

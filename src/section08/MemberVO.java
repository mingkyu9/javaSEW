package section08;
/*
 * VO , DTO
 * 값 오브젝트로써 목적의 맞는 변수의 집합.
 * 주로 database 또는 네트워크 통신에서 사용
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고 외부로부터 내부를 감싸 숨겨 은닉
 */
public class MemberVO {
	private String id="1";
	
	 
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String password;
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

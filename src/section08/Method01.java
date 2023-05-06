package section08;
/*
 * 메소드(Method)
 * 프로그래밍에서 메소드는 하나의 특별한 목적의 작업을 수행하기 위해 설계된 프로그램 코드 집합.
 * 객체의 기능역할을 한다.
 * 
 * 메소드 구조
 * (접근제한자) (정적) 변환타입 메소드이름(매개변수 타입 매개변수명){
 * 		실행할 코드(명령문 집합)
 * 		return 반환값;
 * }
 */

public class Method01 {

	public static void main(String[] args) {
		hello();
		printName("피카츄");
		printMember("min1kyu","박민규",23);
		printMember("25","피카츄",32);
		String[] pokemons= {"피카츄","라이츄","파이리","꼬부기",};
		printPokemon(pokemons);
	}
	/*
	 * 1. 인자(매개변수) x 리턴 x
	 */
	public static void hello() {
		System.out.println("hello, world!");
	}
	/*
	 * 2. 인자 o 리턴 x ->인자값을 받아 실행하고 끝내는 메소드
	 */
	public static void printName(String name) {
		System.out.println("이름 "+name);
	}
	//3. 인자 o 여러타입 여러개 리턴 x
	public static void printMember(String id,String Name,int age) {
		System.out.println("ID : "+id);
		System.out.println("이름 : "+Name);
		System.out.println("나이 : "+age);
	}
	//4. 오버로딩(overloading)메소드
		public static void printMember(String id,String Name,String type) {
			System.out.println("ID : "+id);
			System.out.println("이름 : "+Name);
			System.out.println("타입 : "+type);
		}
	//5. 인자 0 배엽타입 리턴X
		public static void printPokemon(String[] mons) {
			for(String mon :mons) {
				System.out.println(mon);
			}
			for(int i=0;i<mons.length;i++) {
				String mon=mons[i];
				System.out.println(mon);
			}
		}
}

package section04;
//switch문 게임 개발할 때 많이 씀
public class Conditional02 {

	public static void main(String[] args) {
		int num=1;
		switch(num) {
		case 0:
			System.out.println("0입니다");
			break;
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		default:
			System.out.println("0~3이 아닙니다.");
			break;
		}
	}

}

package section14;

import java.util.Scanner;

import section14.access2.InputErrorException;

public class Exception06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		try {
			System.out.println("당신의 나이를 입력하세요");
			int age=scan.nextInt();
			if(age<0) {
				throw new InputErrorException("입력이 잘못되었습니다.");
			}
			if(age>19) {
				System.out.println("성인입니다");
			}
			else if(age>13) {
				System.out.println("청소년입니다.");
			}
			else if(age>6) {
				System.out.println("어린이입니다");
			}
			else {
					System.out.println("아동입니다");
				}
		}catch(InputErrorException e) { //InputErrorException e=new InputErrorException("입력이 잘못되었습니다.");
			System.out.println(e.getMessage());//System.out.println("입력값이 잘못되었습니다");
		}finally {
			if(scan!=null) {
				scan.close();
			}
		}
	}

}

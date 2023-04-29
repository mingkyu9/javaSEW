package section05;
/*
 * 반복문
 * 	특정한 부분의 코드가 반복적으로 수행할 수 있도록 하는 명령어
 * 
 * 1. while 문
 */
public class Loop01 {

	public static void main(String[] args) {
		/*int count=0;
		while(true) {
			System.out.println(count);
			++count;
			if(count==100)
				break;
			
		}*/
		
		/*
		int count=0;
		while(count<100) {
			System.out.println(count);
			 ++count;
		}
		*/
		/*
		int count=0;
		boolean isRun=true;
		while(isRun) {
			System.out.println(count);
			++count;
			if(count==100) {
				isRun=false;
			}
		}
		*/
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
			if(i==3)
				continue;
		}
	}

}

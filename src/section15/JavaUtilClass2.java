package section15;

import java.util.Random;

public class JavaUtilClass2 {

	public static void main(String[] args) {
		int[]iNum=new int[45];
		//1부터 45까지 배열에 값 저장
		for(int i=0;i<iNum.length;i++) {
			iNum[i]=i+1;
		}
		Random ran=new Random();
		//0부터 44까지 숫자 중 임의 값 반환
		for(int i=0;i<iNum.length;i++) {
			int changeIndex=ran.nextInt(45);
			
			int tmp=iNum[i];
			iNum[i]=iNum[changeIndex];
			iNum[changeIndex]=tmp;
		}
		for(int i=0;i<6;i++) {
			System.out.print(iNum[i]+" / ");
		}
	}

}

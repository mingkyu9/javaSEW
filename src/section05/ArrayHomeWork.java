package section05;

public class ArrayHomeWork {

	public static void main(String[] args) {
		int[][] nums=new int[7][7];
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j]=i * 7 + j + 1;
			}
			
		}
		for(int i=0;i<13;i++) {
			if(i<7) {
				for(int j=0;j<i+1;j++) {
					if(i%2==0) { // i값 짝수 열
						System.out.println(nums[i-j][j]+" ");
						
					}
					else { //i값 홀수 열.
						System.out.println(nums[j][i-j]+" ");
						
					}
				}
			}
			else {
				for(int j=0;i+j<13;j++) {
					if(i%2==0) {
						  
					}
				}
				
			}
			System.out.println();
		}
	}

}

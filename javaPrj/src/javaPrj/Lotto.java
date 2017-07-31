package javaPrj;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[6];
		
		Random rand = new Random();	//랜덤이라 하는 객체 생성
		
		for(int i=0;i<6;i++)
		{
			nums[i] = rand.nextInt(45)+1;		//정수범위로 숫자(1~45)를 뽑는다.
		}
		

		//초기상태의 로또
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
			
		}
		System.out.println();
		
		//무슨 과정???
		//만약 [0] 앞자리 > [1]뒷자리
		
/*		
 		temp= nums[0];
		nums[0]= nums[1];
		nums[1] = temp;
*/
		
		//버블정렬
		
		
		
		for(int j=0;j<5;j++)
		{
			int temp;
			
			for(int i=0;i<5-j;i++)
			{
				if(nums[i]>nums[i+1])
				{
					temp= nums[i];
					nums[i]= nums[i+1];
					nums[i+1] = temp;
				}	//가장 큰 1명을 뽑았다.
			}
		}//오름 차순 정렬
		
		
		//초기상태의 로또
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
		}
		
	}

}

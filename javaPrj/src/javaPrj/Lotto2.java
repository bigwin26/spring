package javaPrj;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[6];
		
		Random rand = new Random();	//랜덤이라 하는 객체 생성
		
		for(int i=0;i<6;i++)
		{
			nums[i] = rand.nextInt(45)+1;		//정수범위로 숫자(1~45)를 뽑는다.
			for(int j=0;j<6;j++)
			{
				if(nums[i]==nums[j])
				nums[i]=rand.nextInt(45)+1;	
				else break;
			}
		}
		

		//초기상태의 로또
		
		

	System.out.println("겹침 제거 :");
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
			
		}
		System.out.println();
		
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
		
		System.out.println("오름 차순 :");
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
		}
		
		
		
		
		
		for(int j=0;j<5;j++)
		{
			
			for(int i=0;i<5-j;i++)
			{
				if(nums[i]==nums[i+1])
				{
					nums[j] = rand.nextInt(45)+1;	
				}	
			}
		}//오름 차순 정렬
		
		
		
		
		
		
	}

}

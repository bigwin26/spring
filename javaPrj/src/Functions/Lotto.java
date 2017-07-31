package Functions;

import java.util.Random;

public class Lotto {


		
	public static void main(String[] args) {
		
		int[] nums = new int[6];
		
		Random rand = new Random();	//랜덤이라 하는 객체 생성
		
		//처음에는 큰 그림만 그린다.
		//카멜표기법으로 함수를 정의할 때 띄여쓰기부분에 대문자를 써준다.
		//1 로또번호 생성  = 출력되는 것 함수(입력값){              } // 이게 선언이자 정의
		genLotto(nums);
		
		//2 로또번호 출력
		printLotto(nums);
		
		//3 정렬
		sortLotto(nums);
		
		//4 출력
		printLotto(nums);
		
		
		/*
		//단위1. 로또번호 생성
		for(int i=0;i<6;i++)
		{
			nums[i] = rand.nextInt(45)+1;		//정수범위로 숫자(1~45)를 뽑는다.
		}
		

		//로또 번호 출력
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
			
		}
		System.out.println();
				
		//2. 오름차순 정렬
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
		}
		
		
		//3. 로또번호 출력
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
		}
		*/
	}

	private static void sortLotto(int[] nums) {		
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
	}
		
		
	}

	private static void printLotto(int[] nums) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
			
		}
		System.out.println();
		
	}

	private static void genLotto(int[] nums) {
		// TODO Auto-generated method stub

		Random rand = new Random();	//랜덤이라 하는 객체 생성
		for(int i=0;i<6;i++)
		{
			nums[i] = rand.nextInt(45)+1;		//정수범위로 숫자(1~45)를 뽑는다.
		}
		
	}


}

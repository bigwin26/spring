package structhred.data;

import java.util.Random;

public class LottoProgram {


		
	public static void main(String[] args) {
		
	//	int[] nums = new int[6];
		Lotto lotto = new Lotto();
		
		Random rand = new Random();	//랜덤이라 하는 객체 생성
		
		//1 로또번호 생성
		gen(lotto);
		
		//2 로또번호 출력
		print(lotto);
		
		//3 정렬
		sort(lotto);
		
		//4 출력
		print(lotto);
		
		
		
	}

	private static void sort(Lotto lotto) {		
		int[] nums = new int[6];
		nums = lotto.nums;
		
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

	private static void print(Lotto lotto) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",lotto.nums[i]);
			
		}
		System.out.println();
		
	}

	private static void gen(Lotto lotto) {
		// TODO Auto-generated method stub

		Random rand = new Random();	//랜덤이라 하는 객체 생성
		for(int i=0;i<6;i++)
		{
			lotto.nums[i] = rand.nextInt(45)+1;		//정수범위로 숫자(1~45)를 뽑는다.
		}
		
	}


}

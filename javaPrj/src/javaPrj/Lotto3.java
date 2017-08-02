package javaPrj;

import java.io.IOException;
import java.util.Random;

public class Lotto3 {

	public static void main(String[] args){

		int[] nums = new int[6];

		Random  rand = new Random();

		for(int i=0; i<6; i++)
		{
			nums[i] = rand.nextInt(45)+1;
		}
		//초기 상태의 로또
		for(int i=0; i<6; i++)
			System.out.printf("%d ",nums[i]);
		System.out.println();

		//중복 제거
		for(int i=0; i<6; i++)
			for(int j=0; j<6 && i!=j ; j++)
			{
				if(nums[i] == nums[j]) {
					if(nums[i]<45)
						nums[i]=nums[i]+1;
					else
						nums[i]=1;	
					j=0;
				}
			}	

		//정렬
		for(int j=0; j<5; j++)
			for(int i=0; i<5-j; i++)
			{
				int temp;
				if(nums[i] > nums[i+1]) {
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			}

		//최종 상태의 로또
		for(int i=0; i<6; i++)
			System.out.printf("%d ",nums[i]);
	}

}

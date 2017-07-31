package Functions;

import java.io.IOException;
import java.util.Scanner;

class 이용주 {
	public static void main(String[] args) throws IOException {
		int num = 0;
		int count = 0;
		int total= 0;
		float avg = 0;
		int select=1;
		Scanner scan = new Scanner(System.in);

	
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         성적을 입력하세여                       │");
		System.out.println("└───────────────────────────────┘");
		
		
		
		끝:
		while(true)
		{
			switch(select)
			{
			case 0:

				System.out.printf("총점 : %d, 평균 : %6.2f",total,avg);
				break 끝;
			case 1:
				
				do{
					
					if(num<0||num>100)
						System.out.println("유효하지 않은 범위입니다.");
					System.out.print("\t성적 :  \n");
					num = scan.nextInt();
				}while(num<0||num>100);
				count += 1;
				total += num;
				avg= total/count;
				System.out.printf("%d점을 입력하였습니다. 계속하시겠습니까? 예:1 아니오:0",num);
				
				do{
					
					if(select<0||select>1)
						System.out.println("유효하지 않은 범위입니다.");
					select = scan.nextInt();
				}while(select<0||select>1);
				
				break;
				
			
			
			
			}
		}
	}

}

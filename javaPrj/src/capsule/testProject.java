package capsule;

import java.util.Scanner;

public class testProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명의 키의 평균을 구하라\
		
		Scanner scan = new Scanner(System.in);
		
		int menu=0;		
		test[] tall = new test[5];
		
		for(int i=0;i<5;i++) 
		{
			tall[i] = new test();
		}
		
		//매뉴
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         					   메인 메뉴                                    │");
		System.out.println("└───────────────────────────────┘");
		
		System.out.println("\t 1.성적 입력  ");
		System.out.println("\t 2.성적 출력");
		System.out.println("\t 3.종료");
		System.out.print("\t 선택 > ");
		menu = scan.nextInt();
		
		end:
		while(true) {
			switch(menu) {
				case 1:
					
					int count = 5;
					for(int i=0;i<5;i++) 
					{	
						
						printf("키를 입력하세요!! %d명 남음",count-i);
					}
								
					break;
				case 2:
					
					
					break;
				case 3:
					
					
					break end;
			}
			
			
		}
		
		//키값 입력 띄어쓰기
		
		
		//평균 합
	}

	private static void printf(String string, int i) {
		// TODO Auto-generated method stub
		
	}

}

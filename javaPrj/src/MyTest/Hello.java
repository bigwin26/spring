package MyTest;

import java.io.IOException;
import java.util.Scanner;

class Hello {
	public static void main(String[] args) throws IOException {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total;
		int menu;
		float avg;

		Scanner scan = new Scanner(System.in);
		// 정수라는 형식을 내부적으로 정해 놓음

		/*
		 * //System.out.println(total); //System.out.println(avg); System.out.write(51);
		 * System.out.write(52); System.out.write(53); //버퍼가 일정 크기일때 출력을 하게됨
		 * System.out.write('3'); System.out.write('3'+1); System.out.write('3'+2);
		 * //''로 감싸면 거기 안의 코드를 알려달라는 의미이다. //3 숫자 '3'문자값 System.out.flush(); //버퍼가 일정
		 * 크기일때 write된 코드를 출력을 하게됨. 숫자가 아니라 문자의 의미를 가지고있다.(오일)
		 */
		나돌아갈래 :
		while (true) 
		{
			
			
			
			
			System.out.println("┌───────────────────────────────┐");
			System.out.println("│         메인 메뉴                                    │");
			System.out.println("└───────────────────────────────┘");

			System.out.println("\t 1.성적 입력  ");
			System.out.println("\t 2.성적 출력");
			System.out.println("\t 3.종료");
			System.out.print("\t 선택 > ");
			menu = scan.nextInt();
			

			switch(menu)
			{
			

			
			case 1:
			
				System.out.println("┌───────────────────────────────┐");
				System.out.println("│         성적 입력                                   │");
				System.out.println("└───────────────────────────────┘");
				

				do{
					if(kor<0||kor>100)
						System.out.println("유효하지 않은 범위입니다.");
					
					System.out.print("\t국어 :  \n");
					kor = scan.nextInt();
				}while(kor<0||kor>100);
				
			
				do{
					if(eng<0||eng>100)
						System.out.println("유효하지 않은 범위입니다.");
					
					System.out.print("\t영어 :  \n");
					eng = scan.nextInt();
				}while(eng<0||eng>100);
				
				
				do{
					if(math<0||math>100)
						System.out.println("유효하지 않은 범위입니다.");
					
					System.out.print("\t수학 :  \n");
					math = scan.nextInt();
				}while(math<0||math>100);
				
				
				break;
			
			case 2:
			
				total = kor + eng + math;
				avg = total / 3;
				System.out.println("┌───────────────────────────────┐");
				System.out.println("│         성적 출력                                   │");
				System.out.println("└───────────────────────────────┘");
				
				for(int i= 0;i<3;i++){
				System.out.printf("국어 : %3d \n", kor);
				// 정수값일 때만 진수를 표기가 가능 %d 10진수, %c 문자, %s 문자열
				System.out.printf("영어 : %3d \n", eng);
				System.out.printf("수학 : %3d \n", math);
				System.out.printf("총점 : %3d \n", total);
				System.out.printf("평균 : %5.2f \n", avg);
			
				}
				break;
			

			case 3:
				break 나돌아갈래;
				
			default:
				System.out.println("잘못되었습니다. \n번호는 1부터 3까지만 사용가능");
			}
		}
	}

}

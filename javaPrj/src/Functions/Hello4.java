package Functions;

import java.io.IOException;
import java.util.Scanner;

class Hello4 {
	public static void main(String[] args) throws IOException {
		//모듈화 하여서 변수를 지역적으로 선언한다. 사용부분 앞부분에 선언하는 것이 좋다.
		//업무의 단위가 전역인경우 위에있어야 하지만 , 지역변수로 선언을 하기 위해서는 그 지역에서 선언하자.
		//임시로 사용하는지? 아니면 그 값을 공유하는지..
		/*int kor = 0;
		int eng = 0;
		int math = 0;
		
		int total=0;
		int menu;
		float avg;
		*/
		int menu;
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		//배열 선언 [0]~[2]
		
		
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
			System.out.println("│         					   메인 메뉴                                    │");
			System.out.println("└───────────────────────────────┘");

			System.out.println("\t 1.성적 입력  ");
			System.out.println("\t 2.성적 출력");
			System.out.println("\t 3.종료");
			System.out.print("\t 선택 > ");
			menu = scan.nextInt();
			

			switch(menu)
			{
			

			
			case 1:
			{	//중괄호를 넣어주면 변수의 생명주기가 정해진다. 
				int kor = 0;
				int eng = 0;
				int math = 0;

				System.out.println("┌───────────────────────────────┐");
				System.out.println("│         							성적 입력                                   │");
				System.out.println("└───────────────────────────────┘");
				
				//임시변수로 유효성 검사를 한 뒤 변수를 사용
				
				
				for(int i=0;i<3;i++) {
					
					
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

					kors[i] = kor;
					engs[i] = eng;
					maths[i] = math;
					
					
			}

/*				for(int i=0;i<3;i++)
					do{
						if(kors[i]<0||kors[i]>100)
							System.out.println("유효하지 않은 범위입니다.");
						
						System.out.print("\t국어 :  \n");
						kors[i] = scan.nextInt();
					}while(kors[i]<0||kors[i]>100);*/

/*				do{
					if(kor<0||kor>100)
						System.out.println("유효하지 않은 범위입니다.");
					
					System.out.print("\t국어 :  \n");
					kor = scan.nextInt();
				}while(kor<0||kor>100);
*/				
			

				
				
				break;
			}
			
			case 2:
			{
				int kor = 0;
				int eng = 0;
				int math = 0;
				int total=0;
				float avg;
		
				
				
				
				System.out.println("┌───────────────────────────────┐");
				System.out.println("│         											성적 출력                                   │");
				System.out.println("└───────────────────────────────┘");
				
				for(int i= 0;i<3;i++){
					kor = kors[i];
					eng = engs[i];
					math = maths[i];
					
				total = kor + eng + math;
				avg = (float)total / 3;
				System.out.printf("국어 : %3d \n", kor);
				// 정수값일 때만 진수를 표기가 가능 %d 10진수, %c 문자, %s 문자열
				System.out.printf("영어 : %3d \n", eng);
				System.out.printf("수학 : %3d \n", math);
				System.out.printf("총점 : %3d \n", total);
				System.out.printf("평균 : %5.2f \n", avg);
	
				}
				break;
			}
			

			case 3:
				break 나돌아갈래;
				
			default:
				System.out.println("잘못되었습니다. \n번호는 1부터 3까지만 사용가능");
			}
		}
	}

}

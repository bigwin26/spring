package Functions;

import java.util.Scanner;

public class Hello5 {
	public static void main(String[] args) {
		// 성적관리 프로그램
		/*
		 * int[] kors = new int[3]; int[] engs = new int[3]; int[] maths = new int[3];
		 */

		// Exam exam = new Exam();
		// 앞에꺼는 int와 같은 자료형으로 알고있자.
		Exam[] exams = new Exam[3];

		for (int i = 0; i < 3; i++) {
			exams[i] = new Exam();

		}
		int menu=0;

		// 1메인매뉴 출력, 선택
		끝: while (true) {
			menu = inputMenu(menu);

			switch (menu) {
			case 1:
				inputExam(exams);
				break;
			case 2:
				printExam(exams);
				break;
			case 3:
				break 끝;
			}

		}

		//
	}

	

	private static int inputMenu(int menu) {

		int kor = 0;
		int eng = 0;
		int math = 0;
		Scanner scan = new Scanner(System.in);

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

			exams[i].kors = kor;
			engs[i] = eng;
			maths[i] = math;
			
			
	
		
		

		
		return menu;
	}



	public static void printExam(Exam[] exam) {

///////
		
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         성적 출력             │");
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
		
		
		
		
		
		
		
		
		
		
		
		
/////////
	}

	public static void inputExam(Exam[] exam) {

		switch (menu) {

		case 1: { // 중괄호를 넣어주면 변수의 생명주기가 정해진다.
			int kor = 0;
			int eng = 0;
			int math = 0;

			System.out.println("┌───────────────────────────────┐");
			System.out.println("│         							성적 입력                                   │");
			System.out.println("└───────────────────────────────┘");

			// 임시변수로 유효성 검사를 한 뒤 변수를 사용

			for (int i = 0; i < 3; i++) {

				do {
					if (kor < 0 || kor > 100)
						System.out.println("유효하지 않은 범위입니다.");

					System.out.print("\t국어 :  \n");
					kor = scan.nextInt();
				} while (kor < 0 || kor > 100);

				do {
					if (eng < 0 || eng > 100)
						System.out.println("유효하지 않은 범위입니다.");

					System.out.print("\t영어 :  \n");
					eng = scan.nextInt();
				} while (eng < 0 || eng > 100);

				do {
					if (math < 0 || math > 100)
						System.out.println("유효하지 않은 범위입니다.");

					System.out.print("\t수학 :  \n");
					math = scan.nextInt();
				} while (math < 0 || math > 100);

				kors[i] = kor;
				engs[i] = eng;
				maths[i] = math;

			}

		}

		}
	}
}
//////
// 소스를 완성시키는 것!! 숙제

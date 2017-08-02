package MyTest;

import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int math = 0;
		int kor = 0;
		int eng = 0;

		int menu = 0;
		exit:
		while (true) {
			System.out.println("────────────────────────");
			System.out.println("│       매뉴 입력      │");
			System.out.println("\t1. 점수 입력");
			System.out.println("\t2. 점수 출력");
			System.out.println("\t3. 종료");
				menu = scan.nextInt();
			
			switch (menu) {
			case 1: 

				System.out.println("국어점수 입력 :");
				do {
					if (kor < 0 || kor > 100)
						System.out.println("잘못입력하셧습니다.");
					kor = scan.nextInt();
				} while (kor < 0 || kor > 100);
				

				System.out.println("영어점수 입력 :");
				do {
					if (eng < 0 || eng > 100)
						System.out.println("잘못입력하셧습니다.");
					eng = scan.nextInt();
				} while (kor < 0 || kor > 100);
				

				System.out.println("수학점수 입력 :");
				do {
					if (math < 0 || math > 100)
						System.out.println("잘못입력하셧습니다.");
					kor = scan.nextInt();
				} while (math < 0 || math > 100);
				
		

				break;
				
			case 2:

				int total = kor+eng+math;
				float avg = total/4.0f;
				System.out.println("총점 :"+total);
				System.out.println("평균 :"+avg);
				
				

			case 3:
				break exit;

			default:
				break;
			}

		}

	}

}

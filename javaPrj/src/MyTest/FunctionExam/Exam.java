package MyTest.FunctionExam;

import java.util.Scanner;

public class Exam {
	int kors;
	int engs;
	int maths;

	private static int printMenu(int menu) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         메인 메뉴            │");
		System.out.println("└───────────────────────────────┘");

		System.out.println("\t 1.성적 입력  ");
		System.out.println("\t 2.성적 출력");
		System.out.println("\t 3.종료");
		System.out.print("\t 선택 > ");
		menu = scan.nextInt();
		return menu;
	}
	
}

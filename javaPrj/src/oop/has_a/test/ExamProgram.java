package oop.has_a.test;

import java.util.Scanner;

public class ExamProgram {
	public static void main(String[] args) {
		Exam exam = new Exam();
		ExamConsole console = new ExamConsole();

		console.setExam(exam);

		int menu = 0;
		while (true) {
			menu = input(menu);

			switch (menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.output();
				break;

			default:
				break;
			}
		}
	}

	private static int input(int menu) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         					   메인 메뉴                                    │");
		System.out.println("└───────────────────────────────┘");

		System.out.println("\t 1.성적 입력  ");
		System.out.println("\t 2.성적 출력");
		System.out.println("\t 3.종료");
		System.out.print("\t 선택 > ");
		menu = scan.nextInt();
		return menu;
	}
}

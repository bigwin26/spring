package oop;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		Exam exam = new Exam();//어떤 형식을 실체화할때 괄호()는 막 만들어진 객체를 초기화를 위해서 사용
		int menu = 0;

		// 1메인매뉴 출력, 선택
		끝: while (true) 
		{
			menu = inputMenu(menu);

			switch (menu) 
			{
				case 1:
					exam.input();
					break;
				case 2:
					exam.print();
					break;
				case 3:
					break 끝;
			}

		}

	}

	// 게체의 행위가 나타나지 않기 때문에 바꿀 필요가 없다.
	public static int inputMenu(int menu) {
		
		Scanner scan = new Scanner(System.in);
		
				
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│      메인 메뉴                │");
		System.out.println("└───────────────────────────────┘");

		System.out.println("\t 1.성적 입력  ");
		System.out.println("\t 2.성적 출력");
		System.out.println("\t 3.종료");
		System.out.print("\t 선택 > ");
		
		menu = scan.nextInt();
		
		return menu;
	}

}

package MyTest.FunctionExam;

import java.awt.Window;
import java.io.IOException;
import java.util.Scanner;

import Functions.Exam;

public class FunctionExam {
	public static void main(String[] args) {

		Exam[] exams = new Exam[3];
		
		for(int i=0;i<3;i++) {
			exams[i]= new Exam();
		}
		

		Scanner scan = new Scanner(System.in);

		나돌아갈래: while (true) {

			int menu=0;
			
			menu = print(menu);

			switch (menu) {

			case 1:Exam.input(exams);
				break;

			case 2:Exam.print(exams);
				break;

			case 3:
				break 나돌아갈래;

			default:
				System.out.println("잘못되었습니다. \n번호는 1부터 3까지만 사용가능");
			}
		}
	}

	private static int print(int menu) {
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

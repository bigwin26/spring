package oop.collec;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		///////////Exam exam = new Exam(1,1,1);//어떤 형식을 실체화할때 괄호()는 막 만들어진 객체를 초기화를 위해서 사용
		
		//compossition : 구성 - 일체형
		//ExamConsole console = new ExamConsole();
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		//association : 연계 - 조립형 -생성자를 이용하기 때문에 부품을 제품에 꽃아넣음 근데 바꿔낄 수 없음
		//Exam exam = new Exam();
		//ExamConsole comsole = new ExamConsole(exam);

		////////////////////////////////////////////////////////////////////////////////////////////////////
		//association : 연계 - 조립형 -생성자를 이용하기 때문에 부품을 제품에 꽃아넣음 바꿀 수 있다.
		Exam exam = new Exam();
		
		//dependency 부품 : 객체는 상대적으로 다 부품이다.
		//injection 결합
		//dependency injection을 하는 것.
		ExamConsole console = new ExamConsole();
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
	
		
		int menu = 0;

		// 1메인매뉴 출력, 선택
		끝: while (true) 
		{
			menu = input(menu);

			switch (menu) 
			{
				case 1:
					console.input();
					break;
				case 2:
					console.print();
					break;
				case 3:
					break 끝;
			}
			
		}
		
	}

	// 게체의 행위가 나타나지 않기 때문에 바꿀 필요가 없다.
	public static int input(int menu) {
		
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

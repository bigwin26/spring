package MyTest.FunctionExam.A;

import java.util.Scanner;

public class ExamProgramA {






	public static void main(String[] args) {
		//성적관리 프로그램
/*		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];*/
		
		//Exam exam = new Exam();
		//앞에꺼는 int와 같은 자료형으로 알고있자.
		ExamA[] exams = new ExamA[3];
		
		for(int i=0;i<3;i++)
		{
			exams[i] = new ExamA();
		}
		
		int menu = 0;
		
		
		//1메인매뉴 출력, 선택
		끝:
		while(true)
		{
			menu = inputMenu(menu);
			
			
			switch(menu)
			{
			case 1:
				ExamA.inputExam(exams);
				break;
			case 2:
				ExamA.printExam(exams);
				break;
			case 3:
				break 끝;
			}
			
			
		}
		
		
		
		
	}

	public static int inputMenu(int menu) {
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
	




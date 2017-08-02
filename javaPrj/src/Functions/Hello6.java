package Functions;

import java.util.Scanner;

public class Hello6 {
	public static void main(String[] args) {
		//성적관리 프로그램
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		int menu;
		
		
		//1메인매뉴 출력, 선택
		끝:
		while(true)
		{
			menu = inputMenu();
			
			
			switch(menu)
			{
			case 1:
				inputExam(kors,engs,maths);
				break;
			case 2:
				printExam(kors,engs,maths);
				break;
			case 3:
				break 끝;
			}
			
			
		}
		
		
		
		//
	}



	private static int inputMenu() {
		// TODO Auto-generated method stub
		return 0;
	}



	private static void printExam(int[] kors, int[] engs, int[] maths) {
		
	}

	private static void inputExam(int[] kors, int[] engs, int[] maths) {
		
	}
	



}

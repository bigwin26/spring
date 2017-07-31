package oop.collec.sizeup;

import java.util.Scanner;

public class ExamConsole {

	private Exam[] exams;
	private int index;
	private int capacity;
	// 참조형 배열 3개를 만들었다. 저장 공간을 만들어야하는데,\

	public ExamConsole() {
		exams = new Exam[3];
		index = 0;
		capacity = 3;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////

	public void input() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// 중괄호를 넣어주면 변수의 생명주기가 정해진다.

		// 외부 변수 참조하는 방법

		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         	성적 입력           │");
		System.out.println("└───────────────────────────────┘");

		// 임시변수로 유효성 검사를 한 뒤 변수를 사용

		int kor = 0;
		int eng = 0;
		int math = 0;

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

		Exam exam = new Exam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
//////////////////////////////////////////////////////////////////////////////////////////////////		
	
		if (index >= capacity/* 공간이 부족하면 */) {
			/*
			 * 눌려준다. 새로운 배열을 반든다.+2 :temp 이동한다. temp[0] =exams[0]; 새 배열을 exams라고 호칭한다 exams
			 * = temp;
			 */
			//1. 새로운 배열을 생성 +2
			Exam[] temp = new Exam[capacity+2];
			//2. 새로운 배열로 이동
			for (int i = 0; i < exams.length; i++)
				temp[i] = exams[i];
			//3.새로운 배열을 exam이라한다.
			exams = temp;
			//4.새로운 용량을 표기한다.
			capacity +=2;
		}
		
		exams[index++] = exam;

	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void print() {

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│			성적 출력           │");
		System.out.println("└───────────────────────────────┘");

		for (int i = 0; i < index; i++) {

			Exam exam = exams[i];
			int kor = exam.getKor();
			int math = exam.getMath();
			int eng = exam.getEng();

			int total;
			float avg;

			total = exam.total();// kor + eng + math;
			avg = exam.avg();// (float) total / 3;

			System.out.printf("국어 : %3d \n", kor);
			System.out.printf("영어 : %3d \n", eng);
			System.out.printf("수학 : %3d \n", math);
			System.out.printf("총점 : %3d \n", total);
			System.out.printf("평균 : %5.2f \n", (float) avg);
		}

	}
}

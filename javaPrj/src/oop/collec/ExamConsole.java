package oop.collec;

import java.util.Scanner;

public class ExamConsole {

	private Exam[] exams = new Exam[3];
	private int index;
	// 참조형 배열 3개를 만들었다. 저장 공간을 만들어야하는데,\

	public ExamConsole() {
		for (int i = 0; i < 3; i++) {
			exams[i] = new Exam();
			index = 0;
		}
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

			Exam exam = new Exam();
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);

			exams[index++] = exam;

		}
	}

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

package oop.has_a.test;

import java.util.Scanner;

public class ExamConsole {
	private Exam exam;

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         							성적 입력                                   │");
		System.out.println("└───────────────────────────────┘");

		// 임시변수로 유효성 검사를 한 뒤 변수를 사용

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

			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
		}
	}

	public void output() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg;

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│    성적 출력                  │");
		System.out.println("└───────────────────────────────┘");

		for (int i = 0; i < 3; i++) {
			kor = exam.getKor();
			eng = exam.getEng();
			math = exam.getMath();

			total = kor + eng + math;
			avg = (float) total / 3;
			System.out.printf("국어 : %3d \n", kor);
			// 정수값일 때만 진수를 표기가 가능 %d 10진수, %c 문자, %s 문자열
			System.out.printf("영어 : %3d \n", eng);
			System.out.printf("수학 : %3d \n", math);
			System.out.printf("총점 : %3d \n", total);
			System.out.printf("평균 : %5.2f \n", (float) avg);
		}

	}

}

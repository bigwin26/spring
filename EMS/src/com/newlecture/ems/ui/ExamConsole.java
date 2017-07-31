package com.newlecture.ems.ui;

import java.util.Scanner;

import com.newlecture.ems.entity.Exam;

public abstract class ExamConsole {

	// 클래스 안에 연산을 하지 않는다. 초기화만 가능. 근데 이제는 지원 됨

	////////////////////////////////////////////////////////////////////
	// compossition : 구성 - 일체형
	// 일체형으로 개체를 가져다쓴다.(알아서 조립함, 사용자(main)가 신경쓸 필요 x)

	private Exam exam = newExam();

	public abstract Exam newExam();

	/*
	 * 원래 이렇게 선언해야함. private Exam exam;
	 * 
	 * public ExamConsole() { // -> // private Exam exam = new Exam(); // TODO
	 * Auto-generated constructor stub exam = new Exam(); }
	 */

	////////////////////////////////////////////////////////////////////////////////////////////////////
	// association : 연계 - 조립형
	// 조립형: 제품을 만들때 조립식으로 가져다 쓴다.(과정이 외부에서 일어남)
	/*
	 * private Exam exam;
	 * 
	 * //association : 연계 - 생성자를 이용해서 필요할 때 마다 바꿀 수 있다.
	 *  public void setExam(Exam exam) { this.exam = exam; }
	 */

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
		//추가 과목 입력
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		

	}

	

	//protected abstract void oninput(Exam exam);

	public void print() {
		int kor = exam.getKor();
		int math = exam.getMath();
		int eng = exam.getEng();

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│			성적 출력           │");
		System.out.println("└───────────────────────────────┘");

		int total;
		float avg;

		total = exam.total();// kor + eng + math;
		avg = exam.avg();// (float) total / 3;

		System.out.printf("국어 : %3d \n", kor);
		System.out.printf("영어 : %3d \n", eng);
		System.out.printf("수학 : %3d \n", math);
		onoutput(exam);
		System.out.printf("총점 : %3d \n", total);
		System.out.printf("평균 : %5.2f \n", (float) avg);

	}

	protected abstract void onoutput(Exam exam);

}

import java.util.Scanner;

import opp.interf.Exam;


public class ExamProgramVer2 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub // Exam exam;//exam을 재사용 NewlecExam exam =
		 * new NewlecExam(); // 변수 선언
		 * 
		 * exam.setKor(30); 
		 * exam.setEng(30); 
		 * exam.setMath(30); 
		 * exam.setCom(30);
		 * 
		 * 
		 * System.out.println(exam.total()); 
		 * System.out.println(exam.avg());
		 */

		/*
		 * NewlecExamConsole consol = new NewlecExamConsole(); 
		 * consol.input();
		 * consol.print();
		 */
		NewLecExam exam = new NewLecExam(1,2,3,2);
		//AA a = new AA(); 인터페이스를 클래스에 구현
		
		//exam.setAvgListener(a);
		//exam.setAvgListener(exam);//구현한 곳 스스로를 넣음
		//내부클래스로 구현할 경우
		//NewLecExam.AAA1 a = exam.new AAA1(); //exam 객체를 참조하여 구현
		//System.out.println(exam.avg());
		System.out.println(exam.avg());//내부클래스로 구현
	}

}

import java.util.Scanner;

import opp.interf.Exam;


public class ExamProgramVer2 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub // Exam exam;//exam�� ���� NewlecExam exam =
		 * new NewlecExam(); // ���� ����
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
		//AA a = new AA(); �������̽��� Ŭ������ ����
		
		//exam.setAvgListener(a);
		//exam.setAvgListener(exam);//������ �� �����θ� ����
		//����Ŭ������ ������ ���
		//NewLecExam.AAA1 a = exam.new AAA1(); //exam ��ü�� �����Ͽ� ����
		//System.out.println(exam.avg());
		System.out.println(exam.avg());//����Ŭ������ ����
	}

}

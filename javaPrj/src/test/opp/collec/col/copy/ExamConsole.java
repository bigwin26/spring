package test.opp.collec.col.copy;

import java.util.Scanner;

import oop.collec.col.Exam;

public class ExamConsole {
	private ExamList exams;
	// ������ �迭 3���� �������. ���� ������ �������ϴµ�,\


	////////////////////////////////////////////////////////////////////////////////////////////////////

	public void input() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// �߰�ȣ�� �־��ָ� ������ �����ֱⰡ ��������.

		// �ܺ� ���� �����ϴ� ���

		Scanner scan = new Scanner(System.in);

		System.out.println("������������������������������������������������������������������");
		System.out.println("��         	���� �Է�           ��");
		System.out.println("������������������������������������������������������������������");

		// �ӽú����� ��ȿ�� �˻縦 �� �� ������ ���

		int kor = 0;
		int eng = 0;
		int math = 0;
		
			do {
				if (kor < 0 || kor > 100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");

				System.out.print("\t���� :  \n");
				kor = scan.nextInt();
			} while (kor < 0 || kor > 100);

			do {
				if (eng < 0 || eng > 100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");

				System.out.print("\t���� :  \n");
				eng = scan.nextInt();
			} while (eng < 0 || eng > 100);

			do {
				if (math < 0 || math > 100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");

				System.out.print("\t���� :  \n");
				math = scan.nextInt();
			} while (math < 0 || math > 100);

			Exam exam = new Exam();
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);

			exams.add(exam);

		}
	

	public void print() {

		System.out.println("������������������������������������������������������������������");
		System.out.println("��			���� ���           ��");
		System.out.println("������������������������������������������������������������������");

		for (int i = 0; i < exams.size(); i++) {

			Exam exam = exams.get(i);
			int kor = exam.getKor();
			int math = exam.getMath();
			int eng = exam.getEng();

			int total;
			float avg;

			total = exam.total();// kor + eng + math;
			avg = exam.avg();// (float) total / 3;

			System.out.printf("���� : %3d \n", kor);
			System.out.printf("���� : %3d \n", eng);
			System.out.printf("���� : %3d \n", math);
			System.out.printf("���� : %3d \n", total);
			System.out.printf("��� : %5.2f \n", (float) avg);
		}

	}
}

import java.io.Console;
import java.util.Scanner;

import opp.interf.Exam;
import opp.interf.ExamConsole;



public class NewlecExamConsole extends ExamConsole {

	private NewLecExam exam;
	// ���������� ��ü ����

	@Override
	public Exam newExam() 
	{
		// TODO Auto-generated method stub
		exam = new NewLecExam();
		return exam;
		// return new NewLecExam(0,0,0,0);
		// ��ü�� ���� ��ȯ ������ ����¿� ���� �� �ִ� �׸��� ��ȯ
		// �Է¹��� ���� ����, Ȯ���� �κ��� �ڽ��� ������ �� �� ����.

	}// ���븦 �Ѱ���

	@Override
	public void input() 
	{

		Scanner scan = new Scanner(System.in);

		super.input();

		int com = 0;

		do {
			if (com < 0 || com > 100)
				System.out.println("��ȿ���� ���� �����Դϴ�.");

			System.out.print("\t��ǻ�� :  \n");
			com = scan.nextInt();
		} while (com < 0 || com > 100);
		// �߰� ���� �Է�
		// ((NewLecExam)exam).setCom(com);
		// �� ��ȯ : ��ǻ�͸� �Ѱ��ش�.
		exam.setCom(com);
	}

	@Override
	protected void onoutput(Exam exam) 
	{
		// int com = ((NewLecExam)exam).getCom();
		int com = this.exam.getCom();
		System.out.printf("��ǻ�� : %3d \n", com);

	}

}

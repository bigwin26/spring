import java.io.Console;
import java.util.Scanner;

import opp.interf.Exam;
import opp.interf.ExamConsole;



public class NewlecExamConsole extends ExamConsole {

	private NewLecExam exam;
	// 전역변수로 객체 생성

	@Override
	public Exam newExam() 
	{
		// TODO Auto-generated method stub
		exam = new NewLecExam();
		return exam;
		// return new NewLecExam(0,0,0,0);
		// 객체를 만들어서 반환 오로지 입출력에 담을 수 있는 그릇을 반환
		// 입력받은 값을 저장, 확정된 부분을 자식이 결정을 할 수 없다.

	}// 뼈대를 넘겨줌

	@Override
	public void input() 
	{

		Scanner scan = new Scanner(System.in);

		super.input();

		int com = 0;

		do {
			if (com < 0 || com > 100)
				System.out.println("유효하지 않은 범위입니다.");

			System.out.print("\t컴퓨터 :  \n");
			com = scan.nextInt();
		} while (com < 0 || com > 100);
		// 추가 과목 입력
		// ((NewLecExam)exam).setCom(com);
		// 형 변환 : 컴퓨터를 넘겨준다.
		exam.setCom(com);
	}

	@Override
	protected void onoutput(Exam exam) 
	{
		// int com = ((NewLecExam)exam).getCom();
		int com = this.exam.getCom();
		System.out.printf("컴퓨터 : %3d \n", com);

	}

}

import opp.is_a.Exam;

public class NewlecExam_1 extends Exam {
	private int com;

	public NewlecExam_1() {
		/*
		 * this(0, 0, 0); //�ڵ��� �ߺ��� �����Ѵ�. this.com = 0;
		 */
		this(1, 1, 1, 1);
	}

	public NewlecExam_1(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int total() {
		// return getKor()+getEng()+getMath()+com;
		// return total()+com;//�ڱ��ڽ��� ȣ���ϴ� �Լ�(����Լ�)= ���ѷ����� �ʵ�
		return super.total() + com;// �ڱ��ڽ��� ȣ���ϴ� �Լ�(����Լ�)= ���ѷ����� �ʵ�
	}

	public float avg() {
		return this.total() / 4f;
	}

}

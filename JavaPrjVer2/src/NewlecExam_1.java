import opp.is_a.Exam;

public class NewlecExam_1 extends Exam {
	private int com;

	public NewlecExam_1() {
		/*
		 * this(0, 0, 0); //코드의 중복을 제거한다. this.com = 0;
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
		// return total()+com;//자기자신을 호출하는 함수(재귀함수)= 무한루프라서 않됨
		return super.total() + com;// 자기자신을 호출하는 함수(재귀함수)= 무한루프라서 않됨
	}

	public float avg() {
		return this.total() / 4f;
	}

}

package test.opp.collec.col.copy;

import oop.collec.col.Exam;

public class ExamList {

	private Exam[] exams;
	private int index;
	private int capacity;

	public ExamList() {
		exams = new Exam[3];
		index = 0;
		capacity = 3;
	}

	public void add(Exam exam) {

		if (index >= capacity) {

			// 1. ���ο� �迭�� ���� +2
			Exam[] temp = new Exam[capacity + 2]; // 2. ���ο� �迭�� �̵�
			for (int i = 0; i < exams.length; i++) {
				temp[i] = exams[i]; // 3.���ο� �迭�� exam�̶��Ѵ�.
				exams = temp; // 4.���ο� �뷮�� ǥ���Ѵ�.
				capacity += 2;
			}

			exams[index++] = exam;

		}

	}



	public Exam get(int i) {
		// TODO Auto-generated method stub
		return exams[i];
	}

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}
}

package test.opp.collec.col.copy;

import oop.collec.col.Exam;

public class GenericList<����> {

	private ����[] list;
	private int index;
	private int capacity;

	public GenericList() {
		list = (����[])new Object[3];
		index = 0;
		capacity = 3;
	}

	public void add(���� exam) {

		if (index >= capacity) {

			// 1. ���ο� �迭�� ���� +2
			����[] temp = (����[])new Exam[capacity + 2]; // 2. ���ο� �迭�� �̵�
			for (int i = 0; i < list.length; i++) {
				temp[i] = list[i]; // 3.���ο� �迭�� exam�̶��Ѵ�.
				list = temp; // 4.���ο� �뷮�� ǥ���Ѵ�.
				capacity += 2;
			}

			list[index++] =  exam;

		}

	}



	public ���� get(int i) {
		// TODO Auto-generated method stub
		return list[i];
	}

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}
}

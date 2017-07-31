package test.opp.collec.col.copy;

import oop.collec.col.Exam;

public class GenericList<용주> {
//배열을 늘리는 작업을 대신 해주는 라이브러리!!
	
	private 용주[] list;
	// 1.
	private int index;
	// 2.
	private int capacity;
	// 3.

	public GenericList(){
		list = (용주[]) new Object[3];
		index = 0;
		capacity = 3;

	}

	public void add(용주 exam) {
		
		if (index >= capacity) {

			// 1. 새로운 배열을 생성 +2
			용주[] temp = (용주[]) new Exam[capacity + 2];
			// 2. 새로운 배열로 이동
			for (int i = 0; i < list.length; i++)
				temp[i] = list[i];
			// 3.새로운 배열을 exam이라한다.
			list = temp;
			// 4.새로운 용량을 표기한다.
			capacity += 2;

		}
		
		list[index++] = exam;
	}



	public 용주 get(int i) {
		
		return list[i];
	}

	public int size() {

		return index;
	}
}

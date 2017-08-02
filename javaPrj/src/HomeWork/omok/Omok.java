package HomeWork.omok;

import java.util.Scanner;

public class Omok {
	// 2가지의 용법 중 데이터를 정의하기 위한 용도로써 사용

	// 오목이란 것의 속성을 정의(값 정의하면 x) 초기화는 x
	static int x, y;

	public Omok(int x, int y) {// 초기화 함수
		this.x = x;
		this.y = y;
	

	}

	public Omok() {// 오버로드 초기화 함수
		this(0, 0);

	}

	public void print() {
		int ox = x;
		int oy = y;
		// 유연하게 수정!!
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				if (x == ox && y == oy)
					System.out.print("○");
				else
					System.out.print("┼");

			System.out.println();
		}

	}

	public void input() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("x sp y : ");
		x = scan.nextInt();
		y = scan.nextInt();
		// 귀찮아지니깐 그냥 쓰는게 편하다.

	}

}
package HomeWork;

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



}
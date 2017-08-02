package oop.omokgame;

import java.util.Scanner;

public class Omok {

	static int x, y;

	public Omok(int x, int y) {// 초기화 함수
		this.x = x;
		this.y = y;

	}
	

	public static int getX() {
		return x;
	}


	public static void setX(int x) {
		Omok.x = x;
	}


	public static int getY() {
		return y;
	}


	public static void setY(int y) {
		Omok.y = y;
	}


	public Omok() {// 오버로드 초기화 함수
		this(0, 0);

	}

	public void input() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		x = scan.nextInt();
		y = scan.nextInt();
		
	}

}

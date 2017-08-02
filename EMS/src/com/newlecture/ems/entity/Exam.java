package com.newlecture.ems.entity;

import java.util.Scanner;

public abstract class Exam { // abstract = 뼈대다 라고 선언함, 공통분모로써만 사용하는 경우 사용
	// private = 캡슐을 유지하는 목적으로 사용함.
	// 캡슐이 깨지는 경우
	private int kor;
	private int eng;
	private int math;

	public Exam() { // 생성자함수 : 처음에 선언하면 자동으로 0으로 초기화가 되는데, 다른 수로 초기화하고 싶은 경우 사용
		/*
		 * kor =1; eng =1; math =1;
		 */// 위랑 같은 의미를 지닌다.
		this(1, 1, 1);
	}

	public Exam(int kor, int eng, int math) { // 오버로드 생성자 함수 : 같은 이름인데 인자가 다른 경우 사용
		this.kor = kor; // 코드가 중복됨. 집중화를 생각하자.
		this.eng = eng;
		this.math = math;

	}

	// 계산식은 구현하지 말 것, 함수 자체는 필요함(함수는 공통인데 구현은 공통이 아니다= 추상 함수)
	/*
	 * public float avg() { // TODO Auto-generated method stub return total() / 3; }
	 */

	public abstract float avg();// 자식이 안만들면 오류

	public int total() {
		// TODO Auto-generated method stub
		return kor + eng + math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}

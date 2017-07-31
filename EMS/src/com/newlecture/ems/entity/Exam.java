package com.newlecture.ems.entity;

import java.util.Scanner;

public abstract class Exam { // abstract = ����� ��� ������, ����и�νḸ ����ϴ� ��� ���
	// private = ĸ���� �����ϴ� �������� �����.
	// ĸ���� ������ ���
	private int kor;
	private int eng;
	private int math;

	public Exam() { // �������Լ� : ó���� �����ϸ� �ڵ����� 0���� �ʱ�ȭ�� �Ǵµ�, �ٸ� ���� �ʱ�ȭ�ϰ� ���� ��� ���
		/*
		 * kor =1; eng =1; math =1;
		 */// ���� ���� �ǹ̸� ���Ѵ�.
		this(1, 1, 1);
	}

	public Exam(int kor, int eng, int math) { // �����ε� ������ �Լ� : ���� �̸��ε� ���ڰ� �ٸ� ��� ���
		this.kor = kor; // �ڵ尡 �ߺ���. ����ȭ�� ��������.
		this.eng = eng;
		this.math = math;

	}

	// ������ �������� �� ��, �Լ� ��ü�� �ʿ���(�Լ��� �����ε� ������ ������ �ƴϴ�= �߻� �Լ�)
	/*
	 * public float avg() { // TODO Auto-generated method stub return total() / 3; }
	 */

	public abstract float avg();// �ڽ��� �ȸ���� ����

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

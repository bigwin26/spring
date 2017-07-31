package oop;

import java.util.Scanner;

public class Exam {
	//private = 캡슐을 유지하는 목적으로 사용함.
	//캡슐이 깨지는 경우
	private int kor;
	private int eng;
	private int math;


	public Exam() {	// 생성자함수 : 처음에 선언하면 자동으로 0으로 초기화가 되는데, 다른 수로 초기화하고 싶은 경우 사용
		/*
		kor =1;
		eng =1;
		math =1;
		*/// 위랑 같은 의미를 지닌다.
		this(1,1,1);
	}
	
	public Exam(int kor, int eng,int math) {	// 오버로드 생성자 함수 : 같은 이름인데 인자가 다른 경우 사용
		this.kor =kor;							// 코드가 중복됨. 집중화를 생각하자. 
		this.eng = eng;
		this.math = math;
		
	}

	public void input() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// 중괄호를 넣어주면 변수의 생명주기가 정해진다.
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         	성적 입력           │");
		System.out.println("└───────────────────────────────┘");

		// 임시변수로 유효성 검사를 한 뒤 변수를 사용

		do 
		{
			if (kor < 0 || kor > 100)
				System.out.println("유효하지 않은 범위입니다.");

			System.out.print("\t국어 :  \n");
			kor = scan.nextInt();
		} while (kor < 0 || kor > 100);

		do 
		{
			if (eng < 0 || eng > 100)
				System.out.println("유효하지 않은 범위입니다.");

			System.out.print("\t영어 :  \n");
			eng = scan.nextInt();
		} while (eng < 0 || eng > 100);

		do 
		{
			if (math < 0 || math > 100)
				System.out.println("유효하지 않은 범위입니다.");

			System.out.print("\t수학 :  \n");
			math = scan.nextInt();
		} while (math < 0 || math > 100);

	}

	public void print() {

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│			성적 출력           │");
		System.out.println("└───────────────────────────────┘");

		int total;
		float avg;

		total = kor + eng + math;
		avg = (float) total / 3;
		
		System.out.printf("국어 : %3d \n", kor);
		System.out.printf("영어 : %3d \n", eng);
		System.out.printf("수학 : %3d \n", math);
		System.out.printf("총점 : %3d \n", total);
		System.out.printf("평균 : %5.2f \n", (float) avg);

	}

}

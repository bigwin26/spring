package structhred.data;

import java.util.Scanner;

	public class OmokProgram2 {
		
	public static void main(String[] args) {
	//공유해야되는 오목 데이터를 정의
		
		//int ox=0, oy=0;
		Omok omok = new Omok(); //이런 자료형의 변수 10개가 주소를 저장가능한 공간을 생성.(주소배열만 생성, 값 저장불가능) = 참조형식
		//객체 명만 10개 만든다고 생각하자.!!!(별칭 개념으로!)
		

	
		//값 형식을 저장할 수 있는 변수
		//Omok omok=new Omok();//각각의 데이터를 생성
		//실행중에 만들어지는 공간 = 동적 공간할당.
		//기본형이 아니면 주소를 저장한는 변수이기때문에 반드시 new로 만들어줘야지 사용 가능	(인스턴스화)
		//공간을 사용하지 않는 경우 null로 쓴다.													Omok omok=null;
		//
		
		printBoard();	
		input(omok);		
		printBoard(omok);
			
	


	}

	private static void printBoard(Omok omok) {
		int ox = omok.x;
		int oy = omok.y;
		//유연하게 수정!!
		for(int y=0; y<15; y++)
		{
			for(int x=0; x<20; x++) 
				if(x == ox && y == oy)
				System.out.print("○");
			else
				System.out.print("┼");
		
			System.out.println();
		}
		
	}

	private static void input(Omok omok) {
		Scanner scan = new Scanner(System.in);
		

		
		System.out.print("x sp y : ");
		omok.x = scan.nextInt();
		omok.y = scan.nextInt();
		
		
	}





	private static void printBoard() 
	{
		for(int y=0; y<15; y++)
		{
			for(int x=0; x<20; x++) 
			System.out.print("┼");
			
			System.out.println();
		}
		
	}
}
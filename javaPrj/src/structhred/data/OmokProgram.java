package structhred.data;

import java.util.Scanner;

	public class OmokProgram {
		
	public static void main(String[] args) {
	//공유해야되는 오목 데이터를 정의
		
		//int ox=0, oy=0;
		Omok omok=new Omok();

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
		//귀찮아지니깐 그냥 쓰는게 편하다.
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
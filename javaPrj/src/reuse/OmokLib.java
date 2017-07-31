package reuse;

import java.util.Scanner;

public class OmokLib {
	//private를 보호모드 클래스 안쪽에서만 사용이 가능하다. 
	//밖에서는 불가능
	public static void printBoard(Omok omok) {
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

	public static void input(Omok omok) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x sp y : ");
		omok.x = scan.nextInt();
		omok.y = scan.nextInt();
		//귀찮아지니깐 그냥 쓰는게 편하다.
	}





	public static void printBoard() 
	{
		for(int y=0; y<15; y++)
		{
			for(int x=0; x<20; x++) 
			System.out.print("┼");
			
			System.out.println();
		}
		
	}
	
}

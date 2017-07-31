package oop.omokgame;

public class Board {
	
	private int x;
	private int y;
	
	public void put(Omok omok) {
		// TODO Auto-generated method stub
		this.x = Omok.x;
		this.y = Omok.y;
	}


	public void print() {
		

		int ox=this.x;
		int oy=this.y;
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



	public void create() {
		// TODO Auto-generated method stub
		//필요 읍는듯
	}




		
	}
	


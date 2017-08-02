package Functions;

import java.util.Scanner;

	public class Omok {

		static int ox=0, oy=0;
		
	public static void main(String[] args) {
	
	
	printFirst();
	
	getData();
	
	printFinal(ox,oy);
	
			
	}

	private static void printFinal(int ox2, int oy2) {
		// TODO Auto-generated method stub
		for(int y=0; y<15; y++)
		{
			for(int x=0; x<20; x++) 
			if(x == ox && y == oy)
			System.out.print("¡Û");
			else
			System.out.print("¦«");
			
			System.out.println();
		}
		
	}

	private static void getData() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x sp y : ");
		ox = scan.nextInt();
		oy = scan.nextInt();
		
	}

	private static void printFirst() {
		for(int y=0; y<15; y++)
		{
			for(int x=0; x<20; x++) 
			System.out.print("¦«");
			
			System.out.println();
		}
	}
}
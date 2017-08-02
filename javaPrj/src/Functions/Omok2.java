package Functions;

import java.util.Scanner;

	public class Omok2 {
		
		static int ox=0, oy=0;
		
	public static void main(String[] args) {
	
		
	
	
	printFirst();
	
	inputData();

	printLast(ox,oy);



}


	private static void inputData() {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("x sp y : ");
		ox = scan.nextInt();
		oy = scan.nextInt();
		
	}


	private static void printLast(int ox, int oy) {
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
	
	private static void printFirst() {
		// TODO Auto-generated method stub
			for(int y=0; y<15; y++)
			{
				for(int x=0; x<20; x++) 
				System.out.print("¦«");
			
				System.out.println();
				}
			
			}
	}
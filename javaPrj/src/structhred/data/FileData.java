package structhred.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream filein = new FileInputStream("res/data.txt");
		
		
		Scanner scan = new Scanner(filein);
		
		float[] s= new float[20];
		
		float sum=0;
		float avg=0;
		
		for(int i = 0 ;i<s.length;i++) {
			s[i] = scan.nextFloat();
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.printf("%5.1f, ",(float)s[i]);
		}
		System.out.println();
		
		for(int i = 0;i<s.length;i++)
		{
			sum+=s[i];
		}
		
		avg= sum/s.length;

		System.out.printf("Че : %5.1f\n",(float)sum);
		System.out.printf("ЦђБе : %5.2f",(float)avg);
		
		scan.close();
		filein.close();
		
		
	}

}

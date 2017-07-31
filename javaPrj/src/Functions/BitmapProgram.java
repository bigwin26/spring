package Functions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitmapProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("res/data.bmp");
		FileOutputStream fout = new FileOutputStream("res/data2.bmp");
		
		byte[] buf =new byte[1024];
		int len;
		
		
		
		while((len=fin.read(buf))!=-1) {
		fout.write(buf,0,len);
		}
		

	
		fin.close();
		
	}

}

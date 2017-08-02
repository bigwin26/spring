package javaPrj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitmapProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("res/photo.bmp");
		FileOutputStream fout = new FileOutputStream("res/photo2.bmp");
	
		
		byte[] buf =new byte[1024];
		int len;
		
		
		
		while((len=fin.read(buf))!=-1) {
		fout.write(buf,0,len);
		}
		

		fout.close();
		fin.close();
		/*
		while(true) {
			len=fin.read(buf);
			if(len==-1)
				break;
			fout.write(buf,0,len);
		}*/
		
		
		
/*		끝:
		while(true){
		len  = fin.read(buf);
		fout.write(buf,0,len);
		
		if(len==-1)
			break 끝;
		}*/
		
		
		
		
		/*
		(len=fin.read())!=-1
				fout.write(buf,0,len);*/
	
		
/*		byte[] fileHeader = new byte[14];	//14byte 읽고
		byte[] bmpHeader = new byte[12];	//12byte를 읽음
*/		

		
	/*	
		fin.read(fileHeader);
		fin.read(bmpHeader);*/
		/*
		//리틀 엔디안을 빅 엔디안으로
		00000000 000000000 00000000 00000000 11111111
		int width = 	((int)(bmpHeader[4])) &0x000000ff|		//->0004 -> 0004
						((int)(bmpHeader[5]) &0x000000ff<<8)|	//->0003 -> 0030
						((int)(bmpHeader[6]) &0x000000ff<<16)|	//->0002 -> 0200
						((int)(bmpHeader[7]) &0x000000ff<<24);	//->0001 -> 1000
		*/
	
	/*	System.out.print(width);*/
		
		
		
				// 파일 복사 프로그램 만들기
				//
		
	}

}

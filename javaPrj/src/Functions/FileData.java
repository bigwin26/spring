package Functions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileData {

	public static void main(String[] args) throws IOException {
		//api 입출력 중에서 파일 입출력을 사용한다.
		int[] nums= new int[] {23,34,65,23,2,34,4};
		//빈 방이 아니라 {}를 써서 값이 채워진 배열을 생성할 수 있다.
		
		
		FileOutputStream file = new FileOutputStream("res/data.txt");	//상대경로-나를 중심으로 src경로를 기준
		//FileOutputStream file = new FileOutputStream("C:/workspace/data.txt");	//절대경로
		//파일 저장에 쓰이는 스트림 객체
		PrintStream print = new PrintStream(file);
		//출력에 쓰이는 스트림 객체, 병목이 발생할 수 있기때문에 버퍼가 필요하다.
		
		
		for(int i=0;i<7;i++)
			file.write(nums[i]);					//숫자 그대로 저장(바이너리), 숫자는 이걸로 저장하는 것이 효율적이다.
		 //printer.printf("%d ", nums[i]);	//문자열로 변환하여 저장하는 것


		
		
		print.close();
		file.close();
		//파일이 사용중입니다. 같은게 뜨지 않도록 닫아야하는데
		//사용후 닫기.
		
		System.out.println("완료");
		
		//파일입출력은 병목이 발생할 수 있기때문에 버퍼가 필요하다.
		//System.out 대신에 file용 스트림 객체를 생성한다.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

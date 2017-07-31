import java.awt.Frame;

public class WindowProgram {

	public static void main(String[] args) {
		//Frame win = new Frame();	//상속이 아니라 이용만 하는 것(내가 캡슐화 x) 
		Frame win = new MyFrame();	
		win.setVisible(true);	//보여지기
		win.setSize(600, 600);	//사이즈 조절


	}

}

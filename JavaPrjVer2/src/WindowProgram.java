import java.awt.Frame;

public class WindowProgram {

	public static void main(String[] args) {
		//Frame win = new Frame();	//����� �ƴ϶� �̿븸 �ϴ� ��(���� ĸ��ȭ x) 
		Frame win = new MyFrame();	
		win.setVisible(true);	//��������
		win.setSize(600, 600);	//������ ����


	}

}

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame {

	public MyFrame() {
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * @Override public void paint(Graphics g) {
		 * 
		 * //super.paint(g); //�θ������ ���� �� �����Ѵ�. g.drawLine(0, 0, 300, 300); //���׸���
		 * x,y,x1,y1
		 * 
		 * }
		 */
		drawLine(0, 0, 300, 300);	//���׸��� x,y,x1,y1
		setVisible(true); // ��������
		setSize(600, 600); // ������ ����

	}
}

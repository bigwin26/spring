import opp.interf.AvgListener;
import opp.interf.Exam;

public class NewLecExam extends Exam {
	private int com;
	
	public NewLecExam() {
		this(0,0,0,0);
		
	}
	

	public NewLecExam(int kor,int math,int eng,int com) {
		super(kor,eng,math);
		this.com=com;
		//setAvgListener(this); //����Ŭ�����Ͻ� �ּ�ó��
		
		/*class AAA1 implements AvgListener{//����Ŭ������ ���
			//Ŭ���� ����� ������ ���ο��� ���� ��Ī�� Ŭ������ �ٸ� ������ ����� �Ҷ� ���
		 	//������ Ŭ������ �ٱ��� Ŭ������ �ݵ�� �Ѱܹ޾ƾ� �Ѵ�.
		 public float avg() {
				// TODO Auto-generated method stub
				return total()/4.0f;
			}
		}*/
/*		//���� ���� ����ϴ� ��� = �͸� Ŭ����
		setAvgListener(new AvgListener() {
			
			@Override
			public float avg() {
				// TODO Auto-generated method stub
				return total()/4.0f;
			}
		}); //this.new ����, ����Ŭ������ ������ �� �ܺΰ�ü�� �Ѱܹ޴´�..
*/		//���ٽ��� ������ ó�� ���� �Ϻκ��� �̷� �� ����Ѵ�. �Լ� 1¥��, ������return ���� �־���Ѵ�.
		//������ �뵵�θ� ����Ѵ�.
		setAvgListener(()->{return total()/4.0f;});
	
	}
	

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}



/*	@Override
	public float avg() {
		
		return total()/4;
	}*/
	/*@Override
	public float avg() {
		// TODO Auto-generated method stub
		//return total()/4.0f;
		return total()/12f;
	}*/
	@Override
	public int total() {
		
		return super.total()+com;
	}
	
	/* public class AAA1 implements AvgListener{//����Ŭ������ ���
			//Ŭ���� ����� ������ ���ο��� ���� ��Ī�� Ŭ������ �ٸ� ������ ����� �Ҷ� ���
		 	//������ Ŭ������ �ٱ��� Ŭ������ �ݵ�� �Ѱܹ޾ƾ� �Ѵ�.
		 public float avg() {
				// TODO Auto-generated method stub
				return total()/4.0f;
			}
	}*/
	
	
}

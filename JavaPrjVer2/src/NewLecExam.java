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
		//setAvgListener(this); //내부클래스일시 주석처리
		
		/*class AAA1 implements AvgListener{//내부클래스로 사용
			//클래스 사용의 이유는 내부에서 같은 명칭의 클래스가 다른 뜻으로 사용을 할때 사용
		 	//안쪽의 클래스는 바깥의 클래스를 반드시 넘겨받아야 한다.
		 public float avg() {
				// TODO Auto-generated method stub
				return total()/4.0f;
			}
		}*/
/*		//가장 많이 사용하는 방법 = 익명 클래스
		setAvgListener(new AvgListener() {
			
			@Override
			public float avg() {
				// TODO Auto-generated method stub
				return total()/4.0f;
			}
		}); //this.new 생략, 내부클래스를 생성할 때 외부객체를 넘겨받는다..
*/		//람다식은 데이터 처리 계산식 일부분을 미룰 때 사용한다. 함수 1짜리, 무조건return 값이 있어야한다.
		//가벼운 용도로만 사용한다.
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
	
	/* public class AAA1 implements AvgListener{//내부클래스로 사용
			//클래스 사용의 이유는 내부에서 같은 명칭의 클래스가 다른 뜻으로 사용을 할때 사용
		 	//안쪽의 클래스는 바깥의 클래스를 반드시 넘겨받아야 한다.
		 public float avg() {
				// TODO Auto-generated method stub
				return total()/4.0f;
			}
	}*/
	
	
}

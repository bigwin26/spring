package HomeWork.omok;

public class OmokProgram {

	public static void main(String[] args) {
		// 공유해야되는 오목 데이터를 정의

		// int ox=0, oy=0;
		Omok omok = new Omok();

		// 기본형이 아니면 주소를 저장한는 변수이기때문에 반드시 new로 만들어줘야지 사용 가능 (인스턴스화)
		// 공간을 사용하지 않는 경우 null로 쓴다. Omok omok=null;
		//
		omok.print();

		omok.input();

		omok.print();

	}

	

	

}
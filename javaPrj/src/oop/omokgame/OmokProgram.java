package oop.omokgame;

public class OmokProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		OmokinputForm form = new OmokinputForm();
		Omok omok = new Omok();
		
		//board.create();
		board.print();
		form.print();
		omok.input();
		board.put(omok);
		board.print();
	}

}

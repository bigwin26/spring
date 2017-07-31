package oop.collec.col;

public class TextProgram {
	
	public static void main(String[] args) {
		GenericList<String> list = new GenericList<String>();
	
		list.add("hello");

		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		/*while(list.hasNext())
			System.out.println(list.next());*/
		
		
	}
	


}


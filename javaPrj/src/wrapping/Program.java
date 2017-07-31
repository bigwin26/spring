package wrapping;

public class Program {

	public static void main(String[] args) {
		// new Integer(3).intValue();
		// int a = 3.intValue();

		// String s = new String("Hello").length();

		// String f = "hello".length();

		int n = 3;
		// 정수형을 문자로 바꾸는 방법.
		String s = Integer.toString(n);
		// 이 값을 문자로 바꾸라
		String t = String.valueOf(n);

		double d = 3.4;
		String sd = Double.toString(d);

		// 문자값을 실수로 바꾸는 방법
		double b = Double.parseDouble(sd);

		/*
		 * String name1 = "아이유"; String name2 = "아이유";
		 * 
		 * System.out.println(name1 == name2);
		 */

		/*
		 * String name1 = "아이유"; String name2 = new String("아이유");
		 * 
		 * System.out.println(name1.equals(name2));
		 */

		/*
		 * String str = "hello"; String s2 = str.replace("l", "g");
		 * 
		 * System.out.println(str); System.out.println(s2);
		 */

		/*
		 * String str = "photo.jpg"; System.out.println(str.length()); //길이
		 * System.out.println(str.indexOf(".")); //점의 위치 //substring 문자 일부분만 발췌 시작점,
		 * 마지막글자+1 System.out.println(str.substring(0, str.indexOf("."))); //이름만 발췌
		 * System.out.println(str.substring(str.indexOf("."),str.length() )); //점의 위치
		 * 
		 * int endIndex = str.indexOf(".");
		 * 
		 * System.out.println(str.substring(0, endIndex));
		 * System.out.println(str.substring(endIndex,str.length() )); //점의 위치
		 */
		//cvs파일 = 콤마로 구분된 파일
		/*String str = "photo.jpg";
		System.out.println(str.length()); // 길이
		System.out.println(str.indexOf(".")); // 점의 위치 //substring 문자 일부분만 발췌 시작점,
		// 마지막글자+1 System.out.println(str.substring(0, str.indexOf("."))); //이름만 발췌
		System.out.println(str.substring(str.indexOf("."), str.length())); // 점의 위치

		int endIndex = str.indexOf(".");

		System.out.println(str.substring(0, endIndex));
		System.out.println(str.substring(endIndex, str.length())); // 점의 위치
*/		
		//cvs파일 = 콤마로 구분된 파일
		String str = "강호동,유재석,신동엽,김성주";
		String[] names = str.split(",");
		System.out.println(names[1]);

	}

}

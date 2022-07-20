package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * str = abcdefghijk
		 * 
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 */
		String str = "abcdefghijk";
		
		for(int i = 0; i < str.length(); i++) { //str.length() -> 문자열 길이만큼
			String subStr = str.substring(i, i + 1);
			System.out.println(subStr);
		}
//		str.substring(0, 1);
//		System.out.println(str);
	}

}

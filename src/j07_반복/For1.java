package j07_반복;

public class For1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 8; i ++) {
			int dan = i + 2;
			System.out.println(dan + "단");
			
			for(int j = 0; j < 9; j++) {
				int num = j + 1;
				System.out.println(dan + " x " + num + " = " + (dan * num));
			}
		
//		for(int dan = 2; dan < 9; dan++)
//			System.out.println(dan +"단");
//			for(int i = 0; i < 9; i++) {
//				int num = i + 1;
//				System.out.println(dan + " x " + num + " = " + (dan * num));
		}
		/*
		 * 2단
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 * 
		 * 3단
		 * 3 x 1 = 3
		 * ...
		 * 3 x 9 = 27
		 * 
		 * ...
		 * 9단
		 * 9 x 1 = 9
		 * ...
		 * 9 x 9 = 81
		 *
		 */
	}
	
}

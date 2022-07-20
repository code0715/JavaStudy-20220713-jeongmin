package j07_반복;

//import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 *.
		 *.
		 *.
		 *2 x 9 = 18
		 */
		int dan = 2;
		
		int i = 0;
		while(i < 9) {
			int num = i + 1;
			
			System.out.println(dan + " x " + num + " = " + (dan * num));
			i++;
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		int dan = 2;
//		int num = 0;
//		int i = 0;
//		System.out.println("단수 입력: ");
//		dan = scanner.nextInt();
//		
//		
//		while(num < 9) {
//			System.out.println(dan + " x " + num + " = " + (dan * num));
//			num++;
		}
	}

}

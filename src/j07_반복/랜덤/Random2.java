package j07_반복.랜덤;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		/*
		 * Random 클래스
		 * nextBoolean()
		 * nextInt()
		 * ...
		 * 
		 */
		Random random = new Random();
		
		int i = 0;
		
		while(i < 10) {
			int rNum = random.nextInt(10);
			System.out.println(rNum);
			i++;
		}
		

	}

}

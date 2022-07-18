package j03_연산자;

/*
 * 논리연산
 * 
 * AND연산(&&) - 곱
 * true && true => true
 * true && false => false
 * false && false => false
 * 
 * OR 연산(||) - 합
 * true || true => true
 * true || false => true
 * false || false => false
 * 
 * NOT연산(!)  - 부정
 * !true => false
 * !false => true
 * 
 * !(true && false) => true
 */

public class Operation2 {

	public static void main(String[] args) {
//		boolean result = 10 > 5; true
//		boolean result = 10 == 5; true
		boolean result = 10 != 5;
		boolean result2 = 10 != 10;
		
		System.out.println("" + result + result); //boolean 끼리 더할순 없고 논리연산으로 연산할수있음
		
		System.out.println(2000 % 4 == 0 && 2000% 100 != 0 && 2000 % 5 == 0);
	}

}

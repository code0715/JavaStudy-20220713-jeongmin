package j06_조건;

public class If2 {

	public static void main(String[] args) {
		int x = -2;
		int y = -5;
		String result = null;
		
		if(x > 0 && y > 0) {
			result = "1사분면";
		}else if(x < 0 && y > 0) {
			result = "2사분면";
		}else if(x < 0 && y < 0) {
			result = "3사분면";
		}else {
			result = "4사분면";
		}
		
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("결과: " + result);
	}

}

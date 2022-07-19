package j06_조건;

public class SwitchCase2 {

	public static void main(String[] args) {
		int score = 85;
		boolean breakFlag = true;
		
		switch(score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			if(breakFlag) {
				break;
			}
			break;
		case 8:
			System.out.println("B");
			if(breakFlag) {
				break;
			}
			break;
		case 7:
			System.out.println("C");
			if(breakFlag) {
				break;
			}
			break;
		case 6:
			System.out.println("D");
			if(breakFlag) {
				break;
			}
			break;
		default:
			System.out.println("F");
		}
	}

}

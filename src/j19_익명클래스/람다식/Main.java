package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		
		//100.5 + 200.5 = 301.0
		
		Math<Integer, Integer> plusMath = new Math<Integer, Integer>(){

			@Override
			public double calc(Integer value1, Integer value2) {
				return value1 + value2;
			}
		};

		System.out.println(plusMath.calc(10, 20));
	}

}

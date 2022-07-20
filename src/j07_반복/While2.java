package j07_반복;

public class While2 {

	public static void main(String[] args) {
		/*
		 * 이정민1
		 * 이정민2
		 * 이정민3
		 * 이정민4
		 * 이정민5
		 * 이정민6
		 */
		int i = 0;	//초기문과 조건문은 건드리지 않는게 좋음
		
		while(i < 6) {
			int j = i + 1;
			System.out.println("이정민" + j);
			System.out.println("이정민" + j);
			System.out.println("이정민" + j);
			i++;
		}
	}

}

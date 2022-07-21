package j08_메소드;

public class Method1 {
	/*
	 * 반환자료형, 리턴자료형 반환값, 리턴값 메소드명, 함수명 파라미터, 매개변수 메소드(함수) 정의 메소드(함수) 호출(콜)
	 */

	// 변환도 없고 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}

	// 반환이 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		test1();
		System.out.println("num: " + num);
		System.out.println("test2 메소드 호출");
	}

	// 반환이 없고 매개변수가 두개인 메소드
	public static void test3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println("test3 메소드 호출");
	}

	// 반환은 있고 매개 변수가 없는 메소드
	public static int test4() {
		System.out.println("test4 메소드 호출");
		return 100;
	}

	// 변환도 있고 매개변수도 있는 메소드
	public static String test5(String name, int index) {
		System.out.println("name: " + name);
		System.out.println("index: " + index);
		return name + index; //단독 리턴 불가 스트링과 리턴
	}

	// 반환값이 없는 메소드에서 메소드를 강제로 탈출하는 방법
	public static void test6(String names) {
		while (true) {
			int tokenIndex = names.indexOf(", ");

			String name = tokenIndex != -1 ? names.substring(0, tokenIndex) : names;
			System.out.println(name);
			if (name.equals("삼정민")) {
				return;//탈출
			}
			if (tokenIndex == -1) {
				break;//와일문만 탈출
			}
			names = names.substring(tokenIndex + 2);
		}
		System.out.println("\n메소드가 정상적으로 종료되었음");
	}

	public static void main(String[] args) {
		test1();
		test1();
		test2(1234);
		test3(1111, 2222);
		int a = test4();
		System.out.println(a);
		System.out.println(test4());

		String result = test5("이정민", 1);
		System.out.println();
		System.out.println();
		System.out.println();

		String names = "이정민, 일정민, 삼정민, 사정민";
		test6(names);
		System.out.println("test6메소드 호출 후 출력");
	}

}

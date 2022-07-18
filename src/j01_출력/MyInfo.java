package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		char name1 = '이';
		char name2 = '정';
		char name3 = '민';
		int age = 25;
		String name = "이정민";
		
		System.out.println("결과: " + 10 +20); //문자열이 포함되면 숫자를 문자취급하게됨
		System.out.println(name1); //산수가 들어가면 코드를 더하게됨
		String address = "부산 동래구 사직동";
		
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();

	}

}

package j09_클래스;

public class Car {
	String company;
	String model;
	String color;
	public Car() {
		//생성자는 무조건 주소값을 리턴한다. -> 다른자료형을 임의로 지정할수 없음
		System.out.println("생성자호출?");
	}
	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}
}

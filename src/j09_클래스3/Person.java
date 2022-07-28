package j09_클래스3;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void test() {
		String name = "김준일";
		System.out.println(this.name);//메소드안에 있는걸 우선하기에 디스를 붙여준다.
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
}

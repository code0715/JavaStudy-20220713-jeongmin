package j15_스태틱;

public class Student {
	
	public static int autoCode = 20220000;
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = ++autoCode;
		this.name = name;
	}
}

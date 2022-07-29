package j09_클래스3;

public class Teachar extends Person{
	private String subject;
	private int teacherCode;
	
	public Teachar() {
	}
	
	public Teachar(String name, int age, String subject, int teacherCode) {
		super(name, age);
		this.subject = subject;
		this.teacherCode = teacherCode;
	}

	public Teachar(String subject, int teacherCode) {
		super();
		this.subject = subject;
		this.teacherCode = teacherCode;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(int teacherCode) {
		this.teacherCode = teacherCode;
	}
	@Override
	public String mealTime() {
		return "점심시간 10분전";
	}
	
}

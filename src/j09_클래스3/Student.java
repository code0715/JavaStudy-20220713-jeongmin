package j09_클래스3;

public class Student {
	private String schoolName;
	private  int studentCode;
	private int studentYear;
	public Student() {
		super();
	}
	public Student(String schoolName, int studentCode, String string, int studentYear, int i) {
		super();
		this.schoolName = schoolName;
		this.studentCode = studentCode;
		this.studentYear = studentYear;
		}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}
	public int getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	@Override
	public String toString() {
		return super.toString() +  ", Student [schoolName=" + schoolName + ", studentCode=" + studentCode + ", studentYear=" + studentYear
				+ "]";
	}
	
	
	
}

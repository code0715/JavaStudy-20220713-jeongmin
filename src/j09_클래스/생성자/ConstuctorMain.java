package j09_클래스.생성자;

public class ConstuctorMain {

	public static void main(String[] args) {
		ConstuctorEx constuctorEx1 = new ConstuctorEx();
		ConstuctorEx constuctorEx2 = new ConstuctorEx("이정민");
		ConstuctorEx constuctorEx3 = new ConstuctorEx("25");
		ConstuctorEx constuctorEx4 = new ConstuctorEx("이정민", 25);
		
		System.out.println(constuctorEx2.name);
	}
}

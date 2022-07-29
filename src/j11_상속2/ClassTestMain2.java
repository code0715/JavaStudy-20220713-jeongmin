package j11_상속2;

public class ClassTestMain2 {

	public static void main(String[] args) {
		((ClassA) new ClassB()).showData();
		
		ClassA bb = new ClassB();
		ClassA aa = (ClassA) bb;
		
		ClassA aaa = new ClassB();
		
		((ClassA) bb).printInfo();
		((ClassA) aa).showData();
		
		aa.showData();
		aa.printInfo();
		
		ClassA b = new ClassB();
		b.printInfo();
		b.showData();
		
		ClassA c = new ClassC();
		c.printInfo();
		c.showData();
	}
	

}

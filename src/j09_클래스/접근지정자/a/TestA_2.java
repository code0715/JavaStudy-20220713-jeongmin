package j09_클래스.접근지정자.a;

public class TestA_2 {
	int ta2;
	public TestA_2() {
		// TODO Auto-generated constructor stub
	}
	public void testA_2() {
		System.out.println("TestA_2메소드 호출");
		System.out.println();
		
		TestA_1 testA= new TestA_1();
		//testA.ta1 = "테스트A_2에서 값 주입";
		testA.testA_1();
		//System.out.println(testA.ta1);
	}
}

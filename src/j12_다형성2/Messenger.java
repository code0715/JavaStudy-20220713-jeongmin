package j12_다형성2;

public interface Messenger {

	//스태틱 상수를 가질 수 있다.
	
	// 모든 메소드는 기본적으로 추상메소드이다.
	public void send(); //default를 넣어야 일반 메소드로 활용가능
	public void receive();
	
}

package j12_다형성.인터페이스.usb;

public class KeyBoard implements USB{

	@Override
	public void coonnect() {
		System.out.println("키보드를 연결합니다.");
	}

	@Override
	public void discoonnect() {
		System.out.println("키보드 연결을 해제합니다.");
	}
	
}

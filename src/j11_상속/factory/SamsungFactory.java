package j11_상속.factory;

public class SamsungFactory extends Factory{

	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
	}
	@Override
	public void start() {
		System.out.println("삼성 ");
		super.start();
	}
	@Override
	public void stop() {
		super.stop();
		System.out.println();
	}
	public void produceSmartPhone() {
		System.out.println("삼성 스마트폰을 생산합니다.");
	}

}

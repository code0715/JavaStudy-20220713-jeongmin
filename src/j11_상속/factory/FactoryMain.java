package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory[] samsungFactories = new SamsungFactory[3];
		samsungFactories[0] = new SamsungFactory(1);
		samsungFactories[1] = new SamsungFactory(2);
		samsungFactories[2] = new SamsungFactory(3);
		
		LGFactory[] LGFactories = new LGFactory[3];
		LGFactories[0] = new LGFactory(1);
		LGFactories[1] = new LGFactory(2);
		LGFactories[2] = new LGFactory(3);

		System.out.println("삼성 공장 가동");
		for(int i = 0; i < samsungFactories.length; i++) {
			System.out.print("\t");
			samsungFactories[i].start();
		}
		System.out.println();
		System.out.println("삼성 공장 중지");
		for(int i = 0; i < samsungFactories.length; i++) {
			System.out.print("\t");
			samsungFactories[i].stop();
		}
		
		System.out.println("LG 공장 가동");
		for(int i = 0; i < LGFactories.length; i++) {
			System.out.print("\t");
			LGFactories[i].start();
		}
		System.out.println();
		System.out.println("LG 공장 중지");
		for(int i = 0; i < LGFactories.length; i++) {
			System.out.print("\t");
			LGFactories[i].stop();
		}
	}

}

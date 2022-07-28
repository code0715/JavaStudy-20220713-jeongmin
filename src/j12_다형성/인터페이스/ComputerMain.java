package j12_다형성.인터페이스;

import java.util.Scanner;

import j12_다형성.인터페이스.usb.KeyBoard;
import j12_다형성.인터페이스.usb.Mouse;

public class ComputerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //입력을 받기위한 코드
		
		String select = null; //내가 입력한메뉴 번호 저장
		ConnectionTerminal connectionTerminal = null;
		System.out.println("[컴퓨터 연결 관리]");
		System.out.println("1. 모니터 연결");
		System.out.println("2.빔프로젝트 연결");
		System.out.println("선택 >>");
		
		select = scanner.nextLine();
		
		if(select.equals("1")) { 
			connectionTerminal = new Monitor();//모니터 객체 생성해서 커넥션 터미널 변수에 대입(업캐스팅되어 들어왔다)
		}else if(select.equals("2")) {
			connectionTerminal = new BeamProject();
		}else {
			System.out.println("메뉴를 잘 못 선택하셨습니다.");
		}
		Computer computer = new Computer(connectionTerminal, new Mouse(), new KeyBoard());
		
		computer.powerOn();
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		computer.powerOff();

	}

}

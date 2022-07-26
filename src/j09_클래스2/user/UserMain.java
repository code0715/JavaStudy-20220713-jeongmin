package j09_클래스2.user;

public class UserMain {
	/*
	 * 사용자 정보 시스템
	 * userName(사용자 이름)
	 * password(비밀번호)
	 * name(이름)
	 * email(이메일)
	 * 
	 * User
	 * UserService
	 */
	public static void main(String[] args) {
		int userCount = 2;
		
		User[] userArray = new User[userCount];
		UserService Service = new UserService(userArray);
		
		while(Service.showMainMenu()) {}
		System.out.println("프로그램 종료");
	}

}

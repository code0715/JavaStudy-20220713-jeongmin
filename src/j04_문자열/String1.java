package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		//System.out.println("\"안녕하세요.\"");//이스케이프문자
		/*
		String address = "부산시 동래구 사직동";
		int index = address.lastIndexOf("동");
		System.out.println(index);
		String subAddress = address.substring(4, 11); //앞에 숫자부터 시작해 뒤의 숫자에 1뺀만큼 진행
		System.out.println(subAddress);
		*/
		
		String address = "부산시 동래구 사직동";
		//해당 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
		int index = address.indexOf("동");
		int index2 = address.lastIndexOf("동");
		System.out.println(index2);
		// 해당 문자열에서 범위를 지정하여 문자열을 잘라줌
		String subAddress = address.substring(index); 
		System.out.println(index2);
		System.out.println(subAddress);
		
		//해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		replaceAddress = address.replaceAll(" ", "-");
		
		String phoneNumbers = "010/7318/1163, 010/1234/5678";
		String rephone = phoneNumbers.replaceAll("010", "011");
		System.out.println(rephone);
		rephone = rephone.replaceAll("/", "-");
		System.out.println(rephone);
		rephone = rephone.replaceAll(",", "/");
		System.out.println(rephone);
		
		String rephone2 = phoneNumbers.replaceAll("010", "011")
			.replaceAll("/", "-")
			.replaceAll(",", "/");
	}

}

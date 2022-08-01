package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private String email;
	private String name;
	private String username;
	private String password;
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
}

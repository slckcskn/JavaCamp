
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getUserName() + " " + user.getUserLastname() + " adli kullanici eklendi!");
	}
	
	public void update(User user) {
		System.out.println(user.getUserName() + " "+ user.getUserLastname()+ " adli kullanici güncellendi!");
	}

}

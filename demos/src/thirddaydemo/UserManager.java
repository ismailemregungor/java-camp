package thirddaydemo;

public class UserManager {

	public void createUser(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullan�c� Olu�turuldu");

	}

	public void changePassword(User user) {

		System.out.println(user.getPassword()+" �ifresi De�i�tirildi");

	}
	
}

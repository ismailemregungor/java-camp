package seconddaydemo;

public class UserService {

	public void createUser(User user) {

		System.out.println(user.getName() + " kullan�c�s� olu�turuldu.");

	}

	public void changePassword(User user) {

		System.out.println(user.getName() + " kullan�c�s�n�n �ifresi ba�ar�yla de�i�tirildi.");

	}
	
}

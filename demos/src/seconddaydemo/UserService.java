package seconddaydemo;

public class UserService {

	public void createUser(User user) {

		System.out.println(user.getName() + " kullanýcýsý oluþturuldu.");

	}

	public void changePassword(User user) {

		System.out.println(user.getName() + " kullanýcýsýnýn þifresi baþarýyla deðiþtirildi.");

	}
	
}

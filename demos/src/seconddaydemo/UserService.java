package seconddaydemo;

public class UserService {

	public void createUser(User user) {

		System.out.println(user.getName() + " kullanıcısı oluşturuldu.");

	}

	public void changePassword(User user) {

		System.out.println(user.getName() + " kullanıcısının şifresi başarıyla değiştirildi.");

	}
	
}

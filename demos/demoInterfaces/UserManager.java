package demoInterfaces;

public class UserManager {

	public void createUser(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanıcı Oluşturuldu");

	}

	public void changePassword(User user) {

		System.out.println(user.getPassword()+" Şifresi Değiştirildi");

	}
	
}

package thirddaydemo;

public class UserManager {

	public void createUser(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanýcý Oluþturuldu");

	}

	public void changePassword(User user) {

		System.out.println(user.getPassword()+" Þifresi Deðiþtirildi");

	}
	
}

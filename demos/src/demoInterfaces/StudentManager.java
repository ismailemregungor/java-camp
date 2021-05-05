package demoInterfaces;

public class StudentManager extends UserManager {

	@Override
	public void createUser(User user) {

		System.out.println(user.getFirstName() + " " +  user.getLastName() + " ��renci Olu�turuldu");

	}

	@Override
	public void changePassword(User user) {

		System.out.println(user.getPassword() + " " + " �ifre De�i�tirildi");

	}

	public void pay(Student student) {

		System.out.println(student.getPaymentCardNumber() + " " + " Numaral� Karttan �deme Yap�ld�");

	}
}

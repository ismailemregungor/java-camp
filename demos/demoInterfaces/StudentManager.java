package demoInterfaces;

public class StudentManager extends UserManager {

	@Override
	public void createUser(User user) {

		System.out.println(user.getFirstName() + " " +  user.getLastName() + " Öðrenci Oluþturuldu");

	}

	@Override
	public void changePassword(User user) {

		System.out.println(user.getPassword() + " " + " Þifre Deðiþtirildi");

	}

	public void pay(Student student) {

		System.out.println(student.getPaymentCardNumber() + " " + " Numaralý Karttan Ödeme Yapýldý");

	}
}

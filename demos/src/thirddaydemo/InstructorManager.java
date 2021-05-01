package thirddaydemo;

public class InstructorManager extends UserManager {

	@Override
	public void createUser(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " E�itmen Olu�turuldu");

	}

	@Override
	public void changePassword(User user) {

		System.out.println(user.getPassword() + " �ifre De�i�tirildi");

	}

	public void getSalary(Instructor instructor) {

		System.out.println(instructor.getSalaryCardNumber() + " Numaral� Karta Maa� �ekildi");

	}
}

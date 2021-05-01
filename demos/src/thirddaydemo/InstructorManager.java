package thirddaydemo;

public class InstructorManager extends UserManager {

	@Override
	public void createUser(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Eðitmen Oluþturuldu");

	}

	@Override
	public void changePassword(User user) {

		System.out.println(user.getPassword() + " Þifre Deðiþtirildi");

	}

	public void getSalary(Instructor instructor) {

		System.out.println(instructor.getSalaryCardNumber() + " Numaralý Karta Maaþ Çekildi");

	}
}

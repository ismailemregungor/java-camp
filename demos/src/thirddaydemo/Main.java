package thirddaydemo;

public class Main {

	public static void main(String[] args) {

		
		System.out.println("**********************Ogrenciler**********************");
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("ismail emre");
		student1.setLastName("gungor");
		student1.setEmail("**********@gmail.com");
		student1.setPassword("*******************");
		student1.setAdress("Kocaeli");
		student1.setSchool("Gazi University");
		student1.setPaymentCardNumber("**********************");

		Student[] students = { student1 };

		for (Student student : students) {

			System.out.println(student.getFirstName());

		}
		
		System.out.println("**********************Ogrenci Islemleri**********************");
		StudentManager studentManager1 = new StudentManager();
		studentManager1.createUser(student1);
		studentManager1.changePassword(student1);
		studentManager1.pay(student1);
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("engin");
		instructor1.setLastName("demirog");
		instructor1.setEmail("**********@gmail.com");
		instructor1.setPassword("*******************");
		instructor1.setAbility("Java,C#,Javscript etc...");
		instructor1.setSalaryCardNumber("**********************");
		
		Instructor[] instructors = { instructor1 };

		for (Instructor instructor : instructors) {

			System.out.println(instructor.getFirstName());

		}
		
		System.out.println("**********************Egýtmen Islemleri**********************");
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.createUser(instructor1);
		instructorManager1.changePassword(instructor1);
		instructorManager1.getSalary(instructor1);
		
		
	}
}

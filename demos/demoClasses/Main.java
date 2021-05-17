package demoClasses;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course();
		course1.setId(1);
		course1.setName("C# + Angular");
		course1.setCategory("Web Development");
		course1.setInstructor("Engin Demirog");

		Course course2 = new Course();
		course2.setId(2);
		course2.setName("Java + React");
		course2.setCategory("Web Development");
		course2.setInstructor("Engin Demirog");

		Course[] courses = { course1, course2 };

		System.out.println("**********Kurslar**********");
		for (Course course : courses) {

			System.out.println(course.name);

		}

		System.out.println("**********Kurs Ýþlemleri**********");
		CourseService courseService = new CourseService();
		courseService.joinCourse(course1);
		courseService.joinCourse(course2);

		courseService.leaveCourse(course1);
		courseService.leaveCourse(course2);

		User user1 = new User();
		user1.setId(1);
		user1.setName("Ýsmail Güngör");
		user1.setUserName("******");
		user1.setPassword("******");
		user1.setEmail("************@gmail.com");
		user1.setPaymentCardNo("****************");

		User user2 = new User();
		user2.setId(2);
		user2.setName("Emre Güngör");
		user2.setUserName("******");
		user2.setPassword("******");
		user2.setEmail("************@gmail.com");
		user2.setPaymentCardNo("****************");

		User[] users = { user1, user2 };

		System.out.println("**********Kullanýcýlar**********");
		for (User user : users) {

			System.out.println(user.getName());

		}
		System.out.println("**********Kullanýcý Ýþlemleri**********");

		UserService userService = new UserService();
		userService.createUser(user1);
		userService.changePassword(user1);

		userService.createUser(user2);
		userService.changePassword(user2);

	}
}

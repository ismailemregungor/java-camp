package seconddaydemo;


public class CourseService {

	public void joinCourse(Course course) {

		System.out.println(course.getName() + " kursuna kat�ld�n�z.");

	}

	public void leaveCourse(Course course) {

		System.out.println(course.getName() + " kursundan ayr�ld�n�z.");

	}

}

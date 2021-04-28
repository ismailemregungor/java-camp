package seconddaydemo;


public class CourseService {

	public void joinCourse(Course course) {

		System.out.println(course.getName() + " kursuna katýldýnýz.");

	}

	public void leaveCourse(Course course) {

		System.out.println(course.getName() + " kursundan ayrýldýnýz.");

	}

}

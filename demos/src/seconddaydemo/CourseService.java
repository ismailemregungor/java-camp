package seconddaydemo;


public class CourseService {

	public void joinCourse(Course course) {

		System.out.println(course.getName() + " kursuna katıldınız.");

	}

	public void leaveCourse(Course course) {

		System.out.println(course.getName() + " kursundan ayrıldınız.");

	}

}

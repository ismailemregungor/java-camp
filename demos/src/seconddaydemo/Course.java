package seconddaydemo;

public class Course {

	int id;
	String name;
	String category;
	String instructor;

	public Course() {

	}

	public Course(int id, String name, String category, String instructor) {

		this.id = id;
		this.name = name;
		this.category = category;
		this.instructor = instructor;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

}

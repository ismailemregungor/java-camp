package thirddaydemo;

public class Student extends User {

	private String school;
	private String paymentCardNumber;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String email, String password, String address,
			String school, String paymentCardNumber) {
		super(id, firstName, lastName, email, password, address);
		this.school = school;
		this.paymentCardNumber = paymentCardNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getPaymentCardNumber() {
		return paymentCardNumber;
	}

	public void setPaymentCardNumber(String paymentCardNumber) {
		this.paymentCardNumber = paymentCardNumber;
	}

}

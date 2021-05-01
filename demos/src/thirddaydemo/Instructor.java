package thirddaydemo;

public class Instructor extends User {

	private String ability;
	private String salaryCardNumber;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String email, String password, String address,
			String ability, String salaryCardNumber) {
		super(id, firstName, lastName, email, password, address);
		this.ability = ability;
		this.salaryCardNumber = salaryCardNumber;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getSalaryCardNumber() {
		return salaryCardNumber;
	}

	public void setSalaryCardNumber(String salaryCardNumber) {
		this.salaryCardNumber = salaryCardNumber;
	}

}

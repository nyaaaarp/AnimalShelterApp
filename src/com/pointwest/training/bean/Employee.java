public class Employee {

	private int employeeId;
	private String name;

	public Employee() {
		this.employeeId = 1;
		this.name = "Andres Bonifacio";
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getName() {
		return this.name;
	}
}
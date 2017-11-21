public class Employee {

  private int employeeId;
  private String firstName;
  
  public Employee() {
    this.employeeId = 1;
    this.firstName = "Juan"
  }

  public void setEmployeeId(int employeeId) {
  this.employeeId = employeeId;
  }

  public int getEmployeeId() {
    return this.employeeId;
  }
  
  public void setFirstname(String firstName){
    this.firstName = firstName;
  }
  
  public int getFirstName(){
    return firstName;
  }
}

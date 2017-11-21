public class Employee {

  private int id;
  private String firstName;
  
  public Employee() {
    this.id = 1;
    this.firstName = "Juan"
  }

  public void setId(int id) {
  this.id = id;
  }

  public int getId() {
    return this.id;
  }
  
  public void setFirstname(String firstName){
    this.firstName = firstName;
  }
  
  public int getFirstName(){
    return firstName;
  }
}

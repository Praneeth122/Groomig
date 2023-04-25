package builder;

import lombok.Getter;

@Getter
public class EmployeeBuilder{
	
	private String firstName;
	private String lastName;
	private int age;	
	
	public EmployeeBuilder() {
	}
	
	public EmployeeBuilder firstName(String firstName) {
		this.firstName=firstName;
			return this;
	}
	
	public EmployeeBuilder lastName(String lastName) {
		this.lastName=lastName;
			return this;
	}
	
	public EmployeeBuilder age(int age) {
		this.age=age;
			return this;
	}
        
    public Employee build() { 
        return new Employee(this);
     }
}
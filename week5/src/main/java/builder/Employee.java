package builder;

import lombok.Getter;

@Getter
public class Employee {
	private String firstName;
	private String lastName;
	private int age;	
	
	public Employee(EmployeeBuilder employeeBuilder) {
		this.firstName=employeeBuilder.getFirstName();	
		this.lastName=employeeBuilder.getLastName();	
		this.age=employeeBuilder.getAge();	
	}



}

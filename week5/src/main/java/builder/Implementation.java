package builder;

public class Implementation {
	
	 public static void main(String args[])
	 {
		 Employee employee = new EmployeeBuilder().firstName("Tony")
             .lastName("Stark")
             .build();
		 
		 System.out.println(employee.getFirstName()+employee.getLastName()+employee.getAge());
	 }
}

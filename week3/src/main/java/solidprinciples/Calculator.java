package solidprinciples;

import java.util.Map;
import java.util.Scanner;

public class Calculator {
	
	private static Map<String,ArthematicOperator>calOperations=Map.of("+",new Addition(),"-",new Subtraction());
	
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);  
		  
		  System.out.println("Enter Operation: ");
		  String operation = input.nextLine();
		  
		  System.out.println("Enter a: ");
		  String a = input.nextLine();
		  
		  System.out.println("Enter b: ");
		  String b = input.nextLine();
		  
		  ArthematicOperator op = calOperations.get(operation);
				 
		  if(!op.equals(null)) System.out.println(op.eval(Integer.valueOf(a),Integer.valueOf(b)));  
				  
	}
}
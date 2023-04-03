package overloadingandoverriding;

import lombok.Getter;
import lombok.Setter;

//Overriding - runtime polymorphism 
@Getter
@Setter
public class Benz extends Car{
	
	String roof;
	
	public Benz(String engine,String wheels,String roof) {
		super(engine,wheels);
		this.roof=roof;
	}
	
	@Override
	public String getCar() {
		return  this.engine+this.wheels+this.roof;
	}
	
	public static void main(String args[]) {
		Car benz = new Benz("4litre","alloy","panaromic");
		Car honda = new Car("4litre","alloy");
		System.out.println(benz.getCar());	
		System.out.println(honda.getCar());		
	}
}

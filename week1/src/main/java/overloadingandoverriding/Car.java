package overloadingandoverriding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//overloading eg base class
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	String engine;
	String wheels;
	
	public String getCar() {
		return  this.engine+this.wheels;
	}
}

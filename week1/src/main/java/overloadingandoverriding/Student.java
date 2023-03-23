package overloadingandoverriding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Overloading compile time polymorphism

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	String name;
	int id;
	String email;
    
	public String print(int id) {
		return this.name+" "+this.email;
	}
	
	public String print() {
		return this.name;
	}
	
	public static void main(String args[]) {
		Student std = new Student("rp",1,"rp@gmail.com");
		System.out.println(std.print());	
		System.out.println(std.print(1));
	}
}
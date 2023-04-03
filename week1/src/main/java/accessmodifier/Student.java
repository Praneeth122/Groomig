package accessmodifier;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Student {
	String name;
	String id;
	String course="gromming";
	
	public void setName(String name) {
		this.name=name;
	}
	
	// this is not accessable from outside of the package and not a subclass
	protected void setId(String Id) {
		this.id=Id;
	}
	
	//this is not accessable from outside the class
	private String getCourse() {
		return this.course;
	}
	
	public String getStudent() {
		return this.name+this.id+getCourse();
	}
	
	
}

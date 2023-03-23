package accessmodifier;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClassMoniter extends Student{
	String workinghrs;
	
	public ClassMoniter(String name,String id,String course,String workinghrs) {
		super(name,id,course);
		this.workinghrs=workinghrs;
	}
	
	// can access getStudent but getCourse is not accessible 
	@Override
	public String getStudent() {
		return super.getStudent()+this.workinghrs;
	}
	
	
	public static void main(String args[]) {
		ClassMoniter clsm = new ClassMoniter();
		
		//protected method
		clsm.setId("1");
		clsm.setName("rp");
		clsm.setWorkinghrs("3hrs");
		// All methods from student are accessible except the getCourse()
		// public method
		System.out.println(clsm.getStudent());
		
	}
}

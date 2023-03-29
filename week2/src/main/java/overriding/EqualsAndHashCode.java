package overriding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Employee {

	public String name;
	public int id;

	@Override
	public boolean equals(Object obj) {

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Employee std = (Employee) obj;

		return (std.name == this.name && std.id == this.id);
	}

	@Override
	public int hashCode() {
		return this.id;
	}
}

public class EqualsAndHashCode {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("aa", 1);
		Employee e2 = new Employee("aa", 1);

		if (e1.hashCode() == e2.hashCode()) {

			if (e1.equals(e2))
				System.out.println("Both Objects are equal. ");
			else
				System.out.println("Both Objects are not equal. ");

		} else
			System.out.println("Both Objects are not equal. ");
	}
}

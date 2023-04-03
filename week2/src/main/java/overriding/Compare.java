package overriding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MarksCompare implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        if (s1.getMarks() < s2.getMarks()) return -1;
        if (s1.getMarks() > s2.getMarks()) return 1;
        else return 0;
    }
}
 
//natural ordering
class NameCompare implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s1.getName().compareTo(s2.getName());
    }
}

public class Compare {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("rp", 9));
		list.add(new Student("pk", 8));
		list.add(new Student("sai", 7));

		System.out.println("Students before sorting : ");
		for (Student s : list) {
			System.out.println(s.getName() + " " + s.getMarks());
		}

		NameCompare nameCompare = new NameCompare();
		Collections.sort(list,nameCompare);

		System.out.println("Students after sorting based on names : ");
		for (Student s : list) {
			System.out.println(s.getName() + " " + s.getMarks());
		}
		
		MarksCompare marksCompare = new MarksCompare();
		Collections.sort(list,marksCompare);

		System.out.println("Students after sorting based on m : ");
		for (Student s : list) {
			System.out.println(s.getName() + " " + s.getMarks());
		}
	}
}

package overriding;

import java.util.ArrayList;
import java.util.Collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Student implements Comparable<Student>
{

    private String name;
    private int marks;

    @Override
    public int compareTo(Student s)
    {
        return this.marks - s.marks;
    }

}
 
public class CompareTo{ 
    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("rp",9));
        list.add(new Student("pk",8));
        list.add(new Student("sai",7));
        
        System.out.println("Students before sorting : ");
        for (Student s: list)
        {
            System.out.println(s.getName() + " " +s.getMarks());
        }
 
        Collections.sort(list);
 
        System.out.println("Students after sorting : ");
        for (Student s: list)
        {
            System.out.println(s.getName() + " " +s.getMarks());
        }
    }
}

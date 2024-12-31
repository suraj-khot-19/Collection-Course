package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name,int age) {
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    /// if not implement or override this method error is coming => Student cannot be cast to class java.lang.Comparable
    @Override
    public int compareTo(Student other) {
       return this.name.compareTo(other.name);
    }
}
public class CWS_24_IMP_Comparable_interface {
    public static void main(String[] args) {
        List<Student> students= Arrays.asList(
                new Student("Suraj",24),
                new Student("Santosh",25),
                new Student("Sohan",23),
                new Student("Adya",22),
                new Student("Shubh",23)
        );

        ArrayList<Student> list=new ArrayList<>(students);

        System.out.println("original list");
        for (Student s : list){
            System.out.println("name: "+s.getName()+", "+"age: "+s.getAge());
        }

        list.sort((s1,s2)->s2.getName().compareTo(s1.getName()));
        System.out.println("descending order sort list");
        for (Student s : list){
            System.out.println("name: "+s.getName()+", "+"age: "+s.getAge());
        }

        list.sort(null); /// this will throw error if we do not implement Comparable interface
        System.out.println("ascending order sort list");
        for (Student s : list){
            System.out.println("name: "+s.getName()+", "+"age: "+s.getAge());
        }
    }
}

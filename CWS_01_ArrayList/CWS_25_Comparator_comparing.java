/*
A comparison function, which imposes a total ordering on some collection of objects. Comparators can be passed to a sort method (such as Collections. sort or Arrays. sort) to allow precise control over the sort order. Comparators can also be used to control the order of certain data structures (such as sorted sets or sorted maps), or to provide an ordering for collections of objects that don't have a natural ordering.
 */
package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    private final int id;
    private final String name;
    private final int age;

    public Employee(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
public class CWS_25_Comparator_comparing {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();

        list.add(new Employee(101,"Suraj",24));
        list.add(new Employee(102,"patil",22));
        list.add(new Employee(103,"Adarsh",21));
        list.add(new Employee(104,"Shubham",24));
        list.add(new Employee(104,"Sohan",22));
        list.add(new Employee(104,"Santosh",24));
        list.add(new Employee(104,"Sagar",24));

        System.out.println("initial list:");
        list.forEach((e)->{
            System.out.println("id: "+e.getId()+" name: "+e.getName()+" age: "+e.getAge());
        });

        /// comparator
        Comparator<Employee> comparator1=Comparator.comparing(Employee::getAge);

        list.sort(comparator1);

        System.out.println("\n\n list after sorting ascending order of age:");
        list.forEach((e)->{
            System.out.println("id: "+e.getId()+" name: "+e.getName()+" age: "+e.getAge());
        });

        /// reverse order comparator
        Comparator<Employee> comparator2 = Comparator.comparing(Employee::getAge).reversed();

        list.sort(comparator2);
        System.out.println("\n\n list after sorting *descending order of age:");
        list.forEach((e)->{
            System.out.println("id: "+e.getId()+" name: "+e.getName()+" age: "+e.getAge());
        });

        /// comparator with two comparing things
        Comparator<Employee> comparator3=Comparator.comparing(Employee::getAge).thenComparing(Employee::getName).reversed();

        list.sort(comparator3);
        System.out.println("\n\n list after sorting by age then by name but reversed");
        list.forEach((e)->{
            System.out.println("id: "+e.getId()+" name: "+e.getName()+" age: "+e.getAge());
        });
    }
}

package CWS_02_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CWS_10_remove_method {
    public static void main(String[] args) {

        List<Integer> l= Arrays.asList(101,102,103,104,105,106,107,108);

        LinkedList<Integer> linkedList=new LinkedList<>(l);

        System.out.println("elements before: "+linkedList);

        linkedList.remove(Integer.valueOf(101));
        System.out.println("elements after  linkedList.remove(Integer.valueOf(101)): "+linkedList);

        linkedList.remove(2);
        System.out.println("elements after linkedList.remove(2): "+linkedList);

        linkedList.removeFirst();
        System.out.println("elements after linkedList.removeFirst(): "+linkedList);

        linkedList.removeLast();
        System.out.println("elements after linkedList.removeLast(): "+linkedList);

        /// if out of bound
        //linkedList.remove(15); /// IndexOutOfBoundsException

    }
}

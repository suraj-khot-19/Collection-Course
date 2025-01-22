package CWS_02_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CWS_09_get_method {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(101,102,103,104,105);

        LinkedList<Integer> linkedList=new LinkedList<>(l);

        System.out.println("linkedList.get(3): " + linkedList.get(3));

        System.out.println("linkedList.getFirst(): "+linkedList.getFirst());

        System.out.println("linkedList.getLast(): "+linkedList.getLast());


        /// NoSuchElementException – if this list is empty
        LinkedList<String> stringLinkedList=new LinkedList<>();

        System.out.println(stringLinkedList.getFirst()); // NoSuchElementException
        System.out.println(stringLinkedList.getLast());  // // NoSuchElementException
    }
}

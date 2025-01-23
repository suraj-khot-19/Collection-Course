package CWS_02_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CWS_07_add_method {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5);

        LinkedList<Integer> linkedList=new LinkedList<>(l);

        System.out.println("Before add: "+linkedList);

        linkedList.add(6);
        linkedList.add(7);

        System.out.println("after adding some elements using add() method: "+linkedList);

        linkedList.addFirst(0);
        linkedList.addLast(10);

        System.out.println("adding addFirst() and addLast() elements: "+linkedList);

        linkedList.addAll(l);

        System.out.println("adding all using addAll() method: "+linkedList);
    }
}

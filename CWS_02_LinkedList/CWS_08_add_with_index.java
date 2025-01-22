package CWS_02_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CWS_08_add_with_index {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5);

        LinkedList<Integer> linkedList=new LinkedList<>(l);

        System.out.println("before an action: "+linkedList);
        linkedList.add(1,55);
        linkedList.add(3,101);
        System.out.println("after action at index 1 and 3: "+linkedList);
    }
}

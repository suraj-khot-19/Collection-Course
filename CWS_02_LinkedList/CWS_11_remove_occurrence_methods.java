package CWS_02_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CWS_11_remove_occurrence_methods {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,1,22,33,44,11,22,55,55,66,77,88,22,33,44,55,66,77);

        LinkedList<Integer> linkedList = new LinkedList<>(list);

        System.out.println("Initial list: "+linkedList);
        
        linkedList.removeFirstOccurrence(22);
        System.out.println("after linkedList.removeFirstOccurrence(22): "+linkedList);

        linkedList.removeLastOccurrence(55);
        System.out.println("after linkedList.removeLastOccurrence(55): "+linkedList);
    }
}

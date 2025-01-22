package CWS_02_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CWS_06_LinkedList_Creation_3 {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5);

        LinkedList<Integer> linkedList=new LinkedList<>(l);

        System.out.println(linkedList);
    }
}

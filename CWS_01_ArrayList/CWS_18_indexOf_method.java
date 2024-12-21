package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_18_indexOf_method {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7,7);
        List<Integer> list=new ArrayList<>(l);

        /*
            Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. More formally, returns the lowest index i such that Objects. equals(o, get(i)), or -1 if there is no such index.
         */

        System.out.println(list.indexOf(1));
        System.out.println(list.indexOf(7));

        System.out.println(list.indexOf(10));
    }
}

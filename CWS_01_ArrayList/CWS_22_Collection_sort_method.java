package CWS_01_ArrayList;

import java.util.*;

public class CWS_22_Collection_sort_method {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 5, 6, 7, 2, 3, 4));
        System.out.println("before sort:" + list1);

        Collections.sort(list1);
        System.out.println("after ascending sort:"+list1);

        Collections.sort(list1,(a,b)->b.compareTo(a));
        System.out.println("after descending sort:"+list1);
    }
}

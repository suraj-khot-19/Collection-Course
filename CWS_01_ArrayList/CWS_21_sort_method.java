package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_21_sort_method {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));

        System.out.println("before sort:" + list1);

        list1.sort((a, b) -> b - a); //descending order
        System.out.println("after descending order:" + list1);

        list1.sort((a,b)->a-b); //ascending order
        System.out.println("after ascending order:"+list1);
    }
}

package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_14_remove_method_with_object {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));

        System.out.println("before: "+list1);

        list1.remove(3); /// it still consider as a index

        ///  typed with Integer
        list1.remove(Integer.valueOf(4));

        System.out.println("after: "+list1);


        ArrayList<String> list2 = new ArrayList<>(List.of("ab", "bc", "cd"));

        System.out.println("before: "+list2);

        list2.remove(2);
        list2.remove("ab");

        System.out.println("after: "+list2);
    }
}

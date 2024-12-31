package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CWS_23_sort_Comparator {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 5, 6, 7, 2, 3, 4));

        System.out.println("list:"+list1);

        list1.sort(Comparator.naturalOrder());
        System.out.println("list after natural order:"+list1);

        list1.sort(Comparator.reverseOrder());
        System.out.println("list after reverse order:"+list1);
    }
}

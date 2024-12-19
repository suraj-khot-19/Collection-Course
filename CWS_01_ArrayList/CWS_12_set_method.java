package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_12_set_method {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));

        System.out.println("before update: "+list+", size: "+list.size());

        /// Replaces the element at the specified position in this list with the specified element. size remains same
        list.set(2,5);
        list.set(1,6);
        list.set(0, 7);

        System.out.println("after update: "+list+", size: "+list.size());
    }
}

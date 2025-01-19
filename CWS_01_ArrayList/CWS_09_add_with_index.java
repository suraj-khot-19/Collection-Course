package CWS_01_ArrayList;

import java.util.ArrayList;

public class CWS_09_add_with_index {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(){{add(1);
            add(2);}};

        System.out.println("before adding: "+list);

        /// Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).

        list.add(0,0);
        list.add(1,3);

        System.out.println("After adding with index: "+list);

    }
}

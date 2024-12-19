package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_13_remove_method_using_index {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));

        System.out.println("list before: "+list+", size: "+ list.size());

        list.remove(1);
        list.remove(2);

        System.out.println("list after: "+list+", size: "+ list.size());
    }
}

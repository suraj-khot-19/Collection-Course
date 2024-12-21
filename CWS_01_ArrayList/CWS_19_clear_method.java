package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_19_clear_method {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7,7);
        List<Integer> list=new ArrayList<>(l);

        System.out.println("before:"+list);

        /*
        Removes all the elements from this list (optional operation). The list will be empty after this call returns.
         */

        list.clear();

        System.out.println("after:"+list);
    }
}

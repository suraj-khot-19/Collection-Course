package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_16_isEmpty_method {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7,7);
        List<Integer> list=new ArrayList<>(l);

        System.out.println("before:");
        if (!l.isEmpty()){
            System.out.println(list);
        }

        System.out.println("after:");
        list.clear();

        System.out.println("is list is empty: "
                +list.isEmpty());
    }
}

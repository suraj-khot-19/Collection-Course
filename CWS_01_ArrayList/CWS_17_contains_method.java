package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_17_contains_method {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7,7);
        List<Integer> list=new ArrayList<>(l);

        System.out.println("2 : "+list.contains(2));
        System.out.println("7 : "+list.contains(7));
    }
}

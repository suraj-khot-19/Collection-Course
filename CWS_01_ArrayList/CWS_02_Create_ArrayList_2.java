package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_02_Create_ArrayList_2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        System.out.println(list);

        /// because arrayList is implementing List interface

        /*
        Collections(interface) -
               extends ->      |_ List(interface) -
               implements ->                      |_ ArrayList (class)
         */
    }
}

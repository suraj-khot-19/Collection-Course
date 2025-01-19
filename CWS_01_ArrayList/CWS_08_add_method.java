package CWS_01_ArrayList;

import java.util.ArrayList;

public class CWS_08_add_method {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        /// Appends the specified element to the end of this list. (always at the end)
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println(arrayList);
    }
}

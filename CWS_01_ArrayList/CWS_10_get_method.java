package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CWS_10_get_method {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);

        ArrayList<Integer> arrayList=new ArrayList<>(list);
        /// get() => Returns the element at the specified position in this list
        System.out.println("using get method");

        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(3));
        //System.out.println(arrayList.get(5)); //// throws exception out

        System.out.println("using for loop with get method");

        for (int i=0;i<arrayList.size();i++){
            System.out.print(" "+arrayList.get(i));
        }
    }
}

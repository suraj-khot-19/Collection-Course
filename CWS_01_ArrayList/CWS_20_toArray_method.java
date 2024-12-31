package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CWS_20_toArray_method {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(List.of(1,2,3,4,5,6,7));
        List<String> list2=new ArrayList<>(List.of("a1","a2","a3"));
        List<String> list3=new ArrayList<>(List.of("o1","o2","o3"));

        Integer[] arr1=list1.toArray(Integer[]::new);
        String[] arr2=list2.toArray(String[]::new);
        Object[] arr3 = list3.toArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}

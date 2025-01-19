package CWS_01_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CWS_04_Create_ArrayList_4_Arrays_asList {
    public static void main(String[] args) {
        List<Integer> myList=Arrays.asList(1,2,3,4,5); /// Arrays.asList() Returns a fixed-size list backed by the specified array. where we can perform update only

        ArrayList<Integer> list=new ArrayList<>(myList);
        System.out.println(list);
    }
}

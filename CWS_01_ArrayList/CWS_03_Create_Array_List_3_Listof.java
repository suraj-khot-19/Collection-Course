package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_03_Create_Array_List_3_Listof {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5);  /// Returns an unmodifiable list containing five elements.

        ArrayList<Integer> list=new ArrayList<>(myList);
    }
}

package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_15_size_method {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));

        // Returns the number of elements in this list.
        System.out.println("size:"+list.size());
    }
}

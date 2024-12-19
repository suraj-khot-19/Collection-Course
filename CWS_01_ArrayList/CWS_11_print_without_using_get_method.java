package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_11_print_without_using_get_method {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));

        /// using enhanced for loop
        for (int i : list){
            System.out.println(i);
        }
    }
}

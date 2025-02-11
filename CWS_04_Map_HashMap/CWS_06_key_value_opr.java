package CWS_04_Map_HashMap;
import java.util.*;

public class CWS_06_key_value_opr {
    public static void main(String[] args) {
        Map<String, Integer> maps = Map.of("suraj", 101, "rowdy", 102);

        HashMap<String,Integer> students=new HashMap<>(maps);

        /// list of values
        Collection<Integer> values = students.values();
        System.out.println(values);

        /// set of keys
        Set<String> keySet = students.keySet();
        System.out.println(keySet);
    }
}

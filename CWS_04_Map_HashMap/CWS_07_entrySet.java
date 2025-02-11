package CWS_04_Map_HashMap;

import java.util.*;

public class CWS_07_entrySet {
    public static void main(String[] args) {
        Map<String, Integer> maps = Map.of("suraj", 101, "rowdy", 102);

        HashMap<String,Integer> students=new HashMap<>(maps);

        Set<Map.Entry<String, Integer>> entrySet = students.entrySet();
        System.out.println(entrySet);
    }
}
/*
Map<String, Integer> maps = Map.of("suraj", 101, "rowdy", 102,"rowdy", 103);

Exception in thread "main" java.lang.IllegalArgumentException: duplicate key: rowdy
 */

/*
Map<String, Integer> maps = Map.of("suraj", 101, "rowdy", 102);

[rowdy=102, suraj=101]
 */
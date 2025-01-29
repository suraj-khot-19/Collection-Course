package CWS_04_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class CWS_01_HashMap_Create_1 {
    public static void main(String[] args) {
        Map<String, Integer> maps = Map.of("suraj", 101, "rowdy", 102);

        HashMap<String,Integer> students=new HashMap<>(maps);
        System.out.println(students);
    }
}

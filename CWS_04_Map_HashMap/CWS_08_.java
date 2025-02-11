package CWS_04_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class CWS_08_ {
    public static void main(String[] args) {
        Map<String, Integer> maps = Map.of("suraj", 101, "rowdy", 102);

        HashMap<String,Integer> students=new HashMap<>(maps);

        boolean b1 = students.containsValue(101);
        System.out.println(b1);

        boolean b2 = students.containsValue(100);
        System.out.println(b2);

        boolean b3 = students.containsKey("suraj");
        System.out.println(b3);

        boolean b4 = students.containsKey("raj");
        System.out.println(b4);

        boolean empty1 = students.isEmpty();
        System.out.println("empty: "+empty1);

        students.clear();

        boolean empty2 = students.isEmpty();
        System.out.println("empty: "+empty2);
    }
}

package CWS_04_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class CWS_09_replace {
    public static void main(String[] args) {
        Map<String,Integer> map=Map.of("Suraj",1);

        HashMap<String,Integer> hashMap=new HashMap<>(map);

        System.out.println(hashMap);

        hashMap.replace("Suraj", 25);

        System.out.println(hashMap);

        hashMap.replace("Suraj", 10,30); /// if then

        System.out.println(hashMap);
    }
}

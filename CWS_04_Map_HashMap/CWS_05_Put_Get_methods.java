package CWS_04_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

/// hashmap with same key is updated with new value

public class CWS_05_Put_Get_methods {
    public static void main(String[] args) {
        Map<String,Integer> map=Map.of("Suraj",101,"Rowdy",102);

        HashMap<String,Integer> hashMap=new HashMap<>(map);

        System.out.println("initial hashmap: "+hashMap);

        hashMap.put("Adya",104);
        hashMap.put("sonya",107);
        hashMap.put("sonya",110);

        System.out.println("hashmap after put: "+hashMap);

        System.out.println(hashMap.get("sonya"));

        System.out.println(hashMap.get(3));
    }
}

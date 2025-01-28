package CWS_04_Map_HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/// Returns a synchronized (thread-safe) map backed by the specified map. In order to guarantee serial access, it is critical that all access to the backing map is accomplished through the returned map.



public class CWS_04_HashMap_Thread_Safe {
    public static void main(String[] args) {
        Map<String,Integer> synchronizedMap= Collections.synchronizedMap(new HashMap<>());
    }
}

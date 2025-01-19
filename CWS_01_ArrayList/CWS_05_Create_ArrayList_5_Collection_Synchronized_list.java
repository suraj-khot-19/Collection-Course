package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CWS_05_Create_ArrayList_5_Collection_Synchronized_list {
    public static void main(String[] args) {
        List<Integer> list= Collections.synchronizedList(new ArrayList<>());  /// Returns a synchronized (thread-safe) list backed by the specified list. In order to guarantee serial access, it is critical that all access to the backing list is accomplished through the returned list.
         /// It is imperative that the user manually synchronize on the returned list when traversing it via Iterator, Spliterator or Stream:

        list.add(2);
        System.out.println(list);
    }
}

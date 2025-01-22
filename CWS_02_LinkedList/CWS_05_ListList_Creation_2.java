package CWS_02_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class CWS_05_ListList_Creation_2 {
    public static void main(String[] args) {
        List<String> l=List.of("aa","bb","cc");
        LinkedList<String> list=new LinkedList<>(l);
        System.out.println(list);

    }
}

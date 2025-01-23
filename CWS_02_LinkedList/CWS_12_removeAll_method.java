package CWS_02_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class CWS_12_removeAll_method {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>(List.of("Suraj","Sohan","Adarsh","Shubham","Anirudh"));

        System.out.println("initial linked list: "+list);

        List<String> removeListNames=List.of("Sohan","Adarsh","Shubham","Anirudh");

        list.removeAll(removeListNames);

        System.out.println("list after remove all operation: "+list);
    }
}

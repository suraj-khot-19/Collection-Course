package CWS_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CWS_06_Create_ArrayList_6_declare_with_initalize {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(){{
            add(1);add(2);add(3);}};

        System.out.println(list);
    }
}

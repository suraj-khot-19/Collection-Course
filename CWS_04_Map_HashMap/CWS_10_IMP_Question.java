package CWS_04_Map_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CWS_10_IMP_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String string=s.replace(" ","");

        HashMap<Character,Integer> frequency =new HashMap<>();

        for (int i=0;i<string.length();i++){
            char ch=string.charAt(i);

            if (frequency.containsKey(ch)){
                frequency.replace(ch, frequency.get(ch)+1);
            }
            else {
                frequency.put(ch,1);
            }
        }

        System.out.println(frequency);

    }
}

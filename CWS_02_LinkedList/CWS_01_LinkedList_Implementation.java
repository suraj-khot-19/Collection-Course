package CWS_02_LinkedList;

public class CWS_01_LinkedList_Implementation {
    public static void main(String[] args) {
        /// 1
        Node node1=new Node();

        /// 2
        Node node2=new Node();

        node1.value=1;
        node1.next=node2;
        node2.value=2;
        node2.next=null;


        // 1 -> 2 -> null
    }
}

class Node{
    public int value;
    public Node next;
}

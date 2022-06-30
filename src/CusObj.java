import java.util.LinkedList;
class Node {
    private static String head;
    private static day data;
    private static Node next;

    public Node(String h,day d,Node n) {
        head = h;
        data = d;
        next = n;
    }
    public String getHead(){ // getNext() and getData() are the same
        return head;
    }
    public void setHead(String h){ // setNext() and setData() are basically the same
        head = h;
    }
    public void setData(day d){
        data = d;
    }
}
public class CusObj {
    String mark;
    double amount;
    String date;
}

class day {
    double total;
    String date;
    double toAdd;
}



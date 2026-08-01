package LinkedListt;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}


public class p1 {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(12);

        //create connections
        a.next=b;
        b.next=c;
        c.next=null;

        System.out.println(a.val);
        System.out.println(a.next.next.val);
        
    }
}

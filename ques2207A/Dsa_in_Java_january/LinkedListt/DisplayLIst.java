package LinkedListt;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}

public class DisplayLIst {


    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();

        //we can do it by for loop also
    
        // for(Node temp1=head;temp1!=null;temp1=temp1.next){
        //     System.out.print(temp1.val+" ");
        // }
    }
 
//by recursion
    public static void displayRec(Node head){
        if(head==null){
            return;
        }

        System.out.print(head.val+" ");

        displayRec(head.next);
    }

    public static int get(Node head,int idx){
        
        Node temp=head;

        //Node temp= head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    public static void main(String[] args) {
             // 10->20->30->40->50 

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);

        //Connect Kaise Kare
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;

        display(a);
        displayRec(a);
    }
}

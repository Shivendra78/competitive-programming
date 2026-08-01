package LinkedListt;

public class p4 {
    
}

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

class LL{
    Node head;
    Node tail;
    int size;

    public void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

    public void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null){
            addAtHead(val);
            return;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    void deleteHead(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }

    void display(){
        if(head==null){
            System.out.println("LL is empty");
        }

        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int search(int val){
        if(head==null){
            return -1 ;
        }
        int idx=0;
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    int get(int idx){
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        return temp.val;
    }

    void insert(int val,int idx){
        if(idx<0 || idx>size){
            System.out.println("Your indx is not correct");
        }
        Node temp=head;
        if(idx==0){
            addAtHead(val);
        }else if(idx==size){
            addAtTail(val);
        }else{
            Node n=new Node(val);
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
            size++;
        }
    }

    void delete(int idx){
        if(idx==0){
            deleteHead();
            return;
        }
        Node temp=head;
        for(int i=1;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx==size-1){
            tail=temp;
        }
        size--;
    }
}

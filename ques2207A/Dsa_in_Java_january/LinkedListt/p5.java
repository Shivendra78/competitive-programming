package LinkedListt;

public class p5 {
    
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

    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
        }else{

            temp.next=head;
            head=temp;
        }
        size++;
    }

    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null){
            addAtHead(val);
            return;
        }
        tail.next=temp;
        tail=temp;
        size++;
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("ll is empty");
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
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    int search(int val){
        if(head==null){
            return -1;

        }
        Node temp=head;
        int idx=0;
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
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        return temp.val;
    }

    void insert(int idx,int val){
        if(idx<0 || idx>size){
            System.out.println("invalid syntax/index error");
        }
        Node temp=head;;
        if(idx==0){
            addAtHead(val);
        }else if(idx==size){
            addAtTail(val);
        }else{
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;

        }
    }

    void delete(int idx){
        if(idx<0 || idx>size){
            System.out.println("Error in idx");
        }

        Node temp=head;
        for(int i=0;i<=idx-1;i++){
            temp=temp.next;
        }
        temp=temp.next.next;
        if(idx==size-1){
            tail=temp;
        }
        size--;
    }
}
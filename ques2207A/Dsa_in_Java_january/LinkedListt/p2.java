package LinkedListt;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }

}

class LinkList{
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
            System.out.println("empty ll");
            return;
        }
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }

    void dispaly(){
        Node temp=head;
        if(head==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void insert(int val,int idx){
        if(idx<0 || idx>size){
            System.out.println("INvalid idx");
            return ;
        }

        if(idx==0){
            addAtHead(val);
        }else if(idx==size){
            addAtTail(val);
        }else{
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                    temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;

        }
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
        for(int i=0;i<=idx-1;i++){
            temp=temp.next;
        }
        return temp.val;
    }

    void delete(int idx){
        if(idx<0 || idx>=size ){
            System.out.println("Invalid Index!");
            return;
        }
         if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
          temp.next=temp.next.next;//delete
        if(idx==size-1){
            tail=temp; //we are deleting tail
        }
        size--;
     }
    }

public class p2 {
    public static void main(String[] args) {
        p2 ll=new p2();
    }
}

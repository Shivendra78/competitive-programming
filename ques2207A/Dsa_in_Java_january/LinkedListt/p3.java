package LinkedListt;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }
}

public class p3 {
    ListNode head;
    ListNode tail;
    int size=0;

    // void insertAtHead(int val){
    //     ListNode temp=new ListNode(val);
    //     if(head==null){
    //         head=tail=temp;
    //     }else{
    //         temp.next=head;
    //         head.prev=temp;
    //         head=temp;

    //     }
    //     size++;
    // }
    void insertAtHead(int val){
        ListNode temp=new ListNode(val);
        if(head==null){
            head=temp=tail;
        }else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }

    void addAtTail(int val){
        ListNode temp=new ListNode(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            while(temp!=null){
                temp=temp.next;
            }
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
    }

    void deleteAtTail(){
       if(size==0){
        return ;
       }else{
           tail=tail.prev;
           tail.next=null;
        }
       size--;
 }
        void deleteAtHead(){
            if(size==0) return;
            else{
                head=head.next;
                head.prev=null;
            }
            if(size==1){
                head=tail=null;
            }
            size--;
        }

        void display(){
            ListNode temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();

        }

        void insertAtPos(int idx,int val){
           if(idx<0 || idx>size){
            System.out.println("invalid index!");
            return;
        }
        if(idx==0){
            insertAtHead(val);
            return;
        }
        ListNode a=new ListNode(val);
        ListNode temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        a.prev=temp;
        a.next=temp.next;
        temp.next=a;
        a.next.prev=a;
        size++;
        }
            void displayReverse(){
        ListNode temp=tail;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
    }


}

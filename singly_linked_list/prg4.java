package singly_linked_list;

public class prg4 {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print("-->"+current.data);
            current=current.next;
        }
        System.out.println("-->null");
    }
    public void addFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void addAtPos(int value,int pos){
        ListNode newNode=new ListNode(value);
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        ListNode current=head;
        int count=1;
        while(count<pos-1){
            current=current.next;
            count+=1;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    public int deleteFirst(){
        if(head==null){
            return 0;
        }
        head=head.next;
        return 1;
    }
    public int deleteLast(){
        if(head==null){
            return 0;
        }
        if(head.next==null){
            head=null;
            return 1;
        }
        ListNode current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return 1;
    }
    public static void main(String[] args) {
        prg4 obj=new prg4();
        obj.head=new ListNode(10);
        // ListNode second=new ListNode(12);
        // obj.head.next=second;
        // obj.display();
        // obj.addFirst(9);
        // obj.addLast(13);
        // obj.display();
        // obj.addAtPos(11, 3);
        obj.display();
        int result=obj.deleteLast();
        if(result==0){
            System.out.println("List is empty");
        }
        else{
            System.out.println("After removing");
            obj.display();
        }
    }
}

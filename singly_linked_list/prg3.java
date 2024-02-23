package singly_linked_list;

public class prg3 {
    private ListNode head;
    private static class ListNode{
        private ListNode next;
        private int data;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current != null){
            System.out.print("-->"+current.data);
            current=current.next;
        }
        System.out.print("-->null");
    }
    public void insertAtFirst(int data){
        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        ListNode current=head;
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        while(current.next != null){
            current=current.next;
        }
        current.next=newNode;
    }
    public static void main(String[] args) {
        prg3 obj=new prg3();
        // obj.insertAtFirst(10);
        obj.insertAtEnd(11);
        obj.display();
    }
}

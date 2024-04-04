package singly_linked_list;

public class prg1 {
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
        while(current != null){
            System.out.print("-->"+current.data);
            current=current.next;
        }
        System.out.print("-->null");
    }
    public void displayLast(int n){
        ListNode i=head;
        ListNode j=head;
        while(n!=0){
            j=j.next;
            n--;
        }
        while(j!=null){
            i=i.next;
            j=j.next;
        }
        System.out.println(i.data);
    }
    public static void main(String[] args) {
        prg1 obj=new prg1();
        obj.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(13);
        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        obj.display();
        System.out.println();
        obj.displayLast(3);
    }
}
 
package singly_linked_list;

public class prg2 {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int len(){
        if(head == null){
            return 0;
        }
        ListNode current=head;
        int count=0;
        while(current!=null){
            count+=1;
            current=current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        prg2 obj=new prg2();
        obj.head=new ListNode(10);
        ListNode second=new ListNode(12);
        ListNode third=new ListNode(13);
        ListNode fourth=new ListNode(15);
        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        int result=obj.len();
        System.out.println("The length is :"+result);
    }
}

package singly_linked_list;

public class prg5 {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    //to print list
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print("-->"+current.data);
            current=current.next;
        }
        System.out.println("-->null");
    }
    //add node at first
    public void addFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    //add node at last
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
    //add node at given position
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
    //delete first element
    public int deleteFirst(){
        if(head==null){
            return 0;
        }
        head=head.next;
        return 1;
    }
    //delete last element
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
    //search element in sll
    public int searchin(int value){
        ListNode current=head;
        while(current!=null){
            if(current.data==value){
                return 1;
            }
            current=current.next;
        }
        return 0;
    }
    //to reverse list
    public ListNode reverseList(){
        ListNode current=head;
        ListNode previous=null, next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    public void display(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print("-->"+current.data);
            current=current.next;
        }
        System.out.println("-->null");
    }
    // middle most element
    public void midd(){
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        System.out.print("The middle value is:"+slowptr.data);
    }
    public static void main(String[] args) {
        prg5 obj=new prg5();
        obj.head=new ListNode(5);
        obj.addFirst(10);
        obj.addLast(12);
        obj.addLast(15);
        obj.addLast(23);
        obj.display();
        // obj.display();
        // int resu=obj.searchin(23);
        // if(resu==1){
        //     System.out.println("Element found");
        // }
        // else{
        //     System.out.println("Element not found");
        // }
        // ListNode res=obj.reverseList();
        // obj.display(res);
        obj.midd();
    }
}

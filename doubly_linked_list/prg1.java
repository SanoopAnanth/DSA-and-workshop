package doubly_linked_list;

public class prg1 {
    private Node head,tail;
    private static int length=0;
    static class Node{
        int data;
        Node next,previous;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.previous=null;
        }
    }
    public prg1(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public void displayForward(){
        Node temp=head;
        while(temp!=null){
            System.out.print("-->"+temp.data);
            temp=temp.next;
        }
        System.out.println("-->Null");
    }
    public void displayBackward(){
        Node current=tail;
        while(current!=null){
            System.out.print("-->"+current.data);
            current=current.previous;
        }
        System.out.println("-->Null");
    }
    public static Boolean isEmpty(){
        return(length==0);
    }
    public void addFirst(int value){
        Node newNode=new Node(value);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            length++;
            return;
        }
        newNode.next=head;
        head.previous=newNode;
        head=newNode;
        length++;
    }
    public void addLast(int value){
        Node newNode=new Node(value);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            length++;
            return;
        }
        tail.next=newNode;
        newNode.previous=tail;
        tail=newNode;
        length++;
    }
    public int getLength(){
        return length;
    }
    public void deleteFirst(){
        if(isEmpty())
        {
            System.out.println("The list is Empty, no element to delete");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            length--;
            return;
        }
        head=head.next;
        head.previous=null;
        length--;
    }
    public void deleteLast(){
        if(isEmpty())
        {
            System.out.println("The list is Empty, no element to delete");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            length--;
            return;
        }
        tail=tail.previous;
        tail.next=null;
        length--;
    }
    public static void main(String[] args) {
        prg1 obj=new prg1();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addLast(3);
        obj.addLast(5);
        obj.displayForward();
        // obj.displayBackward();
        System.out.println("The length of the list is "+obj.getLength());
        obj.deleteFirst();
        obj.displayForward();
        obj.deleteLast();
        obj.displayForward();
        System.out.println("The length of the list is "+obj.getLength());
    }
}

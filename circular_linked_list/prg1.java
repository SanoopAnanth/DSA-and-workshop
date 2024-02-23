package circular_linked_list;

public class prg1 {
    private Node last;
    private static int length=0;
    private static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            last=newNode;
            last.next=last;
            length++;
            return;
        }
        newNode.next=last.next;
        last.next=newNode;
        last=last.next;
        length++;  
    }
    public void addFirst(int value){
        Node newNode=new Node(value);
        if(isEmpty()){
            last=newNode;
            last.next=last;
            length++;
            return;
        }
        newNode.next=last.next;
        last.next=newNode;
        length++;
    }
    public void display(){
        if(getLength()==0){
            System.out.println("List is empty, no element to display");
            return;
        }
        Node temp=last.next;
        while(temp!=last){
            System.out.print("-->"+temp.data);
            temp=temp.next;
        }
        System.out.println("-->"+last.data);
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty, no element to remove");
            return;
        }
        if(getLength()==1){
            last=null;
            length--;
            // System.out.println("Remove operation was successful, now list is empty");
            return;
        }
        last.next=last.next.next;
        length--;
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("List is empty, no element to remove");
            return;
        }
        if(getLength()==1){
            last=null;
            length--;
            // System.out.println("Remove operation was successful, now list is empty");
            return;
        }
        Node temp=last;
        while(temp.next!=last){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        last.next=null;
        last=temp;
        length--;
    }
    public static void main(String[] args) {
        prg1 obj=new prg1();
        obj.addFirst(1);
        obj.addFirst(3);
        obj.addFirst(12);
        obj.addLast(10);
        System.out.println(obj.getLength());
        obj.display();
        // obj.removeFirst();
        // obj.display();
        obj.removeLast();
        obj.display();
    }
}

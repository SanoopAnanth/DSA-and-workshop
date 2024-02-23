package stack;

public class prg1 {
    private Node top;
    private static int length;
    private static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
        length++;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int pop(){
        int val=top.data;
        top=top.next;
        length--;
        return val;
    }
    public void display(){
        Node current=top;
        while(current!=null){
            System.out.println("--|"+current.data+"|--");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        prg1 obj=new prg1();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.display();
        System.out.println("The element "+obj.pop()+" successfully");
        obj.display();
    }
}

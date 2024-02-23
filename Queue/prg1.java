package Queue;

public class prg1 {
    private Node front,rear;
    private int length;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
            length++;
            return;
        }
        rear.next=newNode;
        rear=rear.next;
        length++;
    }
    public int dequeue(){
        if(isEmpty()){
            throw new  RuntimeException("Queue is already empty, nothing to dequeue");
        }
        int data=0;
        if(length()==1){
            front=null;
            rear=null;
            length--;
        }else{
            data=front.data;
            front=front.next;
            length--;
        }
        return data;
    }
    public void display(){
        Node current=front;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        while(current!=null){
            System.out.print("-->"+current.data);
            current=current.next;
        }
        System.err.println("-->Null");
    }
    public static void main(String[] args) {
        prg1 obj=new prg1();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.display();
        int result=obj.dequeue();
        System.out.println("Dequeued element"+result);
        obj.display();
    }
}

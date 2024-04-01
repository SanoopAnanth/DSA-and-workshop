public class QueueImp {
    int front;
    int rear,capacity;
    int arr[];
    int ele;
    int size;
    QueueImp(int c){
        this.capacity=c;
        this.arr=new int[c];
    }
    public void enQueue(int ele){
        if(size==capacity){
            return;
        }
        arr[rear]=ele;
        rear=(rear+1)%capacity;
        size++;
    }
    public int deQueue(){
        if(size==0){
            return -1;
        }
        int c=arr[front];
        front=(front+1)%capacity;
        size--;
        return c;
    }
    public void display(){
        for(int i=front;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i!=front;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        QueueImp queue=new QueueImp(4);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        int ele=queue.deQueue();
        queue.enQueue(7);
        queue.display();
        System.out.println("Dequeued element: "+ele);
    }
}

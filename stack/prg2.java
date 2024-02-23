package stack;

import java.util.EmptyStackException;

public class prg2 {
    private int top;
    private int arr[];
    prg2(int capacity){
        top=-1;
        arr=new int[capacity];
    }
    prg2(){
        this(10);
    }
    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        top++;
        arr[top]=data;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int val=arr[top];
        top--;
        return val;
    }
    public int peek(){
        return arr[top];
    }
    public boolean isFull(){
        return(arr.length==top+1);
    }
    public boolean isEmpty(){
        return top<0;
    }
    public void display(){
        int i=top;
        while(i>=0){
            System.out.println(arr[i]);
            i--;
        }
    }
    public static void main(String[] args) {
        prg2 obj=new prg2(3);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        obj.display();
        System.out.println("Pop in action:"+obj.pop());
        obj.pop();
        obj.pop();
        obj.pop();
    }
}

package singly_linked_list;

public class prg6 {
    Node head;
     static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void display(){
        Node current=head;
        while(current!=null){
            System.out.print("-->"+current.data);
            current=current.next;
        }
        System.out.println("-->Null");
    }
    //function to find nth term from end
    void nthlast(int n){
        Node refptr=head;
        Node athptr=head;
        int count=0;
        while(count<n){
            refptr=refptr.next;
            count++;
        }
        while(refptr!=null){
            refptr=refptr.next;
            athptr=athptr.next;
        }
        System.out.println("The "+n+" term from end is "+athptr.data);
    }
    //function to remove duplicates in a sorted sll
    void removeDuplicate(){
        Node current=head;
        while(current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
    }
    //function to delete a node for given element
    public void delItemOnKey(int value){
        Node current=head;
        if(head.data==value){
            head=head.next;
            return;
        }
        while(current.next!=null){
            if(current.next.data==value){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
    }
    //function to add a list in a sorted linked list
    public void addSortList(int value){
        Node newNode=new Node(value);
        Node current=head;
        Node temp=null;
        while(current!=null && current.data<newNode.data){
            temp=current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;
    }
    //function to detect whether there is any loop in the linked list
    public boolean detectLoop(){
        Node fastptr=head;
        Node slowptr=head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(fastptr==slowptr){
                return true;
            }
        }
        return false;
    }
    //a same function to detect loop but to even detect starting point of loop
    public Node detectStaLoop(){
        Node fastptr=head;
        Node slowptr=head;
        Node resu;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(fastptr==slowptr){
                resu=rtrLoop(slowptr);
                return resu;
            }
        }
        return null;
    }
    public Node rtrLoop(Node slowptr){
        Node temp=head;
        while(temp!=slowptr){
            temp=temp.next;
            slowptr=slowptr.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        prg6 obj=new prg6();
        obj.head=new Node(11);
        Node first=new Node(12);
        Node second=new Node(13);
        Node third=new Node(14);
        Node fourth=new Node(15);
        Node fifth=new Node(16);
        obj.head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=second;
        // obj.display();
        // obj.addFirst(9);
        // obj.display();
        // obj.nthlast(2);
        // obj.removeDuplicate();
        // obj.display();
        // obj.display();
        // obj.removeDuplicate();
        // obj.delItemOnKey(13);
        // obj.addSortList(15);
        // obj.display();
        Node result=obj.detectStaLoop();
        if(result!=null){
            System.out.println("Loop detected with starting point as "+result.data);
        }
        else{
            System.out.println("Loop is not present");
        }
    }
}

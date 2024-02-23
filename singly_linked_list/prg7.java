package singly_linked_list;

public class prg7 {
    private Node head;
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print("-->"+current.data);
            current=current.next;
        }
        System.out.println("-->Null");
    }
    public boolean isLoopPresent(){
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
    public void callBreakMethod(){
        Node fastptr=head;
        Node slowptr=head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(fastptr==slowptr){
                BreakMethod(slowptr);
                return;
            }
        }
    }
    public void BreakMethod(Node slowptr){
        Node temp=head;
        while(temp.next!=slowptr.next){
            temp=temp.next;
            slowptr=slowptr.next;
        }
        slowptr.next=null;
    }
    public Node createList1(){
        Node first=new Node(3);
        Node second=new Node(4);
        Node third=new Node(7);
        Node fourth=new Node(8);
        first.next=second;
        second.next=third;
        third.next=fourth;
        return first;
    }
    public Node createList2(){
        Node fst=new Node(2);
        Node snd=new Node(5);
        fst.next=snd;
        return fst;
    }
    public Node mergeNode(Node a, Node b){
        Node dummy=new Node(0);
        Node tail=dummy;
        while(a!=null && b!=null){
            if(a.data<b.data){
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
            if(a==null){
                tail.next=b;
            }
            else{
                tail.next=a;
            }
        }
        return dummy.next;
    }
    public Node addList(Node a, Node b){
        Node dummy=new Node(0);
        Node tail=dummy;
        int carry=0;
        while(a!=null || b!=null){
            int x=(a!=null)?a.data:0;
            int y=(b!=null)?b.data:0;
            int sum=carry+x+y;
            carry=sum/10;
            tail.next=new Node(sum%10);
            tail=tail.next;
            if(a!=null) a=a.next;
            if(b!=null) b=b.next;
        }
        if (carry>0){
            tail.next=new Node(carry);
        }
        return dummy.next;
    }
    public void displayObj(Node head){
        Node current=head;
        while(current!=null){
            System.out.print("-->"+current.data);
            current=current.next;
        }
        System.out.println("-->Null");
    }
    public static void main(String[] args) {
        prg7 obj=new prg7();
        // obj.a=new Node(1);
        // Node first=new Node(3);
        // Node second=new Node(4);
        // Node third=new Node(6);
        // Node fourth=new Node(14);
        // obj.a.next=first;
        // first.next=second;
        // second.next=third;
        // third.next=fourth;
        // obj.display();
        // System.out.println(obj.isLoopPresent());
        // obj.callBreakMethod();
        // obj.display();
        // obj.b=new Node(2);
        // Node fst=new Node(3);
        // Node snd=new Node(4);
        // Node thd=new Node(6);
        // Node fth=new Node(14);
        // obj.a.next=fst;
        // fst.next=snd;
        // snd.next=thd;
        // thd.next=fth;
        Node a = obj.createList1();
        Node b = obj.createList2();
        obj.displayObj(a);
        obj.displayObj(b);
        // Node result=obj.mergeNode(a, b);
        // obj.displayObj(result);
        Node res=obj.addList(a, b);
        obj.displayObj(res);
    }
}

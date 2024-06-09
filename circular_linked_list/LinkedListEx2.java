package circular_linked_list;

import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.addFirst(1);
        l.addLast(2);
        l.addLast(3);
        l.add(2, 5);
        System.out.println(l);
        l.removeFirst() ;
        l.removeLast();
        l.remove(1);
        System.out.println(l);

    }
}

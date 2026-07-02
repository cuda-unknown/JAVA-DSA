package LinkedList;

import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10); //time complexity O(1) using collections
        ll.add(20);
        ll.add(30);

        ll.add(2,22);  // Time complexity O(n)

        ll.addFirst(1); // Time complexity O(1)
        ll.addLast(90);

        System.out.println(ll);

        System.out.println(ll.get(3)); //time complexity O(n)
        System.out.println(ll.getLast());

        ll.remove(); //removes the first element 
        System.out.println(ll);

        ll.remove(1);
        System.out.println(ll);

        ll.remove(Integer.valueOf(90));
        System.out.println(ll);

        


        //use clear then this 
        ll.removeAll(ll);
        System.out.println(ll);

        ll.clear(); // Time Complexity O(n)
        System.out.println(ll);
    }
}

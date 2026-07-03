package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Collection {

    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10); //time complexity O(1) using collections
        ll.add(20);
        ll.add(30);

        ll.add(2,22);  // Time complexity O(n)

        ll.addFirst(1); // Time complexity O(1)
        ll.addLast(90);
        ll.add(7);
        ll.add(03,13);

        // System.out.println(ll);

        // if(ll.contains(20)) System.out.println( "element exist");
        // else System.out.println("does not exist ");
        // System.out.println();

        Collections.reverse(ll);
        System.out.println(ll);
        System.out.println();

        Iterator<Integer> it=ll.iterator();
        // while(it.hasNext()) {
        //     System.out.print(it.next()+" ");
        // }

        System.out.println();

        while(it.hasNext()){
            if(it.next()%2!=0) it.remove();
        }
        System.out.println(ll);


        System.out.println();


        // LinkedList<String> ls=new LinkedList<>();
        // ls.add("App");
        // ls.add("is");
        // ls.add("down");
        // ls.add("Server");

        // if(ls.contains("App")) System.out.println("element exist");
        // else System.out.println("Element does not exist");

    }
}

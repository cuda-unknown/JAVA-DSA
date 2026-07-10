package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(20);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        System.out.println(set.add(10));
        System.out.println(set);

        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }

        System.out.println("Size is: " + set.size());

        // set.clear();
        // System.out.println(set);

        System.out.println(set.contains(1));

    }
}

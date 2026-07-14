package Trees;

import java.util.TreeSet;

public class Collection {
    public static void main(String[] args) {
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(10);
        tree.add(50);
        tree.add(20);
        tree.add(30);
        tree.add(40);

        
        System.out.println(tree+" ");

        System.out.println("Smallest :"+tree.first()); //gives smallest value
        System.out.println("Largest :"+tree.last()); //gives largest Value

        System.out.println("Higher :"+tree.higher(20)); //value one greater than the one we want
        System.out.println("Lower :"+tree.lower(30)); //value one samller

        System.out.println("Floor :"+tree.floor(15));
        System.out.println("Ceiling :"+tree.ceiling(15));

        System.out.println("Floor on the existing Value : "+tree.floor(10));
        System.out.println("Ceiling on the existing Value :"+tree.ceiling(20));

        System.out.println("Reversing : "+tree.descendingSet());

        System.out.println("Size of tree : "+tree.size());

    }
}

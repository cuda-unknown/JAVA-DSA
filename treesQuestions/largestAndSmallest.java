package treesQuestions;

import java.util.TreeSet;

public class largestAndSmallest {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(50);
        tree.add(20);
        tree.add(90);
        tree.add(60);
        System.out.println("Finding the Largest : " + tree.last());

        System.out.println("Finding the smallest tree : " + tree.first());

    }
}

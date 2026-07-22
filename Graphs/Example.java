package Graphs;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        // 0 >1,2
        // 1> 0,3
        // 2 >0,3
        // 3 >1,2
        // [[1,2],[0,3],[0,3],[1,2]]
        // 0
        // 1 2
        // 3
        int v = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(3).add(2);
        System.out.println(graph);

    }
}

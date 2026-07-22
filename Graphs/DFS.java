package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int start){
        Stack<Integer> s=new Stack<>();
        boolean visited[]=new boolean[graph.size()];
        s.push(start);

        while(!s.isEmpty()){
            int ele=s.pop();

            if(!visited[ele]){
                visited[ele]=true;

                System.out.print(ele+" ");

                ArrayList<Integer> list=graph.get(ele);

                for(int i=list.size()-1;i>=0;i--){
                    int j=list.get(i);
                    if(!visited[i]) {
                        s.push(j);
                    }
                }
            }
        }

    }

    public static void dfsTraversal(ArrayList<ArrayList<Integer>> graph, int start,boolean visited[]){
        visited[start]=true;
        System.out.print(start+" ");
        for(int i: graph.get(start)){
            if(!visited[i]){
                dfsTraversal(graph, i, visited);
            }
        }
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(5);
        graph.get(2).add(3);
        graph.get(2).add(4);
        graph.get(5).add(6);

        System.out.println();
        dfs(graph, 1);

        System.out.println();

        boolean visited[]=new boolean[graph.size()];
        dfsTraversal(graph, 1, visited);
    }
}

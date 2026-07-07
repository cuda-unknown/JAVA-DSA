package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class example {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        q1.add(1);
        q1.add(12);
        q1.add(22);

        System.out.println(q1);

        // q1.clear();
        // System.out.println( q1);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
        


    }
}

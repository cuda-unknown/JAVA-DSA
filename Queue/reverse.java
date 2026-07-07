package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(7);
        q1.offer(9);
        System.out.println(q1);

        Stack<Integer> st = new Stack<>();
        while (!q1.isEmpty()) {
            st.push(q1.poll());
        }

        System.out.println(st);

        while (!st.isEmpty()) {
            q1.add(st.pop());
        }
        System.out.println(q1);

    }
}

package stack;

import java.util.Stack;

public class example {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
        // all Time Complexity O(1)

        System.out.println(st.isEmpty());
        System.out.println(st.size());

        st.pop();
        st.clear(); //O(n)
        System.out.println(st);
        for(int i:st){
            System.out.println(i+" ");
        }

        st.search(1); //O(n)
        st.contains(2); //o(n)
    }
}

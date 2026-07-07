package stack;

import java.util.Stack;

public class Sum {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(11);
        st.push(20);
        int sum=0;
        for(int i:st){
            sum+=i;
        }
        System.out.println(sum);
    }
}

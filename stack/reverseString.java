package stack;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String s="hello";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        System.out.println(sb);

    }
}

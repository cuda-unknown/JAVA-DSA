package Recursion;

public class OneToN {
    public static int basic(int n){
        if(n==0) return 0 ;
        basic(n-1);
        System.out.print(n+" ");
        return n;

    }

    public static void basics(int n){
        if(n==0) return ;
        basic(n-1);
        System.out.println(n+" ");
    }

    public static void reverse(int n) {
        
        if(n==0) return ;
        System.out.print(n+" ");
        reverse(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        basic(n);
        System.out.println();
        reverse(n);
    }
}

package Recursion;

public class factorial {
    public static int facto(int n){
        if(n==0) return 1;
        return n* facto(n-1);
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(facto(n));
    }
}

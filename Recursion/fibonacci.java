package Recursion;

public class fibonacci {
    public static int fib(int n){
        if(n==0 || n==1) return n;
        int sum=0;
        sum+=fib(n-2) + fib(n-1);
        // return fib(n-2) + fib(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
}

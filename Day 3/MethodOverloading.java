// package Day 3;

public class MethodOverloading {

    public static int sum(int a , int b){
        return a + b;
    }

    public static int sum(int a , int b , int c){
        return a + b + c;
    }

    public static int sub(int a , int b){
        return a - b;
    }

    public static float sub(float a , float b) {
        return a - b;
    }

    public static String add(String st ,String sc){
        return st + sc;
    }
    
    public static int add(char c ,char d){
        return (c + d);
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 6));
        System.out.println(sum(3, 10, 2));
        System.out.println(sub(10, 5));
        System.out.println(sub(3.4f, 1.2f));
        System.out.println(add("ab","ac"));
        System.out.println(add('a','m'));
    }
}

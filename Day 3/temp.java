// package Day 3;
import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int n=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int a=sc.nextInt();

        int temp=n;
        n=a;
        a=temp;
        System.out.println("1st Number became :"+ n + "\n" +"2nd Number became :"+ a);
        sc.close();
    }
}

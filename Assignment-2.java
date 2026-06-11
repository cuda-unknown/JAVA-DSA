import java.util.Scanner;
class Assignment{
    public static void positiveNegativeZero(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number:");
        int n=sc.nextInt();
        if(n==0) System.out.println("Number is Zero");
        else if(n<0) System.out.println("Number is Negative");
        else System.out.println("Number is Positive");
        sc.close();
    }

    public static void leapYearOrNot(){
        System.out.println();
    }

    public static void largestOfThree(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Numbers for n:");
        int n=s.nextInt();
        System.out.println("Enter any Number for a");
        int a=s.nextInt();
        System.out.println("Enter any number for b");
        int b=s.nextInt();

        if(n>a && n>b) System.out.println(n+" Is the Lagest");
        else if(a>n && a>b) System.out.println(a+" Is the Largest ");
        else System.out.println(b+" Is the Largest");
        s.close();
    }

    public static void vowelOrConsonent(){
    }


    public static void  main(String []args){
        positiveNegativeZero();
    
        largestOfThree();
    } 
}

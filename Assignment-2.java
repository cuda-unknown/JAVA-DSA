import java.util.Scanner;
class Assignment{
    public static void positiveNegativeZero(){
        System.out.println("Q1");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number:");
        int n=sc.nextInt();
        if(n==0) System.out.println("Number is Zero");
        else if(n<0) System.out.println("Number is Negative");
        else System.out.println("Number is Positive");
        sc.close();
    }

    public static void leapYearOrNot(){
        System.out.println("Q2");
        Scanner st =new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int n=st.nextInt();
        if(n%4==0)  System.out.println("Leap Year");
        else System.out.println("Not a leap year ");
        st.close();
    }

    public static void largestOfThree(){
         System.out.println("Q3");
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
        System.out.println("Q4");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Character : ");
        char c=s.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') System.out.println(c+ " is vowel");
        else System.out.println("Your Character is Consonent");
        s.close();
    }

    public static void marks(){
        System.out.println("Q5");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Marks : ");
        double marks=s.nextDouble();

        if(marks>=90 && marks<=100 ) System.out.println("Grade A");
        else if(marks>=80 && marks<90) System.out.println("Grade B");
        else if(marks>=70 && marks<80) System.out.println("Grade C");
        else if(marks>=60 && marks<70) System.out.println("Grade D");
        else System.out.println("Fail"); 
        s.close();
    }
   
    public static void divisibleBy5And11(){
        System.out.println("Q6");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number To Check If Divisible by 5 and 11: ");
        int m=s.nextInt();
        if(m%5==0 && m%11==0) System.out.println("Number is Divisible");
        else System.out.println("Failure");
        s.close();
    }

    public static void printingEvenNo(){
        System.out.println("Q7");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int m=s.nextInt();
        for(int i=2;i<=m;i++){
            if(i%2==0) System.out.println(i);
        }
        s.close();
    }

    public static void multiplication(){
        System.out.println("Q8");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int m=s.nextInt();
        for(int i=1;i<=10;i++){
            int mul=m*i;
            System.out.println(mul);
        }
        s.close();
    }


    public static void sumOfNnumbers(){
        System.out.println("Q9");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int m=s.nextInt();
        int sum=0;
        for(int i=1;i<=m;i++){
            sum+=i;
        }
        System.out.println("Sum of N Natural Numbers is: "+sum);
        s.close();
    }

    public static void factorialOfGivenNumber(){
        System.out.println("Q10");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int m=s.nextInt();
        int fac=1;
        for(int i=m;i>0;i--){
            fac*=i;
        }
        System.out.println("Factorial of Number is: "+fac);
        s.close();
    }

    public static void pattern1(){
        System.out.println("Q11");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int m=s.nextInt();
        for(int i=0;i<=m;i++){
            for(int j=0;j<=m-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }

    public static void pattern2(){
        System.out.println("Q12");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int m=s.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }


    public static void DivBy3And5(){
        System.out.println("Q13");
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0) System.out.println(i);
        }
    }

    public static void skipMultipleOf3(){
        System.out.println("Q14");
        for(int i=1;i<=50;i++){
            if(i%3==0) continue;
            else System.out.println(i);
        }
    }

    public static void continuePrinting(){
        System.out.println("Q15");
        Scanner s=new Scanner(System.in);
        do{
            System.out.print("Enter Number: ");
            int m=s.nextInt();
            System.out.println(m);
            if(m==0) break;
        }while(true);
        s.close();
    }

    public static void first10(){
        System.out.println("Q16");
        System.out.println("Fist 10 numbers Divisible By 7 from 1 To 100");
        int count=0;
        for(int i=1;i<=100;i++){
            if(i%7==0){
                System.out.println(i);
                count++;
            }
            if(count==10) break;

        }
    }

    public static void  main(String []args){
        positiveNegativeZero();

        leapYearOrNot();
        
        largestOfThree();
        
        vowelOrConsonent();
        
        marks();
        
        divisibleBy5And11();

        printingEvenNo();

        multiplication();

        sumOfNnumbers();

        factorialOfGivenNumber();

        pattern1();

        pattern2();

        DivBy3And5();

        skipMultipleOf3();

        continuePrinting();
        
        first10();

    } 
}

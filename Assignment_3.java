public class Assignment_3{
    public static void displayMessage(){
        System.out.println("Welcome to Java Programming");
    }

    public static int square(int n){
        int square=n*n;
        return square;
    }

    public static int cube(int n){
        int cube =n*n*n;
        return cube;
    }

    public static boolean isEven(int n){
        if(n%2==0) return true;
        else return false; 
    }

    public static int findMax(int n,int a){
        if(n>a) return n;
        else return a;
    }

    public static int findLargest(int n,int a,int b){
        if(n>a && n>b) return n;
        else if (a>n && a>b) return a;
        else return b;
    }

    public static int Factorial(int a){
        int factorial=1;
        for(int i=a;i>0;i--){
            factorial*=i;
        }
        return factorial;
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static int reverseNumber(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            rev=rev*10+rem;
        }
        return rev;
    }

    public static boolean isPalindrome(int n){
        int i=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            rev=rev*10+rem;
        }
        if(rev==i) return true;
        else return false;
    } 

    public static void patternOne(int c){
        for(int i=0;i<c;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternTwo(int c){
        for(int i=c;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternThree(int c){
        for(int i=1;i<=c;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patternFour(int c){
        for(int i=c;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patternFive(int c){
        for(int i=0;i<c;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patternSix(int c){
        for(int i=c;i>=1;i--){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patternSeven(int c){
        for(int i=1;i<=c;i++){
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void patternEight(int c){
        for(int i=c;i>=1;i--){
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternNine(int c){
        for(int i=1;i<=c;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void patternTen(int c){
        for(int i=0;i<c;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayMessage();

        int n=14;
        System.out.println("Square of number is: "+square(n));

        System.out.println("Cube of the number is : "+cube(n));

        System.out.println("IS the Number Even ? :"+isEven(n));

        int a=5;
        System.out.println("The Bigger of the two numbers is:"+findMax(n, a));

        int b=13;
        System.out.println("The greater of 3 NUmbers is: "+findLargest(n, a, b));

        System.out.println("The Factorail of number is:"+Factorial(a));

        System.out.println("Is the number Prime" +isPrime(n));

        System.out.println("Reverse of the Number is: "+reverseNumber(n));

        System.out.println("Is the Number Palindrome "+isPalindrome(n));

        int c=5;
        System.out.println("Printing First Pattern : ");
        patternOne(c);

        System.out.println("Printing 2nd Pattern");
        patternTwo(c);

        System.out.println("Printing 3rd Pattern");
        patternThree(c);

        System.out.println("Printing 4th Pattern");
        patternFour(c);

        System.out.println("Printing 5th Pattern");
        patternFive(c);

        System.out.println("Printing 6th Pattern");
        patternSix(c);

        System.out.println("Printing 7th Pattern");
        patternSeven(c);

        System.out.println("Printing 8th Pattern");
        patternEight(c);

        System.out.println("Printing 9th Pattern");
        patternNine(c);

        System.out.println("Printing 10th Pattern");
        patternTen(c);

    }
}

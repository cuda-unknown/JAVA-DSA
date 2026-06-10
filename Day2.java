import java.util.Scanner;
public class Day2 {
    public static void func(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(i);
        }
    }

    public static void sum(){
        Scanner su =new Scanner(System.in);
        System.out.print("Enter number:");
        int n=su.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

     public static void evenOdd(){
        Scanner evo =new Scanner(System.in);
        System.out.print("Enter number:");
        int n=evo.nextInt();

        if(n%2==0) System.out.println("Even");
        else System.out.println("Odd");
        
    }

    public static void mulOf10(){
        Scanner mul =new Scanner(System.in);
 
        do{
            System.out.print("Enter number:");
            int n=mul.nextInt();
            if(n%10==0) break;
            else{ 
                System.out.println("Entered number is:"+n);
            }    
        }while(true);
    }
    
    public static void rev(){
        Scanner r=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=r.nextInt();
        while(n>0){
            int rem=n%10;
            System.out.println(rem);
            n=n/10;
        }
        r.close();
    }    


    public static void fac(){
        Scanner fac=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=fac.nextInt();
        int facto=1;
        for(int i=n;i>0;i--){
            facto*=i;
        }
        System.out.println(facto);
        fac.close();
    }

    public static void pattern(){
        Scanner pat=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=pat.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        pat.close();
    }
    
    public static void stairCase(){
        Scanner stair=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=stair.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        stair.close();
    }

    public static void numberPattern(){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=num.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
            
        }
        num.close();
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number");
        int b=s.nextInt();


        for(int i=b;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("\n");
        
        
        while(b>=1){
            System.out.println(b);
            b--;
        }
        System.out.println("\n");


        System.out.print("Enter number c:");
        int c=s.nextInt();


        do{
            System.out.println(c);
            c--;
        }while(c>=1);

        func();

        sum();

        evenOdd();

        mulOf10();

        rev();

        fac();

        pattern();

        stairCase();

        numberPattern();

    }
}

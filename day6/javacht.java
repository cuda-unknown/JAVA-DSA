package day6;

public class javacht{
    public static void main(String[] args) {
        String str1=new String("Hola");

        String str2=new String("HEloo");
        
        String str3=new String("HEloo");
        String str4=new String("Hola");
        
        if(str1.equals(str2)) System.out.println("Success");
        else if(str1.equals(str3)) System.out.println("Success from str3");

        //this won't work bcz new is creating the thing at a diff position
        else if(str1==str4) System.out.println("win");  
    
        else System.out.println("Success from str4");
    }
}

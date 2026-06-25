package OOPS;

class Animal {
    void legs(){
        System.out.println("All animals have legs");
    }
}
public class Inheritance extends Animal{
    void legs(){
        System.out.println("All dogs have 4 legs");
    }
    void sound(){
        System.out.println("All dogs bark as 'woof'");
    }
    
    public static void main(String[] args) {
        Inheritance d1=new Inheritance();
        d1.legs();
    }
}


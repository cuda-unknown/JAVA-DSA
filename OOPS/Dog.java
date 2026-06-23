package OOPS;

class Animal {
    void legs(){
        System.out.println("All animals have legs");
    }
}
public class Dog extends Animal{
    void legs(){
        System.out.println("All dogs have 4 legs");
    }
    void sound(){
        System.out.println("All dogs bark as 'woof'");
    }
    
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.legs();
    }
}


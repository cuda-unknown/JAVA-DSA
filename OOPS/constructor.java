package OOPS;

public class constructor {
    String name;
    int age;
    constructor(){
        System.out.println("Calling Success");
    }

    constructor(int a,String n){
        age=a;
        name=n;
    }
    public static void main(String[] args) {
        constructor c1=new constructor();
        System.out.println(c1.name);
        
        constructor c2=new constructor(19,"Sohi");
        System.out.println(c2.name+" "+c2.age);
    }
}

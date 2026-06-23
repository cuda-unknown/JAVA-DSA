package OOPS;

public class example {

    String name;
    int age;

    void mark(){
        System.out.println("Mark your attendance ");
    }

    void represent(){
        mark();
        
        System.out.println(name);

        System.out.println(age);
    }

    public static void main(String[] args) {
        example n1=new example();
        n1.name="Sohi";
        n1.age=20;

        example n2=new example();
        n2.name="Nirmal";
        n2.age=19;

        // System.out.println(n1.name+" "+n1.age);

        n1.represent();
        n2.represent();
    }
}

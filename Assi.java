import java.util.Scanner;

class java {
    public static void main(String[] args) {
        // Q1
        System.out.println("Welcome to Java Programming");

        // Q2
        System.out.println("My name is: Nirmaldeep Singh" + "\n" + "Course: B.Tech CSE" + "\n"
                + "College Name: Desh Bhagat University");

        // Q3
        String name = "Nirmaldeep Singh";
        int age = 19;
        double percentage = 99.9;
        System.out.println("Nmaeis:" + name + "\n" + "Age is:" + age + "\n" + "Percentage is:" + percentage);

        // Q4
        float a = 10, b = 20;
        System.out.println("Sum is :" + (a + b));

        // Q5
        System.out.println("Addition is:" + (a + b) + "\n" + "Substraction:" + (a - b) + "\n" + "Multiplication:"
                + (a * b) + "\n" + "Division: " + (a / b));

        // Q6
        System.out.println("Area of Rectangle:" + (a * b));

        // Q7
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name: ");
        String ne = s.nextLine();
        System.out.println("Welcome " + ne);

        // Q8
        System.out.println("Enter number:");
        int in = s.nextInt();
        System.out.println("Number is:" + in);

        // Q9
        System.out.println("Enter two numbers :");
        int l = s.nextInt();
        int e = s.nextInt();
        System.out.println("Sum is:" + (l + e));

        // Q10
        s.nextLine();
        System.out.println("Enter name: ");
        String nme = s.nextLine();

        System.out.println("Enter Age:");
        int ag = s.nextInt();

        s.nextLine();
        System.out.println("Enter City:");
        String City = s.nextLine();

        System.out.println("Name is: " + nme + "\n" + "Age is: " + ag + "\n" + "City is: " + City);

        // Q11
        double p = 3.14;
        System.out.println("Enter Radius: ");
        double radius = s.nextDouble();
        System.out.println("Area of Circle is :" + (p * radius * radius));

        s.close();
    }
}

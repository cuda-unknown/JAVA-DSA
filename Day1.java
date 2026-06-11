import java.util.Scanner;

class Start {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("enter big number");
        long many = sc.nextLong();
        System.out.println(many);

        sc.nextLine();

        System.out.println("enter Char ");
        char m = sc.next().charAt(0);
        System.out.println(m);

        System.out.println("enter Double ");
        Double d = sc.nextDouble();
        System.out.println(d);

        sc.nextLine();

        System.out.println("enter string ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("enter Float ");
        Float f = sc.nextFloat();
        System.out.println(f);

        // Ternary
        int in = 12;
        String outting = (in <= 10 ? "win" : "Loss");

        System.out.println(outting);

        // Switch

        System.out.println("Input color");

        String color = sc.nextLine();

        switch (color) {
            case "Red":
                System.out.println("Stop");
                break;

            case "Yellow":
                System.out.println("Wait");
                break;

            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        // For loop
        for (int i = 0; i < 10; i++) {
            // continue
            if (i >= 9)
                break;
            // break
            else if (i == 5)
                continue;
            else
                System.out.println(i);
        }

        sc.close();
    }
}

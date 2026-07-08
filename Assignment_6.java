import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Management {
    String name;
    int roll;
    int marks;

    Management(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name is : " + this.name);
        System.out.println("Roll No is : " + this.roll);
        System.out.println("Marks are :" + this.marks);
    }

    void calculateGrade() {
        if (this.marks <= 100 && this.marks > 90)
            System.out.println("A");
        else if (this.marks <= 90 && this.marks > 80)
            System.out.println("B");
    }
}

public class Assignment_6 {
    public static void arrayOperations() {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Array is : " + sum);

        float avg = sum / arr.length;
        System.out.println("Average of the Array is :" + avg);

        sc.close();

    }

    public static void twoPointer() {
        System.out.println();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Reversing Array using Two Pointers : ");
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void sumTarget() {
        System.out.println();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int target = 9;
        int s = 0;
        int e = arr.length - 1;
        System.out.print("Target element in Array whose sum is 9 : ");
        while (s < e) {
            if (arr[s] + arr[e] == target) {
                System.out.print("[" + arr[s] + "," + arr[e] + "]" + " ");
                s++;
                e--;
            } else if (arr[s] + arr[e] < target)
                s++;
            else
                e--;
        }
    }

    public static void removeDuplicate() {
        System.out.println();
        int arr[] = { 1, 1, 2, 2, 3, 4, 4 };
        int j = 0;
        System.out.println();
        System.out.print("Removing Duplicates from Array : ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseString() {
        System.out.println();
        String name = "Hello";
        int s = 0;
        int e = name.length() - 1;
        char ch[] = name.toCharArray();
        System.out.print("Reversing String : ");
        while (s < e) {
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }

        name = new String(ch);
        System.out.print(name);
        System.out.println();
    }

    public static void isPalindrome() {
        System.out.println();
        String name = "madam";
        int s = 0;
        int e = name.length() - 1;
        char ch[] = name.toCharArray();
        System.out.print("Is it a Palindrome : ");
        while (s < e) {
            if (ch[s] == ch[e]) {
                s++;
                e--;
            } else
                System.out.print("Not Palindrome");
        }
        System.out.print("It a Palindrome ");
        System.out.println();
    }

    public static void strinPattern() {
        System.out.println();
        String name = "I love Java programming";
        Pattern p = Pattern.compile("Java");
        Matcher m = p.matcher(name);
        System.out.print("Checking out if Java exist in String : ");

        if (m.find())
            System.out.print("Match");
        else
            System.out.print("Not a match");

        System.out.println();
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static int Fibonacci(int m) {
        if (m == 0 || m == 1)
            return m;
        return Fibonacci(m - 1) + Fibonacci(m - 2);
    }

    public static int recursionSum(int digit) {
        if (digit == 1)
            return 1;
        return digit + recursionSum(digit - 1);
    }

    public static int recur(int num) {
        int rev = 0;
        if (num == 0)
            return rev;

        rev = rev * 10 + (num % 10);
        return recur(num / 10);
    }

    public static void main(String[] args) {
        // arrayOperations();

        twoPointer();

        sumTarget();

        removeDuplicate();

        reverseString();

        isPalindrome();

        strinPattern();

        System.out.println();
        int n = 5;
        System.out.println("Factorial Using Recursion " + factorial(n));

        System.out.println();
        int m = 7;
        System.out.print("Fibonacci Series is : ");
        for (int i = 0; i < m; i++) {
            System.out.print(Fibonacci(i) + " ");
        }

        System.out.println();
        int d = 5;
        System.out.print("Sum is : " + recursionSum(d));
        System.out.println();

        System.out.println();
        String email = "Anything_324@gmail.com";
        Pattern pe = Pattern.compile("\\w+@\\w+\\.com");
        Matcher me = pe.matcher(email);
        System.out.print("Checking the email : ");
        if (me.matches())
            System.out.println("Match");
        else
            System.out.println("Failure ");
        System.out.println();

        System.out.println();

        int num = 123;
        System.out.println("Reversing a number using Recursion : " + recur(num));

        Management s1 = new Management("abc@gmail", 1, 92);
        s1.display();
        s1.calculateGrade();

        Management s2 = new Management("Sohi", 2, 88);
        s2.display();
        s2.calculateGrade();

        System.out.println();
        HashMap<Character, Integer> map = new HashMap<>();
        String name = "programming";
        for (char ch : name.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

    }
}

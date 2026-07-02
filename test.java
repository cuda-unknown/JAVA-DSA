
import java.util.ArrayList;
import java.util.Arrays;

class employee {
    String name;
    int id;
    int salary;

    void display() {
        System.out.println("name is : " + name);
        System.out.println("Id is : " + id);
        System.out.println("salary is " + salary);
    }
}

class Student {
    String name;
    int roll;
    int marks;

    void display() {
        System.out.println("Name is:" + name);
        System.out.println("roll is : " + roll);
        System.out.println("Marks are " + marks);
    }
}

public class test {

    public static void minMax() {
        int arr[] = { 1, 2, 3, 45, 90, 0 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }

    public static boolean palindrome() {
        int n = 101;
        int k = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        if (rev == k)
            return true;
        return false;
    }

    public static void sum() {
        int arr[] = { 1, 2, 3, 45, 90, 0 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is : " + sum);
    }

    public static int factorial(int m) {
        if (m == 0)
            return 1;
        return m * factorial(m - 1);
    }

    public static void binarySearch() {
        int arr1[] = { 0, 1, 2, 34, 56, 67, 78, 88 };
        int s = 0;
        int target = 0;
        int e = arr1.length;
        while (s > 0) {
            int mid = (s + e) / 2;
            if (arr1[mid] == target) {
                System.out.println(arr1[mid]);
                break;
            } else if (arr1[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;
        }
    }

    public static void sorting() {
        Integer arr2[] = { 1, 1, 1, 2, 3, 4, 1, 2, 2 };
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            al.add(arr2[i]);
        }
        System.out.println("Original " + al);
        System.out.println("After reversing " + al.reversed());
    }

    public static int sumUsingRecursion(int v) {
        if (v == 0)
            return 0;
        return v + sumUsingRecursion(v - 1);
    }

    public static void main(String[] args) {
        minMax();

        employee e1 = new employee();
        e1.name = "Harsh";
        e1.id = 1;
        e1.salary = 1000;
        e1.display();

        System.out.println("Is it Plaindrome : " + palindrome());

        // linearSearch
        int arr[] = { 1, 2, 3, 45, 90, 0 };
        int key = 45;
        int found = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                found = i;
        }
        if (found != -1)
            System.out.println("Found " + found);
        else
            System.out.println("Not found");

        String name = "abcdef";
        int vowel = 0;
        int consonent = 0;
        char ch[] = name.toCharArray();
        for (char i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                vowel++;
            } else
                consonent++;
        }
        System.out.println("Vpowels" + vowel);
        System.out.println("Consonent" + consonent);

        // arraylist
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.addFirst(90);
        ar.add(55);
        ar.addLast(50);
        System.out.println(ar);

        ar.add(2, 45);
        System.out.println(ar);

        ar.remove(3);
        System.out.println(ar);

        System.out.println("Final list " + ar);

        sum();

        // reverse string
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        sb.reverse();
        System.out.println("String after reversing " + sb);

        // fac
        int m = 5;
        System.out.println(factorial(m));

        // fib
        int j = 10;
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci is : ");
        for (int i = 1; i <= j; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        // move zeroes

        // class student

        System.out.println();
        Student s1 = new Student();
        s1.name = "Nirmal";
        s1.roll = 1;
        s1.marks = 11;

        Student s2 = new Student();
        s2.name = "Harsh";
        s2.roll = 11;
        s2.marks = 10;

        s1.display();
        s2.display();

        System.out.println();

        // binarySearch();

        int arr1[] = { 0, 1, 2, 34, 56, 67, 78, 88 };
        int s = 0;
        int tg = 56;
        int e = arr1.length-1;
        while (s <= 0) {
            int mid = (s + e) / 2;
            if (arr1[mid] == tg) {
                System.out.println(arr1[mid]);
                break;
            } else if (arr1[mid] < tg)
                s = mid + 1;
            else
                e = mid - 1;
        }

        Integer arr2[] = { 1, 1, 1, 2, 3, 4, 1, 2, 2 };
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            al.add(arr2[i]);
        }
        System.out.println("Original " + al);

        ArrayList<Integer> u = new ArrayList<Integer>();
        for (int i : al) {
            if (!u.contains(i)) {
                u.add(i);
            }
        }
        System.out.println("After removing Duplicates " + u);

        // anagram
        System.out.println();
        String na = "madam";
        String de = "madam";
        char ch1[] = na.toCharArray();
        char ch2[] = de.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2))
            System.out.println("Anagram ");
        else
            System.out.println("Not Anagram ");

        // reverse array
        int w[] = { 1, 2, 3, 4, 5 };
        int st = 0;
        int ed = w.length - 1;
        while (st < ed) {
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
        System.out.println("reverse array ");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }

        // ascending order and descending order
        // sorting();

        // sum using recursion
        System.out.println();
        int v = 6;
        System.out.println("sum is : " + sumUsingRecursion(v));


        //pairs
        System.out.println();
        int q[] = { 2, 7, 11, 12, 14 };
        int tar = 13;
        int start = 0;
        int end = q.length - 1;
        while (start < end) {
            if (q[start] + q[end] == tar) {
                System.out.println("(" + q[start] + "," + q[end] + ")");
                start++;
                end--;
            }
            else if(q[start]+q[end]<tar) start++;
            else end--;

        }

        //10 12 18

    }
}

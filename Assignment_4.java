import java.util.Arrays;

public class Assignment_4 {
    public static void Perform() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int largest = 0;
        int smallest = 1000;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i])
                largest = arr[i];
            if (smallest > arr[i])
                smallest = arr[i];
        }
        System.out.println("Largest element in Array is: " + largest);
        System.out.println("Smallest Element in Array is: " + smallest);
    }

    public static void secondLargest() {
        int large = 0;
        int secondLarge = 0;
        int arr[] = { 1, 92, 3, 4, 70, 55, 12 };
        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i])
                large = arr[i];
            else if (secondLarge < arr[i] && arr[i] != large)
                secondLarge = arr[i];
        }
        System.out.println("Second Biggest Number in an Array is : " + secondLarge);
    }

    public static void PerformThree() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        System.out.print("Swapped elements in an Array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sumAndAverage() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / 5;
        System.out.println("Sum of all Elements is:" + sum);
        System.out.println("Average of all Elements :" + average);
    }

    public static int removeDuplicate(int arr[]) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void sumTarget(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        System.out.print("Elements in array that give us sum 9 are : ");
        while (s < e) {
            int sum = arr[s] + arr[e];
            if (sum == target) {
                System.out.print("[" + arr[s] + "," + arr[e] + "]");
                s++;
                e--;
            } else if (sum < target)
                s++;
            else
                e--;
        }
        System.out.println("Sum not found");
    }

    public static void reverseString() {
        System.out.println();
        System.out.println();
        String name = "hello";
        char ch[] = name.toCharArray();
        int s = 0;
        int e = ch.length - 1;
        while (s < e) {
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
        String reversed = new String(ch);
        System.out.println("Reverse of String is : " + reversed);
    }

    public static boolean checkPalindrome() {
        String name = "madam";
        int s = 0;
        int e = name.length() - 1;
        while (s < e) {
            if (name.charAt(s) != name.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }

    public static void countNumberOfVowelsConsonentsDigitsSpaces() {
        String name = "Hello i am Sohi 123";
        char ch[] = name.toCharArray();
        int vo = 0;
        int spac = 0;
        int conso = 0;
        int digits = 0;
        int s = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[s] == 'a' || ch[s] == 'e' || ch[s] == 'i' || ch[s] == 'o' || ch[s] == 'u') {
                vo++;
                s++;
            } else if (ch[s] == ' ') {
                spac++;
                s++;
            } else if (ch[s] == '1' || ch[s] == '2' || ch[s] == '3' || ch[s] == '4' || ch[s] == '5' || ch[s] == '6'
                    || ch[s] == '7') {
                digits++;
                s++;
            } else {
                conso++;
                s++;
            }
        }
        System.out.println("no. of vowel " + vo);
        System.out.println("no. of spaces" + spac);
        System.out.println("no. of consonentss " + conso);
        System.out.println("no .of digits " + digits);
    }

    public static boolean checkAnagram() {
        String name = "listen";
        String dame = "silent";

        char ch1[] = name.toCharArray();
        char ch2[] = dame.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (ch1 == ch2)
            return true;
        else
            return false;
    }

    public static void substringPrint() {
        System.out.println("Substring using built in method : ");
        String name = "abc";
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j <= name.length(); j++) {
                System.out.println(name.substring(i, j));
            }
        }
    }

    public static void mySubstring() {
        String name = "abc";
        System.out.println("Substring without built in method : ");
        for (int i = 0; i < name.length(); i++) {
            String result = "";
            for (int j = i; j < name.length(); j++) {
                result += name.charAt(j);
                System.out.println(result);
            }
        }
    }

    public static void main(String[] args) {

        Perform();

        secondLargest();

        PerformThree();

        sumAndAverage();

        int arr1[] = { 1, 1, 2, 2, 3, 4, 4 };
        int size = removeDuplicate(arr1);
        System.out.println("Array after Removing Duplicate");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();

        int arr[] = { 2, 7, 11, 12 };
        int target = 9;
        sumTarget(arr, target);

        reverseString();

        System.out.println("Checking if String is palindrome : " + checkPalindrome());

        countNumberOfVowelsConsonentsDigitsSpaces();

        System.out.println("Checking if String is Anagram : " + checkAnagram());

        substringPrint();

        mySubstring();
    }
}

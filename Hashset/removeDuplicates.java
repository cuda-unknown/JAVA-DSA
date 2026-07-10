package Hashset;

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 88 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

    }
}

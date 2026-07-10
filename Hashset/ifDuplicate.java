package Hashset;

import java.util.HashSet;

public class ifDuplicate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int arr[] = { 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            if (set.contains(arr[i])) {
                check = true;
                continue;
            }
        }
        System.out.println(check);
        System.out.println(set);

    }
}

package Hashmap;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 5, 6, 4, 5, 1, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
    }
}

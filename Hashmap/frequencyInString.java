package Hashmap;

import java.util.HashMap;

public class frequencyInString {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String name = "programming";
        for (char ch : name.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
}

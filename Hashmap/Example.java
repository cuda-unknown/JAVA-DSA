package Hashmap;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "b");

        map.put(3, "C");
        System.out.println(map);

        System.out.println(map.containsKey(2));

        System.out.println(map.containsValue("c"));

        System.out.println(map.getOrDefault(4, "D"));

        map.putIfAbsent(5, "E");
        System.out.println(map);

        System.out.println();
        map.remove(3);
        System.out.println(map);

        map.replace(2, "B");
        System.out.println(map);

        System.out.println();
        map.replace(4, "D");
        System.out.println(map);

        System.out.println(map.size());
        System.out.println();

        System.out.println(map.isEmpty());
        System.out.println();

        for (String i : map.values()) {
            System.out.println(i);
        }
        System.out.println();

        for (Integer i : map.keySet()) {
            System.out.println(i);
        }
        System.out.println();

        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class test_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addFirst(60);
        list.addLast(70);
        System.out.println(list);
        System.out.println();

        // 2
        System.out.println("Q2");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println();

        // 3
        System.out.println("Q3");
        if (list.contains(20))
            System.out.println("Element exist at index : " + list.indexOf(10));
        else
            System.out.println("Element not found");
        System.out.println();

        // 4
        System.out.println("Q4");
        System.out.println(list.reversed());
        System.out.println();

        // Q5
        System.out.println();
        System.out.println("Q5");
        Integer middle = list.get(list.size() / 2);
        System.out.println("Middle element in Stack is : " + middle);

        // 6
        System.out.println();
        System.out.println("Q6");
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(10);
        l1.add(30);
        l1.add(10);
        l1.removeIf(n -> n==10);
        System.out.println("Removing all occurences of 10 From the list "+l1);

        // 7
        System.out.println();
        System.out.println("Q7");
        Stack<Integer> st = new Stack<Integer>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);
        System.out.println("Stack 1st Element : " + st.peek());

        // 8
        System.out.println();
        System.out.println("Q8");
        System.out.println("Removing elements from queue : ");
        while (!st.isEmpty()) {
            st.pop();
            System.out.println(st);
        }

        // 9
        System.out.println();
        System.out.println("Q9");
        String name = "JAVA";
        Stack<Character> ch = new Stack<Character>();
        for (Character i : name.toCharArray()) {
            ch.add(i);
        }
        System.out.println(ch.reversed());

        // 10
        System.out.println();
        System.out.println("Q10");
        String para = "{[()]}";
        Stack<Character> paranthesis = new Stack<Character>();
        for (int i = 0; i < para.length(); i++) {
            char cha = para.charAt(i);
            if (cha == '{' || cha == '(' || cha == '[') {
                paranthesis.add(cha);
                System.out.println(paranthesis);
            } else {
                if (paranthesis.isEmpty()) {
                    System.out.println("Stack is Empty ");
                    return;
                }
                if (paranthesis.peek() == '{' && cha == '}' || paranthesis.peek() == '[' && cha == ']' ||
                        paranthesis.peek() == '(' && cha == ')') {
                    paranthesis.pop();
                }

                else
                    return;
            }

        }

        // 11
        System.out.println();
        System.out.println("Q11");
        Stack<Integer> sta = new Stack<Integer>();
        sta.add(10);
        sta.add(20);
        sta.add(30);
        sta.add(40);
        sta.add(50);
        Integer max = Integer.MIN_VALUE;

        for (int i : sta) {
            if (max < i)
                max = i;
        }
        System.out.println("Max Value in Stack is : " + max);

        // 12
        System.out.println();
        System.out.println("Q12");
        sta.addFirst(1);
        System.out.println("Top element inserted : " + sta);

        // 13
        System.out.println();
        System.out.println("Q13");
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Displaying in FIFO : " + q);

        // 14
        System.out.println();
        System.out.println("Q14");
        System.out.println("Removing elements from queue : ");
        while (!q.isEmpty()) {
            System.out.println(q);
            q.poll();
        }
        System.out.println(q);

        // 15
        System.out.println();
        System.out.println("Q15");
        Queue<String> qc = new LinkedList<String>();
        qc.add("Sohi");
        qc.add("Singh");
        qc.add("Nirmal");
        System.out.println(qc);

        qc.offer("Harsh");
        System.out.println(qc);

        qc.peek();
        System.out.println(qc);

        qc.poll();
        System.out.println(qc);

        // 16
        System.out.println();
        System.out.println("Q16");
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Queue has elements : " + q);
        while (!q.isEmpty()) {
            st.add(q.poll());
        }

        System.out.println("Stack has : " + st);
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        System.out.println("Queue after Reversing Using Stack : " + q);

        // 17
        System.out.println();
        System.out.println("Q17");
        Integer maxi = Integer.MIN_VALUE;

        for (int i : q) {
            if (maxi < i)
                maxi = i;
        }
        System.out.println("Max in Queue is : " + maxi);

        // 18
        System.out.println();
        System.out.println("Q18");

        // 19
        System.out.println();
        System.out.println("Q19");
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Sohi");
        students.put(2, "Singh");
        students.put(3, "Nirmal");
        students.put(4, "Harsh");
        students.put(5, "Preet");

        System.out.println("Student ID      Name");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + "               " + entry.getValue());
        }

        // 20
        System.out.println();
        System.out.println("Q20");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        if (students.containsKey(id)) {
            System.out.println("Student Name: " + students.get(id));
        } else {
            System.out.println("Student ID not found.");
        }

        sc.close();

        // 21
        System.out.println();
        System.out.println("Q21");
        String str = "hello";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char charac : str.toCharArray()) {
            map.put(charac, map.getOrDefault(charac, 0) + 1);
        }
        System.out.println(map);

        // 22
        System.out.println();
        System.out.println("Q22");
        int arr[] = { 1, 2, 3, 2, 3, 4, 5, 1 };
        HashMap<Integer, Integer> mapp = new HashMap<Integer, Integer>();
        for (int i : arr) {
            mapp.put(i, mapp.getOrDefault(i, 0) + 1);
        }
        System.out.println(mapp);

        // 23
        System.out.println();
        System.out.println("Q23");
        String stri = "aabbcddee";
        HashMap<Character, Integer> mappi = new HashMap<Character, Integer>();
        for (char charac : stri.toCharArray()) {
            mappi.put(charac, mappi.getOrDefault(charac, 0) + 1);
        }
        System.out.println(mappi);

        // 24
        System.out.println();
        System.out.println("Q24");
        int arr2[] = { 2, 7, 11, 15 };
        int targe = 9;
        HashMap<Integer, Integer> mapping = new HashMap<Integer, Integer>();
        System.out.print("Sum Target : ");
        for (int i = 0; i < arr2.length; i++) {
            int finding = targe - arr2[i];
            if (mapping.containsKey(finding)) {
                System.out.print("True" + " " + "[" + finding + "," + arr2[i] + "]");
            }
            mapping.put(arr2[i], i);
        }
        System.out.println();

        // 25
        System.out.println();
        System.out.println("Q25");
        HashSet<Integer> se = new HashSet<Integer>();
        se.add(1);
        se.add(2);
        se.add(1);
        se.add(2);
        se.add(3);
        se.add(4);
        se.add(4);
        System.out.println(se);

        // 26
        System.out.println();
        System.out.println("Q26");
        int arra[] = { 1, 1, 1, 2, 2, 3, 4, 5, 6 };
        System.out.print("[");
        for (int i : arra) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i : arra) {
            s.add(i);
        }
        System.out.println("Array Elements after they are inserted into Hashset : " + s);

        // 27
        System.out.println();
        System.out.println("Q27");
        int arr3[] = { 1, 2, 3, 4 };
        int arr4[] = { 3, 4, 5, 6 };

        System.out.print("The elements that are common in both arrays are : ");
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr3) {
            set.add(i);
        }
        for (int j : arr4) {
            if (set.contains(j)) {
                System.out.print(j + " ");
            }
        }

        // 29
        System.out.println();
        System.out.println("Q28,Q29");
        System.out.println("Union of Two Arrays + Showing that Hashset does not store duplicate Values : ");
        HashSet<Integer> sets = new HashSet<>();
        for (int i : arr3) {
            sets.add(i);
        }
        for (int i : arr4) {
            sets.add(i);
        }
        System.out.println(sets);

        // 30
        System.out.println();
        System.out.println("Q30");
        int[] arr5 = { 5, 3, 4, 1, 5 };

        HashSet<Integer> hash = new HashSet<>();
        boolean found = false;

        for (int i : arr5) {
            if (hash.contains(i)) {
                System.out.println("First duplicate element: " + i);
                found = true;
                break;
            } else {
                hash.add(i);
            }
        }

        if (found == false) {
            System.out.println("No duplicate element found.");
        }

    }
}

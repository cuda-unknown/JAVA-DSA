package ArrayLista;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        
    
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println(a);
        a.add(11);
        a.addFirst(9);
        a.add(12);
        a.addLast(20);
        System.out.println(a);

        System.out.println(a.get(2));
        
        a.remove(1);

        a.add(0,99);
        
        System.out.println(a);

        System.out.println(a.contains(12));
        System.out.println(a.contains(22));

        a.set(1, 22);
        System.out.println(a);

        System.out.println(a.size());
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }

        Integer[] arr= a.toArray(new Integer[a.size()]);
        System.out.println(arr); //
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}

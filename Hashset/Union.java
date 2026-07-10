package Hashset;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,10,5,5,5};
        int arr2[]={10,20,30,40,50};
        HashSet<Integer> set =new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }
        System.out.println(set);
    }
}

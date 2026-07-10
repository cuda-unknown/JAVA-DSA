package Hashset;

import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,10,20,5,30,5,40,5};
        int arr2[]={10,20,30,40,50};
        HashSet<Integer> set =new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(int j:arr2){
            if(set.contains(j)){
                System.out.println(j);
            }
        }

    

    }
}

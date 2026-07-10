package Hashmap;

import java.util.HashMap;

public class SumTarget {
    public static void main(String[] args) {
        int arr[]={1,2,3,9,10,20,30};
        int target=39;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int finding =target-arr[i];
            if(map.containsKey(finding)){
                System.out.println(finding+" "+arr[i]);
            }
            map.put(arr[i], i);
        }
    }
}

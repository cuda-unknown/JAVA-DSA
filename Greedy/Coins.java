package Greedy;

import java.util.ArrayList;

public class Coins {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(2);
        list.add(1);

        int count=0;
        int t_sum=28;

        for(Integer i:list){
            while (t_sum>=i) {
                t_sum-=i;
                count++;
            }
        }
        // //brute force and stupid approach
        // while (t_sum!=0) {

        //     if(t_sum>=list.get(0)) {
        //         count++;
        //         t_sum=t_sum-list.get(0);

        //         System.out.println(t_sum);
        //     }
        //     else if(t_sum>=list.get(1)){
        //         count++;
        //         t_sum=t_sum-list.get(1);
        //         System.out.println(t_sum);
        //     }
        //     else if(t_sum>=list.get(2)){
        //         count++;
        //         t_sum=t_sum-list.get(2);
        //         System.out.println(t_sum);
        //     }
        //     else if(t_sum>=t_sum-list.get(3)){
        //         count++;
        //         t_sum=t_sum-list.get(3);
        //         System.out.println(t_sum);
        //     }
        // }

        System.out.println("Count : "+count);
        

    }
}

// package Day 3

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int arr[]=new int[4];
        int arr2[] = { 2, 2, 3, 4 };
        // for(int i:arr2){
        // System.out.print(i);
        // }

        // System.out.println();

        // arr[0] = 56;
        // arr[1] = 66;

        int arr3[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array:");
        for(int i=0;i<arr3.length;i++){
        arr3[i]=sc.nextInt();
        }
        for(int i=0;i<arr3.length;i++){
        System.out.print(arr3[i]);
        }

        // System.out.println();

        // System.out.println(arr2[3]);

        int target = 8;
        int result=-1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == target) {
                result=target;
            }
        }

        if(result!=-1) System.out.println("Found"); 
        else  System.out.println("Not Found");



        sc.close();
    }
}

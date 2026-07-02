package day7;
import java.util.Scanner;

public class searchmatrix {
    public static boolean searchingMatrix(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        System.out.println("Input Matrix");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter element for search :");
        int key=sc.nextInt();

        System.out.println(searchingMatrix(arr, key));
        sc.close();
    }
}

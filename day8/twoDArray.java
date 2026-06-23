package day8;

public class twoDArray {
    public static int sumTwoDArray(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of 2D Array is : ");
        return sum;
    }

    // finding largest in 2Darray
    public static int largest(int arr[][]) {
        int largest = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > largest)   largest = arr[i][j];
            }
        }
        System.out.print("Largest element in 2D Array is:");
        return largest;
    }

    // do for smallest
    public static int smallest(int arr[][]){
        int smallest=1000;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]<smallest) smallest=arr[i][j];
            }
        }
        System.out.print("Smallest Element in 2D Array is : ");
        return smallest;
    }
    // searching
    public static void evenAndOdd(int arr[][]) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("Total Even No. " + even);
        System.out.println("Total Odd No." + odd);
    }

    public static void transpose(int arr[][]) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    //Sum of Diagonals 
    public static void sumOfDiagonal(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<=i;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of diagonals is :"+sum);
    }

    //this from mam
    public static void sumOfDiagonalAnother(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        System.out.println("Sum of diagonals is :"+sum);
    }

    //Sum of other diagonal 
    public static void SumOfAnotherDiagonal(int arr[][]){
        int sum=0;
        int n=arr.length-1;
        for(int i=arr.length;i>=0;i--){
            for(int j=arr.length;j>=0;j--){
                if(i+j==n) sum+=arr[i][j];
            }
        }
        System.out.println("Sum of Other Diagonal is :"+sum);
    }

    public static void CombinedSumOfDiagonals(int arr[][]){
        int sum=0;
        int n=arr.length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j) sum+=arr[i][j];
                else if(i+j==n) sum+=arr[i][j];
            }
        }
        System.out.println("Sum of Both Diagonals is:" +sum);
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(sumTwoDArray(arr));

        System.out.println(largest(arr));

        System.out.println(smallest(arr));

        evenAndOdd(arr);

        transpose(arr);

        sumOfDiagonal(arr);

        sumOfDiagonalAnother(arr);

        SumOfAnotherDiagonal(arr);

        CombinedSumOfDiagonals(arr);
    }
}

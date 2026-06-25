import java.util.ArrayList;

import day8.twoDArray;

public class Assignment_5 {
    public static void arrayListUse(){
        ArrayList<Integer> res=new ArrayList<Integer>();
        res.add(1);
        res.add(2);
        res.add(3);
        res.add(5);
        res.add(7);
        res.add(9);
        res.add(3);
        res.add(3);
        res.addFirst(22);
        res.addLast(20);
        System.out.print("Added 10 elements : ");
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("After removing element 7 : ");
        res.remove(5);
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("Updating an element 3 : ");
        res.remove(6);
        res.add(6,90);
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("Searching if an element 90 exists in list : ");
        System.out.println(res.contains(90));
        System.out.println();
    }

    public static void studentManager(){
        ArrayList<String> res=new ArrayList<String>();
        System.out.print("Adding students name in list : ");
        res.add("Nirmal");
        res.add("Singh");
        res.add("Sohi");
        for(String i:res){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("Removing Specific name 'Sohi' : ");
        res.remove("Sohi");
        for(String i:res){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("Finding a student by name 'Singh': ");
        for(String i:res){
            if(!res.contains("Singh"))  System.out.print("No result");
            else System.out.print("Found");
        }
        System.out.println();

        System.out.print("Display no. of names in it : ");
        System.out.print(res.size());
        System.out.println();

        System.out.println();
    }

    public static ArrayList<Integer> removeDuplicate(){
        int arr[]={10,20,10,30,20,40};
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!res.contains(arr[i])) res.add(arr[i]);
        }
        return res;
    }

    public static void maxMin(){
        System.out.println();
        int arr[]={10,20,500,30,2,40};
        ArrayList<Integer> res=new ArrayList<>();
        int max=Integer.MIN_VALUE; 
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
            else if(arr[i]<min) min=arr[i];
            sum+=arr[i];
        }
        int avg=sum/6;
        res.add(max);
        res.add(min);
        res.add(avg);
        
        System.out.print("Printing Max MIn Average of Array : ");
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void stringBuilderOperations(){
        StringBuilder sb=new StringBuilder();
        System.out.println();

        System.out.print("Performing operations on String using StringBuilder : ");
        sb.append(" Hello");
        System.out.println(sb);

        System.out.print("reversing the String : ");
        sb.reverse();
        System.out.println(sb);

        System.out.print("Turning String to UpperCase : ");
        for(int i=0;i<sb.length();i++){
            if (Character.isLowerCase(sb.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }    
        }
        System.out.println(sb);

        System.out.print("Inserting specific character : ");
        sb.insert(3,'A');
        System.out.println(sb);

        System.out.print("Deleting specific character in String : ");
        sb.delete(2, 4); //last index is never included 
        System.out.println(sb);
    }

    public static boolean checkPalindrome(){
        String in="madam";
        String name="hello";

        StringBuilder sb=new StringBuilder();
        sb.append(in);
        
        Strin

        if(sb)
        return true;


    }

    public static void TwoDArray(){
        int arr[][]={
            {1,2},
            {3,4}
        };

        int arr1[][]={
            {5,6},
            {7,8}
        };

        int row=arr.length;
        int col=arr[0].length;

        int sum[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j] =arr[i][j] +arr1[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void sumOfEach(){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.print("Sum of rows : ");
        for(int i=0;i<arr.length;i++){
            int row_sum=0;
            for(int j=0;j<arr[0].length;j++){
                row_sum+=arr[i][j];
            }
            System.out.println( " "+row_sum);
        }

        System.out.print("Sum of Colms :");
        for(int j=0;j<arr[0].length;j++){
            int col_sum=0;
            for(int i=0;i<arr.length;i++){
                col_sum+=arr[i][j];
            }
            System.out.println(" " +col_sum);
        }

    }

    public static void searchingElement(){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int search=9;
        boolean found=false;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==search){
                    System.out.println("Found at row :"+i+" Found at col : "+j);
                    found=true;
                    break;
                }
            }
            if(found) break;
        }
        if(!found) System.out.println("Element not found");
    }

    public static void marksOfStudents(){
        System.out.println();
        int std1[][]={
            {80},
            {75},
            {90}
        };

        int std2[][]={
            {70},
            {85},
            {60}
        };

        int totalmarks=0;
        for(int i=0;i<std1.length;i++){
            for(int j=0;j<std1[0].length;j++){
                totalmarks+=std1[i][j];
            }
        }
        System.out.println("Total marks of Student 1 is : " +totalmarks);

        int totalmarks_std2=0;
        for(int i=0;i<std2.length;i++){
            for(int j=0;j<std2[0].length;j++){
                totalmarks_std2+=std2[i][j];
            }
        }
        System.out.println("Total marks of Student 2 is : " +totalmarks_std2);

        int avg1=totalmarks/3;
        int avg2=totalmarks_std2/3;
        System.out.println( "Average for std1 is : "+avg1);
        System.out.println("Average of Student 2 : "+avg2);

        if(totalmarks>totalmarks_std2) System.out.println( "Student 1 has highest marks ");
        else System.out.println( "Student 2 has highest marks ");
    }

    
    public static void main(String[] args) {
        arrayListUse();

        studentManager();


        System.out.println("After removing Duplicates : "+removeDuplicate());

        maxMin();

        stringBuilderOperations();

        TwoDArray();

        sumOfEach();
        
        searchingElement();

        marksOfStudents();

    }
}

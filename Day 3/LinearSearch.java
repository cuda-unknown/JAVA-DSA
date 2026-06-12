public class LinearSearch {
    public static void main(String[] args) {
        int arr2[]={1,3,8,9,20,45,6};
        int target = 8;
        int result=-1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == target) {
                result=target;
            }
        }

        if(result!=-1) System.out.println("Found"); 
        else  System.out.println("Not Found");
    }
}

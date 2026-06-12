package Day4;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,90,91,99,111};
        int target =3;
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" " );
        // }
        // System.out.println();

        
        int s=0;
        int e=arr.length;
        while(s>0){
            int mid=(s+e)/2;
            if(arr[mid]==target){ 
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        }
    }
}

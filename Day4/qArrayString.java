package Day4;

public class qArrayString {
    public static void main(String[] args) {
        int arr[]={3,1,90,4,99};
        int largest= arr[0];
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest) largest=arr[i];
            if(smallest>arr[i]) smallest=arr[i];
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}

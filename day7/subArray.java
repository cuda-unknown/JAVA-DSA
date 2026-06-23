package day7;

public class subArray {
    public static void main(String[] args) {
        int f[]={1,2,3,4,5};
        int count=0;
        System.out.println("Sub Arrays : ");
        for(int i=0;i<f.length;i++){
            for(int j=i;j<f.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(f[k]);  
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(count);

    }
}

package Greedy;

public class coinsPicked {
    public static void main(String[] args) {
        int Coins[]={200,100,50,20,10,5,2,1};
        int Target=275;
        for(int i=0;i<Coins.length;i++){
            while (Target>=Coins[i]) {
                Target-=Coins[i];
                System.out.println(Coins[i]);
                System.out.println();
            }
        }

    }
}

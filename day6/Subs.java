package day6;

public class Subs {
    public static String stringSub(String str,int s,int e){
        String make="";
        for(int i=s;i<=e;i++){
            make+=str.charAt(i);
        }
        return make;
    }
    public static void main(String[] args) {
        String name="WAKAA WAKE UP";
        System.out.println(stringSub(name, 6, 11));
    }
}

package day6;

public class test{
    public static void testto(String name){
        int x=0,y=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='N') y++;
            else x++;
        }
        int X=x*x;
        int Y=y*y;
        int t_XY=X+Y;
        double tdc=Math.sqrt(t_XY);
        System.out.println(tdc);
    }
    public static void main(String[] args) {
        String test="NNEEEEENN";
        testto(test);
    }
}
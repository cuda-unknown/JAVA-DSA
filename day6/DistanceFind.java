package day6;

import java.util.Scanner;

public class DistanceFind {
    public static void distance(String name){
        int  x=0;
        int y=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='W') x--;
            else if(name.charAt(i)=='N') y++;
            else if(name.charAt(i)=='S') y--;
            else x++;
        }
        int t_X=x*x;
        int t_Y=y*y;
        int total=t_X+t_Y;
        double tDistance=(double)Math.sqrt(total);  
        //(double) the step done above is called type conversion
        System.out.println(tDistance);
    }
    public static void main(String[] args) {
        System.out.print("Directions: 'EG. N, W,E,S");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        distance(name);
        sc.close();
    }
}
   
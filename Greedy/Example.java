package Greedy;

import java.util.ArrayList;

public class Example {
    public static class Activity{
        int start;
        int finish;
        Activity(int s,int f){
            this.start=s;
            this.finish=f;
        }
    }
    public static void main(String[] args) {
        ArrayList<Activity> list=new ArrayList<>();

        list.add(new Activity(1, 2));
        list.add(new Activity(0, 6));
        list.add(new Activity(3, 4));
        list.add(new Activity(5, 7));
        list.add(new Activity(8, 9));
        list.add(new Activity(5, 9));

        list.sort((a,b)-> a.finish-b.finish);

        int count=1;
        int lastFinish=list.get(0).finish;
        System.out.println(list.get(0).start+","+list.get(0).finish);
        System.out.println();

        for(int i=1;i<list.size();i++){
            if(list.get(i).start>= lastFinish){
                count++;
                lastFinish=list.get(i).finish;

                System.out.println(list.get(i).start+","+list.get(i).finish);
                System.out.println();

            }
        }

        System.out.println("No. of Activities :" +count);

    }
}

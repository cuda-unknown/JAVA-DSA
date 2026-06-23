package day7;

import java.util.Arrays;

public class stringAnagram {
    public static void main(String[] args) {
        String str1="nade";
        String str2="dean";

        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)) System.out.println("Anagram");
        else System.out.println("Not Anagram");

        //not started yet 
        // StringBuilder sb=new StringBuilder();

        // String str3="abcd";
    }
}

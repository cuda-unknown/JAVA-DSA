package stringPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class containsDigits {
    public static void main(String[] args) {
        String s="madam";
        Pattern p=Pattern.compile("\\w");
        Matcher m=p.matcher(s);

        if(m.find()) System.out.println("Match");
        else System.out.println("Failure");

        String st="abccadab123";
        Pattern pp=Pattern.compile("[A-Za-z]+");
        Matcher mm=pp.matcher(st);
        if(mm.matches()) System.out.println("match");
        else System.out.println("failure");

        Pattern pt=Pattern.compile("\\w+");
        Matcher mt=pt.matcher(st);
        if(mt.matches()) System.out.println("match");
        else System.out.println("Failure");

        String email="Anything_324@gmail.com";
        Pattern pe=Pattern.compile("\\w+@\\w+ \\.com");
        Matcher me=pe.matcher(email);
        if(me.matches()) System.out.println("Match");
        else System.out.println("Failure ");


    }
}

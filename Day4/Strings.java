package Day4;

public class Strings {
    public static void main(String[] args) {
        String name="Hello ";
        System.out.println(name);

        System.out.println(name.toUpperCase());
        String at="Earth ";
        System.out.println(at.toLowerCase());

        System.out.println(name.concat(at));

        System.out.println(at.charAt(3));

        System.out.println(name.length()); //it takes full length inside "" from words to space 

        System.out.println(at.replace(name, at));
        System.out.println(name.replace("l","y"));

        System.out.println(name.equals("EMY")); //true or false type tells if something is exactly as you typed .

        System.out.println(name.substring(2,5));  //using this u start from exact index u typed but stop at one index before target
        //eg if begin at 2  and end at 5 . it will begin at 2 and end at 4 not 5 

        System.out.println(name.equalsIgnoreCase("hello "));
        //searching for words and u don't have to care about Uppercase or Lowercase using this 

    }
}

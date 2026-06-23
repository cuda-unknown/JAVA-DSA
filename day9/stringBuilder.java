package day9;

public class stringBuilder {

    public static String selfMaking(String str){
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(char i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else sb.append(str.charAt(i));
        }
        return sb.toString();
    } 
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (char i = 'A'; i <= 'Z'; i++) {
            sb.append(i);
            sb.append(" ");
        }
        sb.insert(5,'m');
        System.out.println(sb);

        sb.append("\n ");

        String str="hi , i am sohi";
        System.out.println(selfMaking(str));

        
    }
}

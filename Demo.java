
class Demo {
    public static int recursionSum(int digit){
        if(digit==1) return 1;
        return digit+recursionSum(digit-1);
    }
    public static void main(String[] args) {

        // System.out.println("Hi There");
        // System.out.print("hi me ");
        // boolean n = true;
        // int a = 90;
        // char c = 'm';
        // String m = "avgy";
        // System.out.println(n + "\n" + a + "\n" + c + "\n" + m + "\n");
        // int u = 10, y = 99, o = 188;
        // // System.out.println(u+y);
        // if (u > y && u > o) {
        //     System.out.println(u);
        // } else if (y > u && y > o) {
        //     System.out.println(y);
        // } else {
        //     System.out.println(o);
        // }

        int d=5;
        System.out.println(recursionSum(d)+" ");
    }
}

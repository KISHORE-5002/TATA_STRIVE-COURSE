public class bitwiseoperator {
    public static void main(String[] args){
        int a=5;
        int b=2;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~(a&b));
        System.out.println(2>>b);
        System.out.println(a<<b);
        int c=22;
        int d=79;
        System.out.println(c&d);
        System.out.println(c|d);
        System.out.println(c^d);
        System.out.println(~c);
        System.out.println(~(c&d));
        System.out.println(c>>d);
        System.out.println(c<<d);
    }
}

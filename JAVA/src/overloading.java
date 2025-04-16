class demo1{
//    public void add(int a,int b){
//        System.out.println(a+b);
//    }
//    public void add(int a,int b,int c){
//        System.out.println(a+b+c);
//    }

    demo1(int a, int b){
        System.out.println(a+b);
    }
    demo1(int a,int b ,int c){
        System.out.println(a+b+c);
    }
}
public class overloading {
    public static void main(String[] args) {
//        demo1 obj=new demo1();
////        obj.add1(2,2);
////        obj.add1(2,2,2);
//
        demo1 obj=new demo1(2,2);
    }
}

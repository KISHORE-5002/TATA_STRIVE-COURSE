//interface u{
//    void add(int a,int b);
//
//}
//interface class u1{
//    int add(int a, int b) {
//        return 0;
//    }
//}
 interface f{
    void details1(String Name,String location);
}

public class lamdainterface
{
    public static void main(String[] args)
    {
//        u obj =(int a, int b) -> System.out.println(a+b);
//        obj.add(8,10);

//        u1 obj =(a,b) -> a+b;
//        int r=obj.add(5,5);
//        System.out.println(r);
        f obj =(Name,location) -> System.out.println(Name+" "+location);
        obj.details1("sachin","electroicity");
    }
}

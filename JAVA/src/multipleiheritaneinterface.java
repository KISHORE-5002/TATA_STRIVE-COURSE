//multipleinherticeusinginterface
//interface swimmer{
//    void swim();
//}
//interface flyer{
//    void fly();
//}
//class bird implements swimmer,flyer{
//    @Override
//    public void swim() {
//        System.out.println("birds can't swim");
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("birds can fly");
//    }
//}


//multiplelevelinherticeusinginterface
//interface a{
//    void d();
//    void e();
//}
//interface b extends a{
//    void f();
//    void g();
//}
//class c implements b{
//    @Override
//    public void d() {
//        System.out.println(" d exes");
//    }
//
//    @Override
//    public void e() {
//        System.out.println("e exec");
//    }
//
//    @Override
//    public void f() {
//        System.out.println("f exec");
//    }
//
//    @Override
//    public void g() {
//        System.out.println("g exec");
//    }
//}


//hiericalinhertiancein interface

interface a{
    void d();
    void g();
}
class b implements a{
    void e(){
        System.out.println("1 exec");
    }
    void h(){
        System.out.println("1.1");
    }

    @Override
    public void d() {

    }

    @Override
    public void g() {

    }
}
class c implements a{
    void f(){
        System.out.println("2 exec");
    }

    @Override
    public void d() {

    }

    @Override
    public void g() {

    }
}
public class multipleiheritaneinterface {
    public static void main(String[] args) {
//        bird obj=new bird();
//        obj.fly();
//        obj.swim();



        //multiplelevelinterface
//        c obj=new c();
//        obj.d();
//        obj.e();
//        obj.f();
//        obj.g();




        //hiericalinhertiancein interface
     b obj=new b();
     obj.e();
     obj.h();
     c obj1=new c();
     obj1.f();
     obj.h();
    }
}

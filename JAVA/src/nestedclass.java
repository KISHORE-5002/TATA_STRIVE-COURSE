//class A{
//    public void add(){
//        System.out.println("addition");
//    }
//    class b{
//        public void sub(){
//            System.out.println("subtraction");
//        }
//    }
//}

class p{
    public void p1(){
        int age=1;
        String name="kevein";
        System.out.println(name+age);
    }
    class e{
        public void emp(){
            int id=1;
            String name="kevein";
            int salary=12345;
            System.out.println(name+id+salary);
        }
    }
    class d{
        public void dep(){
            int id=1;
            String name="kevein";
            System.out.println(name+id);
        }
    }
    class h{
        public void hr(){
            String name="kevein";
            String location="bangalore";
            System.out.println(name+location);
        }
    }

}
public class nestedclass {
    public static void main(String[] args) {
//       A obj=new A();
//       A.b obj1=obj.new b();
//       obj.add();
//       obj1.sub();
        p obj=new p();
        p.e obj1=obj.new e();
        p.d obj2=obj.new d();
        p.h obj3=obj.new h();
        obj.p1();
        obj1.emp();
        obj2.dep();
        obj3.hr();
    }
}

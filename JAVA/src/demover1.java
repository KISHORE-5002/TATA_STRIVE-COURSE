//interface i{
//   default void phone(){
//       System.out.println("phone1");
//    }
//}
//interface j{
//    default void phone(){
//        System.out.println("phone2");
//    }
//}
//class a11{
//    public void phone(){
//        System.out.println("phone3");
//    }
//}
interface i{
   static void phone(){
       System.out.println("phone1");
    }
}
class j{
    static void phone(){
        System.out.println("phone2");
    }
}
//public class demover1 extends a11
public class demover1{
    public static void main(String[] args) {
//        demover1 obj1 =new demover1();
//        obj1.phone();
        j.phone();
    }
}

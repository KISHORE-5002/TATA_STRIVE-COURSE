//abstract class shape{
//    abstract void draw();
//}
//class circle extends shape{
//    void draw() {
//        System.out.println("draw the circle");
//    }
//}

//
//abstract class math{
//    abstract void add();
//    abstract void sub();
//    abstract void division();
//    abstract void multiple();
//}
//class solution extends math{
//    void add() {
//        int a=1;
//        int b=1;
//        System.out.println(a+b);
//    }
//    void sub() {
//        int a=1;
//        int b=1;
//        System.out.println(a-b);
//    }
//    void division() {
//        int a=1;
//        int b=1;
//        System.out.println(a/b);
//    }
//    void multiple() {
//        int a=1;
//        int b=1;
//        System.out.println(a*b);
//    }

abstract class work_details{
    abstract void work();
    abstract void personal();
}
class worker extends work_details{
    void work(){
        int id=12;
        String login_hr="16 hr";
        System.out.println(id+"      "+login_hr);
    }
    void personal(){
        int reading=1;
        String sleepind_hr="8 hr";
        System.out.println(reading+"      "+sleepind_hr);
    }

        worker(String name,int age){

            System.out.println(name+"   "+age);

    }
}

public class abstraction1 {
    public static void main(String[] args) {
//    circle obj=new circle();
//    obj.draw();


//        solution obj=new solution();
//        obj.add();
//        obj.sub();
//        obj.division();
//        obj.multiple();
        worker obj=new worker("kavin",22);
        obj.work();
        obj.personal();

    }
}

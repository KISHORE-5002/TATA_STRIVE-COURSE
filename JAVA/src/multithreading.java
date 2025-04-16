//class hello{
//    public void h1() {
//        for (int i = 0; i <= 4; i++) {
//            System.out.println("hello");
//            try{Thread.sleep(1000);}catch (Exception e){}
//            }
//        }
//    }
//
//class hi{
//    public void h2() {
//        for (int i = 0; i <= 4; i++) {
//            System.out.println("hi");
//            try{Thread.sleep(1000);}catch (Exception e){}
//        }
//    }
//}





//class hello extends Thread{
//    public void run() {
//        for (int i = 0; i <= 4; i++) {
//            System.out.println("hello");
//            try{Thread.sleep(500);}catch (Exception e){}
//            }
//        }
//    }
//
//class hi extends Thread{
//    public void run() {
//        for (int i = 0; i <= 4; i++) {
//            System.out.println("hi");
//            try{Thread.sleep(500);}catch (Exception e){}
//        }
//    }
//}


class  details extends Thread{
    public void run(){
        for (int i = 0; i <= 2; i++) {
            System.out.println("PERUMAL MANIMEKALI COLLEGE");
            try{Thread.sleep(5000);}catch (Exception e){}
        }
    }
}
class  intermedate extends Thread{
    public void run(){
        for (int i = 0; i <= 1; i++) {
            System.out.println("ADITYAMAN COLLEGE ENGINERRING");
            try{Thread.sleep(3000);}catch (Exception e){}
        }
    }
}
class  school extends Thread{
    public void run(){
        for (int i = 0; i <= 2; i++) {
            System.out.println("ST.JOSEPH MATRIC HIGHER SECONDARY SCHOOL");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}



public class multithreading {
    public static void main(String[] args) {
//    hello obj=new hello();
//    obj.h1();
//    hi obj1=new hi();
//    obj1.h2();


//        hello obj=new hello();
//    obj.start();
//    hi obj1=new hi();
//    obj1.start();

     details obj =new details();
     obj.start();
        intermedate obj1 =new intermedate();
        obj1.start();
        school obj2 =new school();
        obj2.start();
    }
}

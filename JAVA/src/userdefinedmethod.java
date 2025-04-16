//class demo{
////    public void greet(){
////        System.out.println("welcome to tata strive");
////    }
//    public void add(int a,int b){
//        System.out.println("add "+(a+b));
//    }
//    public int sub(int a, int b){
//        return a-b;
//    }
//    public void multiple(int a,int b){
//        System.out.println("multiple"+(a*b));
//    }
//    public void division(int a,int b){
//        System.out.println("division"+(a/b));
//    }
//    public int multi(int a, int b){
//        return a*b;
//    }
//}


//    class details{
//    public void s1(String name,int age,String branch){
//        System.out.println("name:"+name);
//        System.out.println("age:"+age);
//        System.out.println("branch:"+branch);
//    }
//    public void s2(String name,int age,String branch,int roll_no){
//        System.out.println("name:"+name);
//        System.out.println("age:"+age);
//        System.out.println("branch:"+branch);
//        System.out.println("roll_no:"+roll_no);
//
//    }
//    public void t1(String name,int age){
//        System.out.println("name:"+name);
//        System.out.println("age"+age);
//
//
//    }

class company{
    public void empolyee_detail(String name,int id,String role,long salary){
        System.out.println(name);
        System.out.println(id);
        System.out.println(role);
        System.out.println(salary);
}
    public void empolyee(String name,int id,int emp,int phone){
        System.out.println(name);
        System.out.println(id);
        System.out.println(emp);
        System.out.println(phone);


    }
}


public class userdefinedmethod {
    public static void main(String[] args) {
//        demo obj1=new demo();
////        obj1.greet();
//        obj1.add(5,5);
//        int result=obj1.sub(5,5);
//                System.out.println("sub"+result);
//        obj1.multiple(5,5);
//        obj1.division(5,5);
//        int result1=obj1.multi(5,5);
//        System.out.println("multi"+result1);


//        details obj1=new details();
//        obj1.s1("karan",22,"b.tech");
//        obj1.s2("murali",22,"b.tech",21);
//        obj1.t1("sachin",45);


        company obj1=new company();
        obj1.empolyee_detail("karan",12,"worker",12000);
        company obj2=new company();
        obj1.empolyee("karan",12,3,1234567889);

    }
}

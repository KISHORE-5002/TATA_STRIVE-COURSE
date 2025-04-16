//class a1{
//    public void m1(){
//        System.out.println("hwello");
//    }
//}
//class b1 extends a1{
//    public void m2(){
//        System.out.println("hell");
//    }
//}
//class c1 extends a1 {
//    public void m3() {
//        System.out.println("hhh");
//    }
//}




class f1{
    public void food1(String type_of_food,String name,int rating){
        System.out.println(type_of_food+" "+name+" "+rating);
    }
}
class f2 extends f1{
    public void food2(String name,int price,int quality){
        System.out.println(name+" "+price+" "+quality);
    }
}
class f3 extends f1 {
    public void food3(String name,int price,int quality) {
        System.out.println(name+" "+price+" "+quality);
    }
}



public class hericalinheritance1 {
    public static void main(String[] args) {
//        c1 obj = new c1();
//        b1 obj1 = new b1();
//        obj.m1();
//        obj1.m2();
//        obj1.m1();
//        obj.m3();
        f3 obj=new f3();
        f2 obj1=new f2();
        obj.food1("veg","dosa",4);
        obj.food3("dosa",25,2);
        obj1.food1("non-veg","kabbab",5);
        obj1.food2("kabbab",80,8);
    }
}


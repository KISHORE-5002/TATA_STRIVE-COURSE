//class a1{
//    public void hi(){
//        System.out.println("hwello");
//    }
//}
//class b1 extends a1{
//    public void hello(){
//        System.out.println("hell");
//    }
//}
//class c1 extends b1{
//    public void how(){
//        System.out.println("hhh");
//    }
//}



class animal{
    public void d1(String color,String type_of_food){
        System.out.println(color+" "+type_of_food);
    }
}
class dog extends animal{
    public void d2(String name,String breed,String color){
        System.out.println(name+" "+breed+" "+color);
    }
}
class baby_dog extends dog{
    public void d3(String name,String breed,String color,String gender){
        System.out.println(name+" "+breed+" "+color+" "+gender);
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {
         baby_dog obj=new baby_dog();

        obj.d1("black","pedrgiri");
        obj.d2("leo","pitbull","black");
        obj.d3("leo","pitbull","black","male");

    }
}

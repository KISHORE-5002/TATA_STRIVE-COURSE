//class a{
//    public void hai(){
//        System.out.println("hai");
//    }
//}
//class b extends  a{
//    public void hello(){
//    System.out.println("hello");
//    }
//}

//
//class dog{
//    public void details1(String name,String color,String breed){
//        System.out.println(name +"    "+color+"   "+breed);
//    }
//}
//class baby_dog extends dog{
//    public void details2(String name,String color,String breed,String gender){
//        System.out.println(name +"     "+color+"    "+breed+"    "+gender);
//    }
//}


class car1{
    car1(String color,int wheels){
        System.out.println(color +" "+wheels);
    }
    public void details1(String fuel_type,int price){
        System.out.println(price+" "+fuel_type);
    }
}
class bmw{
    bmw(String color,int price){
        System.out.println(color +" "+price);
    }
    public void details1(String model,String color){
        System.out.println(model+" "+color);
    }
}

public class singleinheritance {
    public static void main(String[] args) {
//       b obj=new b();
//       obj.hai();
//       obj.hello();



//        baby_dog obj=new baby_dog();
//        obj.details2("simba","balck","pit bull","male");
//        obj.details1("leo","black","pit bull");


        car1 obj1=new car1("black",4);
        obj1.details1("petrol",1200000);
        bmw obj2=new bmw("black",1200000);
        obj2.details1("bs4","black");
    }
}

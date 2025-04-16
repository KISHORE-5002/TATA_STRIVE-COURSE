//class abc{
//    abc(int a,int b){
//        System.out.println("welcome");
//        System.out.println(a+b);
//    }
//class person
//{
//    person(String name,int age)
//    {
//        System.out.println(name+"   "+age);
//    }
//    public void add(int a,int b)
//    {
//        System.out.println(a+b);
//    }
//}







//class lorry
//{
//    lorry(String color,int prize, int tyre_size){
//        System.out.println(color+" "+prize+" "+tyre_size);
//    }
//    lorry(String fuel_type,int capacity){
//        System.out.println(fuel_type+" "+capacity);
//    }
//    public void car(String name,String color,int price){
//        System.out.println(name+" "+color+" "+price);
//    }
//    public void bike(String name,String color){
//        System.out.println(name+" "+color);
//    }
//}



class e1{
    e1(String name,String role,int salray,String gender){
        System.out.println(name+" "+role+" "+salray+" "+gender);
    }
    e1(String name, int age, String location, int experience){
        System.out.println(name+" "+age+" "+experience+" "+location);
    }
    public void h1(String name,int id,String company_name){
        System.out.println(name+id+company_name);
    }

    public void d1(int id,String name,String location){
        System.out.println(name+id+location);
    }
}

public class constructor1 {
    public static void main(String[] args) {
//        abc obj=new abc(1,2);
//        person obj=new person("karan",12);
//        obj.add(2,1);




//        lorry obj=new lorry("color",2200000,12);
//        lorry obj1=new lorry("petrol",250);
//        obj.car("ferri","grey",28000000);
//        obj1.bike("NS200","grey");


        e1 obj=new e1("karan","worker",12000,"male");
        e1 obj1=new e1("sanjay",22,"mumbai",1) ;
        obj.h1("kavin",12,"pk");
        obj1.d1(1,"kevin","chennai");
    }
}

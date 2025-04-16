interface kara{
    int a=1;
    int b=3;
    void eat();
     void travel();
}
class Mammal implements kara{

    public void eat() {
        System.out.println("mammal eats"+ "  "+a+"  "+b);
    }


    public void travel() {
        System.out.println("trying to travel");
    }
}
public class interface1 {
    public static void main(String[] args) {
     Mammal m=new Mammal();
     m.eat();
     m.travel();
        System.out.println(kara.a+kara.b);
    }
}

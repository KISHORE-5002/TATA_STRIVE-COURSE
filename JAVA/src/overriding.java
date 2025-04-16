class parent{
    public void mobile(){
        System.out.println("samsung");
    }
}
class child extends parent{
    public void mobile(){
        System.out.println("iphone");
    }
}

public class overriding {


    public static void main(String[] args) {
        child obj=new child();
        obj.mobile();
    }

}


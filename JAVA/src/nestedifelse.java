import java.util.*;
public class nestedifelse {
    public static void main(String[] args) {
       Scanner sd=new Scanner(System.in);
        System.out.println("enter the a number:");
        int a= sd.nextInt();
//        System.out.println("enter the b number:");
//        int b=sd.nextInt();
//        System.out.println("enter the c number:");
//        int c=sd.nextInt();
        if(a>=0){
            if(a>=90 || a>=70){
                System.out.println("a grade");
            }
            else{
                System.out.println("c grade");
            }
        }
        else{
            if(a>=69 || a>=40){
                System.out.println("b grade");
            }
            else{
                System.out.println("c grade");
            }
        }
    }
}

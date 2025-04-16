import java.util.*;
public class ifelseif {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);

        System.out.println("enter the a number:");
        int a= sd.nextInt();

        System.out.println("enter the b number:");
        int b=sd.nextInt();

        System.out.println("enter the c number:");
        int c=sd.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is greater");
        }
        else if(b>=a && b>=c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is grearter");
        }
    }
}

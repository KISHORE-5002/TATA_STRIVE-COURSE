
import java.util.*;
public class nestedifelsegrademethod {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        System.out.println("enter the a percentage:");
        int a= sd.nextInt();
        System.out.println("enter the b percentage:");
        int b=sd.nextInt();
        System.out.println("enter the c percentage:");
        int c=sd.nextInt();
        if(a>=b && a>=90){
            if(a>=c){
                System.out.println ("a is a grade");
            }
            else{
                System.out.println("c is a grade ");
            }
        }
        else{
            if(b>=c && b>=90){
                System.out.println("b is a grade");
            }
            else{
                System.out.println("c is a grade");
            }
        }
    }
}

import java.util.*;
public class
evenorodd {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
//        System.out.println("enter the number");        int a=sd.nextInt();
//        if(a%2==0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }
        System.out.println("enter the year:");
        int year=sd.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}

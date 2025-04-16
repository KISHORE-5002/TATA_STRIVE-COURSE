import java.util.*;
public class eligibleforvote {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        System.out.println("enter the age of the person:");
        int a=sd.nextInt();
        if(a>=18){
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not for vote");
        }
    }
}

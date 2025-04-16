import java.util.*;
public class ifelseifgrade {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        System.out.println("enter the a pertage of student");
        int a =sd.nextInt();
        System.out.println("enter the b pertage of student");
        int b =sd.nextInt();
        System.out.println("enter the c pertage of student");
        int c =sd.nextInt();
        if((a>=90)|| (b>=90)|| (c>=90)) {
            System.out.println("a grade");
        }
        else if((a>=80)|| (b>=80)|| (c>=80)){
            System.out.println("b grade");
        }
        else if((a>=70)|| (b>=70)|| (c>=70)){
            System.out.println("c grade");
        }
    }
}

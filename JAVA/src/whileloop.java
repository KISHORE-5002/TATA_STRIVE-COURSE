import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        System.out.println("enter the i");
        int i= sd.nextInt();
        System.out.println("enter the a");
        int a= sd.nextInt();
        int sum=0;
        while(i<=a){
            sum=sum+i;
            i++;
        System.out.println(sum);
        if(sum==16){
            break;
        }

        }
    }
}

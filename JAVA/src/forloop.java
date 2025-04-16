import java.util.*;
public class forloop {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        int i=sd.nextInt();
        int n=sd.nextInt();
        int sum=0;
//        for(i=0;i<=n;i++){
//            System.out.println(i);
//        }
        for(i=0;i<=n;i++){

            sum=sum+i;
            System.out.println(sum);
        }
    }
}

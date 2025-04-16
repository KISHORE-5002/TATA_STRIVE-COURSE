import java.util.*;
public class dowhileloop {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        int i=sd.nextInt();
        int n=sd.nextInt();
        do{
           System.out.println(i);
           i++;
        }while(i<=n);
    }
}

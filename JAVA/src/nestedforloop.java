import java.util.*;
public class nestedforloop {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        System.out.println("i");
        int i=sd.nextInt();
        System.out.println("n");
        int n=sd.nextInt();
        System.out.println("j");
        int j=sd.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<=n;j++){
                System.out.print(i+" "+j);
            }
            System.out.println();
        }
    }
}

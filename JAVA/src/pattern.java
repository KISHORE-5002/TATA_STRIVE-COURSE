import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int row = sd.nextInt();
        int column = sd.nextInt();

        //1 to 5
//
//                for(int i=0;i<row;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//5 to 1

//        for (int i = 0; i <row; i++) {
//            for (int j = 0; j < column-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //5 to 1(space4)


//        for(int i=0;i<row;i++){
//            for (int j=0;j<i;j++) {
//                System.out.print(" ");
//            }
//                for (int j = i; j <column; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j <=row - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //

    }
}

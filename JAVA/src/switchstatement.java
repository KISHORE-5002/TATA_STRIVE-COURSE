import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
//        int days =sd.nextInt();
//        switch(days){
//            case 1:
//                System.out.println("sunday");
//                break;
//            case 2:
//                System.out.println("moday");
//                break;
//            case 3:
//                System.out.println("tuesday");
//                break;
//            case 4:
//                System.out.println("wednesday");
//                break;
//            case 5:
//                System.out.println("thrusday");
//                break;
//            case 6:
//                System.out.println("friday");
//                break;
//            case 7:
//                System.out.println("saturday");
//                break;
//            default:
//                System.out.println("enter a valid");
//        }
            String grade=sd.nextLine();
            switch(grade){
                case "1":
                    System.out.println("grade A");
                break;
                case "2":
                    System.out.println("grade B");
                    break;
                case "3":
                    System.out.println("grade C");
                    break;
                case "4":
                    System.out.println("grade D");
                    break;
                case "5":
                    System.out.println("grade E");
                    break;
                default:
                    System.out.println("enter a proper grade");
            }
    }
}

import java.util.List;
import java.util.Stack;

public class stackcolllection1 {
    public static void main(String[] args) {
//        List<Integer> e3=new Stack<>();
//
//        e3.add(34);
//        e3.add(33);
//        e3.add(36);
//        e3.add(35);
//        e3.add(32);
//        System.out.println(e3);
//        e3.remove(2);
//        System.out.println(e3);
//        System.out.println(e3);
//

        Stack<Integer> e3=new Stack<>();

        e3.push(34);
        e3.push(33);
        e3.push(36);
        e3.push(35);
        e3.push(32);
        System.out.println(e3);
        e3.pop();
        System.out.println(e3);
        e3.remove(1);
        System.out.println(e3);
        e3.add(30);
        System.out.println(e3);
        e3.addFirst(20);
        System.out.println(e3);
        e3.addLast(200);
        System.out.println(e3);

    }
}

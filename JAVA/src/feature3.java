import java.util.*;
import java.util.function.Consumer;
//class demo implements Consumer<Integer>
//{
//    public void accept(Integer i){
//        System.out.println(i);
//    }
//}
public class feature3 {
    public static void main(String[] args) {
//        List<Integer> values=Arrays.asList(1,2,3,4);
//        Consumer<Integer> c=new Consumer<Integer>(){
//            {
//                public void accept(Integer i){
//                System.out.println(i);
//            }
//            }
//        }
//        values.forEach(c);
        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7,8,9);
        values.forEach(c -> System.out.println(c));
    }
}

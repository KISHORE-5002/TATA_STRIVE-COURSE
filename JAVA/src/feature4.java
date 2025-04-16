import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class feature4 {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5);
//        Predicate<Integer> p= new Predicate<Integer>() {
//            public boolean test(Integer i) {
//                return i%2==0;
//            }
//        };
//        Function<Integer,Integer> b=new Function<Integer,Integer>() {
//            public Integer apply(Integer i) {
//                return i*2;
//            }
//        };
//        BinaryOperator<Integer> c= new BinaryOperator<Integer>() {
//            public Integer apply(Integer i, Integer j) {
//                return i+j;
//            }
//        };
//        Stream<Integer> s= values.stream();
//        Stream s1=s.filter(p);
//        Stream s2=s1.map(b);
//        int result =(int) s2.reduce(0,c);
//        System.out.println(result);
        System.out.println(values.stream().filter(i -> i%2==0).map(i ->i*2).reduce(0,(i,j)->i+j));
    }
}

import java.util.*;
import java.util.Set;
public class setcollection1 {
    public static void main(String[] args) {
        Set<String> e1=new HashSet<>();
        e1.add("pipple");
        e1.add("banana");
        e1.add("apple");
        System.out.println(e1);
        e1.add("1");
        System.out.println(e1);
        e1.remove("apple");
        System.out.println(e1);
        System.out.println(e1.size());


//        //treeset
//        Set<Integer> e1=new TreeSet<>();
//        e1.add(3);
//        e1.add(1);
//        e1.add(8);
//        e1.add(12);
//        e1.add(4);
//        System.out.println(e1);
//        e1.remove(8);
//        System.out.println(e1);
//        System.out.println(e1.size());
//        e1.add(0);
//        System.out.println(e1);
//        System.out.println(e1.contains(1));
//        e1.clear();
//        System.out.println(e1);
//        System.out.println(e1.contains(4));
//        System.out.println(e1.size());



//        Set<Integer> e1=new LinkedHashSet<>();
//        e1.add(3);
//        e1.add(1);
//        e1.add(8);
//        e1.add(12);
//        e1.add(45);
//        System.out.println(e1);

//        Set<String> e1=new LinkedHashSet<>();
//        e1.add("apple");
//        e1.add("won");
//        e1.add("queue");
//        e1.add("king");
//        e1.add("lion");
//        e1.add("ace");
//        System.out.println(e1);




    }
}

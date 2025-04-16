import java.util.*;

public class collection1 {
    public static void main(String[] args) {
//        integer
//        Collection<Integer> number=new ArrayList();
//        number.add(10);
//        number.add(20);
//        number.add(30);
//        number.remove(20);
//        System.out.println(number);

//          String
//        Collection<String> names=new ArrayList();
//        names.add("abhi");
//        names.add("ravi");
//        names.add("charile");
//        names.remove("ravi");
//        System.out.println(names);


//ArrayList
//        List d1=new ArrayList();
//        d1.add("kiran");
//        d1.add("tn");
//        d1.add("chicken noodle");
//        d1.add("goa");
//        d1.add(5);
//        d1.add(23);
//        d1.add("kanyakumari");
//        d1.add("uppuma");
//        d1.remove("uppuma") ;
//        d1.add(1,"ka");
//        System.out.println(d1.get(0));
//        System.out.println(d1.getFirst());
//        System.out.println(d1.getLast());
//        System.out.println(d1.indexOf(23));
//        System.out.println(d1.lastIndexOf(5));
//        System.out.println(d1);
//        System.out.println(d1.isEmpty());
//        System.out.println(d1.reversed());
//        System.out.println(d1.size());


//          LinkedList
//        List d1=new LinkedList();
//        d1.add("kishore");
//        d1.add("s");
//        d1.add("sjms 83");
//        d1.add("sjms1 63");
//        d1.add("pmc");
//        d1.add(21);
//        System.out.println(d1);
//        d1.add("it");
//        System.out.println(d1);
//        d1.remove("sjms 83");
//        System.out.println(d1);
//        d1.remove(2);
//        System.out.println(d1);
//        d1.add(4,"tn");
//        System.out.println(d1);
//       d1.add("school");
//        System.out.println(d1);
//        d1.remove("school");
//        System.out.println(d1);
//        d1.remove(1);
//        System.out.println(d1);



        //vector
        List d1=new Vector();
        d1.add(10);
        d1.add(20);
        d1.add(30);
        d1.add(40);
        d1.add(50);
       System.out.println(d1);
       d1.remove(2);
        System.out.println(d1);
        d1.add(3,60);
        System.out.println(d1);
        d1.add(70);
        System.out.println(d1);
        d1.remove(1);
        System.out.println(d1);
        d1.remove(4);
        System.out.println(d1);
        System.out.println(d1.reversed());
        System.out.println(d1);
        Collections.sort(d1);
        System.out.println(d1);

    }
}

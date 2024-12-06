package javase.tutorial.extra.generics.wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Wildcards {
    //older version
    void printCollection(Collection c){
        Iterator it = c.iterator();
        for (int i = 0; i < c.size(); i++) {
            System.out.println(it.next());
        }
    }

    void printCollection2(Collection<Object> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }

    void printCollection3(Collection<?> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new String("a"));
        c.add(new String("b"));
        c.add(new String("c"));
        c.add(new String("d"));
        c.add(new String("e"));
        c.add(new String("f"));
        c.add(new String("g"));
        c.add(new String("h"));
        c.add(new String("i"));
        Wildcards w = new Wildcards();
//        w.printCollection(c);
//        w.printCollection2(c);
//        w.printCollection3(c);
        Collection<?> col = new ArrayList<String>();
//        col.add(new Object()); //compile time
        col.add(null);//allowed

    Object ob = ((List<?>) col).get(0);
        // the same on the list
        List<?> list = new ArrayList<String>();
//        list.add(new Object());
        list.add(null);
        //easy to get as object type
        Object obj = list.get(0);
    }
}

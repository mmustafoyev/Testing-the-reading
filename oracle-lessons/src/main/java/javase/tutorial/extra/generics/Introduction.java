package javase.tutorial.extra.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Introduction {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(new Integer(0));
        list.add(new String("hello"));
        Integer x = (Integer) list.get(0);
        System.out.println(x);
        String s = (String) list.get(1);
        System.out.println(s);
        Integer xc = (Integer) list.iterator().next();
        System.out.println(xc);
        String ss = null;
        while (list.iterator().hasNext()){
            if(list.iterator().next() instanceof String)
                ss = (String) list.iterator().next();
            else
                list.remove(list.iterator().next());
        }
        System.out.println(ss);
    }
}

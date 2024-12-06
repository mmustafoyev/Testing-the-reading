package javase.tutorial.extra.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsAndSubtyping {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        List<Object> lo = list; //todo subtype not work on generics

        //if allowed above in java
        //lo.add(new Object()); // not safe
        //String s  = ls.get(0);
        List<Object> lo = Collections.singletonList((Object) list);
                System.out.println(lo);
    }
}

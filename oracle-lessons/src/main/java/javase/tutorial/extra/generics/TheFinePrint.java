package javase.tutorial.extra.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TheFinePrint {
    public static void main(String[] args) {
        TheFinePrint obj = new TheFinePrint();


        // in the backround erasure their  type parameter
        List<String> list = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<Integer>();
        System.out.println(list.getClass() == list2.getClass());

        //casting and instanceOf
        Collection cs = new ArrayList<String>();
//        if(cs instanceof Collection<String>)   //it isn't
        if(cs instanceof Collection)
            System.out.println();

        //unchacked wanrning
        Collection<String> cstr = (Collection<String>)cs;

//        if(cstr instanceof Collection<String>)

        //try to use badCast
        obj.badCast("String type", new Object());
//        System.out.println(obj.badCast("String type", new Object()));


        //Generics on object Array
        List<String> [] lsa = new List[10];
        Object o = lsa;
        Object[] oa = (Object[])o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        oa[1] = li;
//        String s = lsa[1].get(0);// todo ClassCastException

        //to clean above Code
        List<?> [] lsa2 = new List<?>[10];
        Object o2 = lsa2;
        Object[] oa2 = (Object[])o2;
        List<Integer> li2 = new ArrayList<Integer>();
        li2.add(new Integer(90));
        oa2[1] = li2;

        String s2 = (String) lsa2[1].get(0);
        System.out.println(s2);

    }

    //unchecked warning
    <T> T badCast(T t, Object o) {
        return (T) o;
    }

    <T> T[] makeArray(T t){
//        return new T[100];//todo compile time
        return (T[])t;
    }
}

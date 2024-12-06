import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Hello");
        List<String> list = new ArrayList<>();
        list.add("World");
        QueueExample q = new QueueExample();
        q.foo(list);

    }

    void foo(List<?> i){
        fooHelper(i);
    }
    private<T> void fooHelper(List<T> l){
        l.set(0, l.get(0));
    }
}

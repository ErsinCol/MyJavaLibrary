import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args)  {
        // queue linked list ile kullanımı
        Queue<Integer> q=new LinkedList();
        for(int i=0;i<5;i++){
            q.add(i);
        }
        System.out.println(q);
        System.out.println("removed element: "+q.remove());
        System.out.println(q);
        System.out.println("head of queue: "+q.peek());
        System.out.println("size of queue: "+q.size());
        // queue priorityqueue ile kullanımı
        Queue<String> pq=new PriorityQueue<>();
        pq.add("İstanbul");
        pq.add("Ankara");
        pq.add("Samsun");
        pq.add("Rize");
        System.out.println(pq);
        pq.remove("Samsun");
        System.out.println("After remove: "+pq);
        System.out.println("After pool: "+pq.poll());
        System.out.println("Final queue: "+pq);
    }
}

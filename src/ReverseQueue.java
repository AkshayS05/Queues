import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    private static void reverseQueue(Queue<Integer> queue) {
    if(queue.isEmpty()){
        return;
    }
    int temp= queue.peek();
    queue.poll();
    reverseQueue(queue);
    queue.add(temp);
        System.out.println(queue);
    }
    public static void main(String[] args) {
        Queue <Integer> queue= new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

    reverseQueue(queue);
    }


}

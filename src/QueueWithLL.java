public class QueueWithLL {
    public static void main(String[] args) throws CustomQueueException{
        QueueUsingLL<Integer> queue= new QueueUsingLL<>();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);

//        System.out.println(queue.front());
        queue.display();
        System.out.println(queue.dequeue());
//        System.out.println(queue.isEmpty());
    }
}

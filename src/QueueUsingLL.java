public class QueueUsingLL <T>{
    private LL <T> front;
    private LL <T> rear;
    private int size;

    public QueueUsingLL(){
        front= null;
        rear=null;
        size=0;
        //non-primitives have a default value of null and and integer(a primitive) has a default value of 0;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public T front(){
        if(isEmpty()){
            return null;
        }
        T temp= front.data;
        front= front.next;
        return temp;
    }
    public void enqueue(T element){
        LL node = new LL (element);

        if(isEmpty()){
        front= node;
        rear= node;
        }else {
            rear.next = node;
            rear = rear.next;
        }
        size++;
    }
    public T dequeue () throws CustomQueueException{
        if(isEmpty()){
            throw new CustomQueueException("Cannot dequeue from an empty queue");
        }
        T element= front.data;
        front= front.next;
        size--;
        return element;
    }
    public void display() throws CustomQueueException{
        if(isEmpty()){
            throw new CustomQueueException("Queue is empty");
        }
        LL temp = front;

        while(temp!=rear.next){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
       System.out.print("END");
        System.out.println();
    }
}

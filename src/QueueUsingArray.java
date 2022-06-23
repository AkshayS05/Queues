public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data= new int [5];
        front=-1;
        rear=-1;
        size=0;
    }
    public QueueUsingArray(int capacity){
        data= new int [capacity];
        front=-1;
        rear=-1;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
    return size==0;
    }
    public int front() throws CustomQueueException{
        if(size==0){
            throw new CustomQueueException("Queue is Empty");
        }
     return data[front];
    }
    public void enqueue(int element) throws CustomQueueException{
if(size==data.length){
    throw new CustomQueueException("Qeue is full");
}
        if(size==0){
            front=0;
        }
        size++;
//        rear++;
//        if(rear==data.length){
//            rear=0;
//        }
        rear= (rear+1)%data.length;
        data[rear]= element;
    }
    public int dequeue() throws CustomQueueException{

        if(size==0){
            throw new CustomQueueException("Cannot dequeue from an empty queue");
        }
        int ele= data[front];

        front= (front+1)%data.length;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return ele;
    }
}

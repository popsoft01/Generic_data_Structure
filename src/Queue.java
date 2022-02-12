import excepton.EmptyListException;

public class Queue<T> {
    private final List<T> queueList;

    public Queue()
    {
        queueList = new List<T>("queue");
    }
    public void enqueue(T object){
        queueList.addToTheBack(object);
    }

    public T dequeue() throws EmptyListException {
        return  queueList.removeFromFront();
    }
    public boolean isEmpty(){
        return queueList.isEmpty();
    }

    public void print(){
        queueList.print();
    }
}

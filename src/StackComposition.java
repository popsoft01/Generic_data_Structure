import excepton.EmptyListException;

public class StackComposition<T>{
    private final List<T> stackList;

    public StackComposition() {
        stackList = new List<T>("stack");
    }
    public void push(T object)
    {
        stackList.addToTheFront(object);
    }
    public T pop() throws EmptyListException
    {
        return stackList.removeFromFront();
    }

    public boolean isEmpty()
    {
        return stackList.isEmpty();
    }
    public void print()
    {
        stackList.print();
    }
}

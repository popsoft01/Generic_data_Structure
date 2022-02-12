import excepton.EmptyListException;

public class StackInheritance<T> extends List<T> {
    public StackInheritance() {
        super("stack");
    }

    public StackInheritance(String listName) {
        super(listName);
    }
    public void push(T insertItem){
        super.addToTheBack(insertItem);
    }

    public T pop() throws EmptyListException {
        return super.removeFromFront();
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    boolean isEmpty() {
        return super.isEmpty();
    }
}

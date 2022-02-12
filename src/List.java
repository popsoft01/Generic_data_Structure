import excepton.EmptyListException;

public class List<T> {
    private  ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private final String name;

    public List()
    {
        this("list");
    }
    // constructor creates an empty List with a name
    public List(String listName)
    {
        name = listName;
        firstNode = lastNode = null;
    }

    public void addToTheFront(T insertItem){
        if (isEmpty()){
            firstNode = lastNode = new ListNode<T>(insertItem);
        } else firstNode = new ListNode<>(insertItem, firstNode);

        }
    public void addToTheBack(T insertItem) {
        if (isEmpty()){
            firstNode = lastNode = new ListNode<T>(insertItem);}
        else lastNode = lastNode.nextNode = new ListNode<>(insertItem);

    }
    public T removeFromFront() throws EmptyListException
    {
        if (isEmpty()){
            throw new EmptyListException(name);
        }
        T removedItem = firstNode.data;
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else
            firstNode = firstNode.nextNode;
        return removedItem;
    }
    public T removeFromBack() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException(name);
        }

        T removeItem = firstNode.data;

        if (firstNode==lastNode){
            firstNode=lastNode=null;
        }else{
            firstNode = firstNode.nextNode;
        }
        return  removeItem;
    }
    public void print() {
        if (isEmpty()){
            System.out.printf("Empty %s%n", name);
        }
        System.out.printf("This %s is: ", name);
        ListNode<T> current = firstNode;
        while(current !=null){
          System.out.printf("%s ", current.data);
            current = current.nextNode;
        }
        System.out.println();
    }

    boolean isEmpty() {
        return firstNode==null;
    }

}

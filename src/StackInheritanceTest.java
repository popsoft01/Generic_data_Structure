import excepton.EmptyListException;

public class StackInheritanceTest {
    public static void main(String[] args) {
        StackInheritance<Integer> stack = new StackInheritance<>();

        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(5);
        stack.print();
        stack.push(1);
        stack.print();

        try
        {
            int removedItem;
            while (true)
            {
                removedItem = stack.pop(); // use pop method
                System.out.printf("%n%d popped%n", removedItem);
                stack.print();
            }
        }
        catch (EmptyListException emptyListException)
        {
            emptyListException.printStackTrace();
        }
    }
    
}

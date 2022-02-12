import excepton.EmptyListException;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List<>();

        list.addToTheFront(0);
        list.print();
        list.addToTheFront(2);
        list.print();
        list.addToTheBack(-1);
        list.print();
        list.addToTheBack(1);
        list.print();

        try{
            int removedItem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();

            removedItem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();

            removedItem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();

            removedItem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();

        } catch (EmptyListException e) {
            e.printStackTrace();
        }
    }
}

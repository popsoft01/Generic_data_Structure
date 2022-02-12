import java.nio.channels.Channel;

public class OverLoadingMethod {
    public static  void  printElement(Integer[] inputElement){
        for (Integer element: inputElement){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static  void  printElement(Double[] inputElement){
        for (Double element: inputElement){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static  void  printElement(Character[] inputElement){
        for (Character element: inputElement){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integerElement = {1,2,3,4,5,6};
        Double[] doublesElement = {1.0,2.0,3.3,4.2,5.1,6.9};
        Character[] charactersElement = {'W','E','L','C','O','M','E'};
        System.out.printf("Array integerElement contains: %n");
        printElement(integerElement);
        System.out.printf("Array doubleElement contains: %n");
        printElement(doublesElement);
        System.out.printf("Array characterElement contains: %n");
        printElement(charactersElement);
    }

}

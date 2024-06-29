import java.util.List;

public class Utility {
    // generic method for printing lists
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);

        }
    }
}

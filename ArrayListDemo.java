import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(23);
        arr.add(7);
        arr.add(5);

        System.out.println(arr);
        System.out.println(arr.get(2));
    }
}

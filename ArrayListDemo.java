import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(23);
        arr.add(7);
        arr.add(5);

        System.out.println(arr.get(2));
        arr.set(3, 16); // change a value/ update
        System.out.println(arr); // display a element
        int n = arr.size(); // find the size of arrayList
        for (int i = 0; i < n; i++) {  // display using loop
            System.out.print(arr.get(i) + " ");
        }
    }
}

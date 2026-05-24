import java.util.*;

public class sort {

    // used built-in function - o(n log n)

    // public static void sort(int[] arr) {
    // Arrays.sort(arr);
    // }

    // brute force approach - o(n)

    // public static void sort(int[] arr) {
    // int zero = 0;
    // int one = 0;
    // int two = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0) {
    // zero++;
    // } else if (arr[i] == 1) {
    // one++;
    // } else {
    // two++;
    // }
    // }
    // int idx = 0;
    // for (int i = 0; i < zero; i++) {
    // arr[idx++] = 0;
    // }
    // for (int i = 0; i < one; i++) {
    // arr[idx++] = 1;
    // }
    // for (int i = 0; i < two; i++) {
    // arr[idx++] = 2;
    // }
    // }

    // optimal solution - o(log n)

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 2, 1, 0, 0, 2, 1, 2, 0 };

        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

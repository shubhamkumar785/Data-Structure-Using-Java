import java.util.ArrayList;

// public class ArrayListDemo {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(25);
//         arr.add(23);
//         arr.add(7);
//         arr.add(5);

//         System.out.println(arr.get(2));
//         arr.set(3, 16); // change a value/ update
//         System.out.println(arr); // display a element
//         int n = arr.size(); // find the size of arrayList
//         for (int i = 0; i < n; i++) { // display using loop
//             System.out.print(arr.get(i) + " ");
//         }
//         System.out.println();
//         arr.add(1, 100); // add a element at specific index
//         arr.remove(1); // remove at specific index
//         arr.clear(); // remove element in a arrayList
//         Collections.reverse(arr);
//         System.out.print(arr);
//     }
// }

// reverse a array using two pointer approach not used build in function

public class ArrayListDemo {
    public static void reverse(ArrayList<Integer> arr) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.print(arr);
        System.out.println();
        reverse(arr);
        System.out.print(arr);
    }
}




// // Adding one in last index

// public class ArrayListDemo {
//     public static ArrayList<Integer> addOne(ArrayList<Integer> arr) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         int n = arr.size() - 1;
//         int carry = 1;
//         for (int i = n; i >= 0; i--) {
//             if (arr.get(i) + carry <= 9) {
//                 ans.add(arr.get(i) + carry);
//                 carry = 0;
//             } else {
//                 ans.add(0);
//                 carry = 1;
//             }
//         }
//         if (carry == 1) {
//             ans.add(1);
//         }
//         Collections.reverse(ans);
//         return ans;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(9);
//         arr.add(9);
//         arr.add(9);
//         arr.add(9);

//         ArrayList<Integer> result = addOne(arr);
//         System.out.println(result);
//     }
// }


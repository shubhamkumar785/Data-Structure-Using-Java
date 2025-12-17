public class BinarySearch {
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int target = 60;
        System.out.print(binarySearch(arr, target));
    }
}




// first and last occurence of sorted array


public class BinarySearch {
    public static ArrayList<Integer> firstAndLast(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int first = -1, last = -1;

        // first occurence
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        if(first == -1){
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        // second occurence
        left = 0;
        right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        ans.add(first);
        ans.add(last);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 5, 5, 67, 122 };
        int target = 5;
        System.out.println(firstAndLast(arr, target));
    }
}





// search a peak element

public class BinarySearch {
    public static int peakElement(int[] arr) {
        int left = 1, right = arr.length - 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 2, 4, 6, 8, 5, 3 };
        System.out.println(peakElement(arr));
    }
}






// search a element in sorted array in descending order

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1, idx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                idx = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return idx;

    }

    public static void main(String[] args) {
        int[] arr = { 100, 91, 86, 77, 65, 52, 47, 38, 24, 16, 5 };
        int target = 24;
        System.out.print(search(arr, target));
    }
}




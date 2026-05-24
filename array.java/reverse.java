public class reverse {
    public static void reverseArray(int[] arr){
        int i =0, j = arr.length;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        i++;
        j--;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        reverseArray(arr);
    }
}

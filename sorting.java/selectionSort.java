
public class selectionSort {
    public static void selection(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1;  i++){
            int smallestIdx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[smallestIdx]){
                    smallestIdx = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIdx];
            arr[smallestIdx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        selection(arr);
    }
}

public class majorityElement {
    public static int majority(int[] arr){
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int freq = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    freq++;
                }
            }
            if(freq > n/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 4, 2, 5};
        System.out.println(majority(arr));
    }
}

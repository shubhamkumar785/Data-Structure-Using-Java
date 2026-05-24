public class moveAllZero {
    public static void move(int[] arr){
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[idx++] = arr[i];
            }
        }
        while(idx < arr.length){
            arr[idx++] = 0;
        }
    }
    public static void main(String[] args){
        int[] arr = {0, 2, 0, 4, 1, 0, 6, 0, 8};
        move(arr);
        
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

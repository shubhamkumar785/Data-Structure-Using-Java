import java.util.*;
/* 
public class QueueCode {

    // Traverse a data
    public static void display(Queue<Integer> queue) {
        int n = queue.size();
        for (int i = 0; i < n; i++) {
            System.out.print(queue.peek() + " ");
            queue.add(queue.remove());

        }
    }
   
    // remove a data at particular index
    public static void addAtIndex(Queue<Integer> queue, int val, int idx){
        int n = queue.size();
        for(int i=1; i<=idx-1; i++){
            queue.add(queue.remove()); 
        }
        queue.add(val);
        for(int i=1; i<=n-idx; i++){
            queue.add(queue.remove());
        }

        
    }

    // Peek element in a queue
    public static void peekElement(Queue<Integer> queue){
        System.out.println(queue.peek());
    }

    // remove a elemnt in a specific index
    public static void removeElement(Queue<Integer> queue, int idx){
        int n = queue.size();

        for(int i=0; i<idx-1; i++){
            queue.add(queue.remove());
        }
        queue.remove();
        for(int i=0; i<n-idx; i++){
            queue.add(queue.remove());
        }
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        display(queue);          // 10 20 30 40 50
        System.out.println();

        addAtIndex(queue, 60, 2); // insert 60 at index 2
        display(queue);          // 10 60 20 30 40 50
        System.out.println();

        removeElement(queue, 2); // remove index 2
        display(queue);          // 10 20 30 40 50
        System.out.println();

        peekElement(queue);      // print front

    }
}


-------------------------------------------------------------------------------------------------------------------------
                                     reverse a elements in a queue
-------------------------------------------------------------------------------------------------------------------------


public class QueueCode {

    public static Queue<Integer> firstKthElements(Queue<Integer> queue){
        Stack<Integer> st = new Stack<>();
        while(queue.size() > 0){
            st.push(queue.remove());
        }
        while(st.size() > 0){
            queue.add(st.pop());
        }
        return queue;

    }
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(firstKthElements(queue));
    }
}

-------------------------------------------------------------------------------------------------------------------------
                                     reverse first kth elements in a queue
-------------------------------------------------------------------------------------------------------------------------


public class QueueCode {
    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
        Stack<Integer> st = new Stack<>();
        int n = queue.size();

        for(int i=0; i<k; i++){
            st.push(queue.remove());
        }
        while(st.size() > 0){
            queue.add(st.pop());
        }
        for(int i=0; i<n-k; i++){
            queue.add(queue.remove());
        }
        return queue;
    }
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int k = 3;

        System.out.println(reverseFirstK(queue, k));
    }
}


-------------------------------------------------------------------------------------------------------------------------
                                     reverse first kth elements in a queue
-------------------------------------------------------------------------------------------------------------------------

*/

public class QueueCode {
    public static int findTheWinner(int n, int k){
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        while(queue.size() > 1){
            for(int i=1; i<= k-1; i++){
                queue.add(queue.remove());
            }
            queue.remove();
        }
        return queue.peek();
    }
    public static void main(String[] args){
        int n = 11;
        int k = 4;

        System.out.println(findTheWinner(n, k));
    }
}
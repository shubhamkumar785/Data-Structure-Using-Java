public class findCyclicBegins {
    public static boolean isCyclic(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            if(slow == null){
                return false;
            }
            fast = fast.next.next;
            if(fast.next == null){
                return false;
            }

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){

    }
}
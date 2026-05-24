public class removeDuplicate {

    public static Node remove(Node head){
        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args){

    }
}
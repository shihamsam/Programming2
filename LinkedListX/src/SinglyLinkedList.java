public class SinglyLinkedList {

    private IntNode head;

    // represents the number of elements in the linked list
    private int size;

    public void AddToFront(int value){

        IntNode newNode = new IntNode(value);
        newNode.setNext(head);
        head = newNode;
        size++;

    }

    public IntNode removeFromFront(){

        if(isEmpty()){
            return null;
        }

        IntNode removedNode = head;
        head = head.getNext();

        size--;

        return removedNode;
    }

    public boolean isEmpty() {
         return head == null;
    }


    public int getSize(){
        return size;
    }

    public void printLinkedList(){

        IntNode current = head;

        while (current != null){
            System.out.print(current.getValue());
            System.out.print(" => ");
            current = current.getNext();
        }

        System.out.println(" ");

    }
}


public class DoublyLinkedList {

    private IntNode head;
    private IntNode tail;

    // represents the number of elements in the linked list
    private int size;

    public void AddToFront(int value){

        IntNode newNode = new IntNode(value);

        // if empty
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else {

            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }

        size++;

    }

    public void AddToBack(int value){

        IntNode newNode = new IntNode(value);

        // if empty
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else {

            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;
    }

    public IntNode search(int value){
        IntNode current = head;

        while (current.getValue() != value && current != null){
            current = current.getNext();
        }

        if(current == null)
        {
            System.out.println("Node not found!");
        }

        return current;

    }

    public IntNode removeFromFront(){

        if(isEmpty()){
            return null;
        }

        IntNode removedNode = head;
        head = head.getNext();
        head.setPrev(null);

        if(head == null){
            tail = null;
        }
        size--;

        return removedNode;
    }

    public IntNode removeFromBack(){

        if(isEmpty()){
            return null;
        }

        IntNode removedNode = tail;
        tail = tail.getPrev();
        tail.setNext(null);

        if(tail == null){
            head = null;
        }
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
            System.out.print(" <=> ");
            current = current.getNext();
        }

        System.out.println(" ");

    }
}


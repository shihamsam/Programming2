public class LinkedList {

    private Node head;
    private int size;

    public void addToFront(int item){

        Node node = new Node(item);
        node.setNext(head);
        head = node;

        size++;
    }

    public Node removeFromFront(){

        if(isEmpty())
            return null;

            Node removedNode = head;
            head = head.getNext();
            size--;

            return  removedNode;

    }

    public boolean isEmpty(){
        return  head == null;
    }

    public int getSize(){
        return  size;
    }

    public void printList() {
        Node current = head;

        while (current != null){
            System.out.print(current.getValue());
            System.out.print( " -> ");

            current = current.getNext();

        }
        System.out.println();
    }
}

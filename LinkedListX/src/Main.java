public class Main {

    public static void main(String[] args) {
	// write your code here

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.AddToFront(5);
        sll.AddToFront(10);
        sll.AddToFront(15);


        sll.printLinkedList();

        sll.AddToFront(20);
        sll.printLinkedList();

        sll.removeFromFront();
        sll.removeFromFront();

        sll.printLinkedList();

        System.out.println("Size: " + sll.getSize());

    }
}

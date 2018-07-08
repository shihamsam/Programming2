public class Main {

    public static void main(String[] args) {
	// write your code here

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.AddToFront(5);
        sll.AddToFront(10);
        sll.AddToFront(15);

        System.out.println("Size: " + sll.getSize());
        sll.printLinkedList();

        sll.AddToFront(20);

        System.out.println("Size: " + sll.getSize());
        sll.printLinkedList();

        // remove items
        sll.removeFromFront();
        sll.removeFromFront();

        System.out.println("Size: " + sll.getSize());
        sll.printLinkedList();



    }
}

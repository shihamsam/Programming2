public class Main {

    public static void main(String[] args) {
	// write your code here

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.AddToFront(5);
        dll.AddToFront(10);
        dll.AddToFront(15);

        System.out.println("Size: " + dll.getSize());
        dll.printLinkedList();

        dll.AddToFront(20);

        System.out.println("Size: " + dll.getSize());
        dll.printLinkedList();

        // remove items
        dll.removeFromFront();
        dll.removeFromFront();

        System.out.println("Size: " + dll.getSize());
        dll.printLinkedList();



    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList list = new LinkedList();
        list.addToFront(10);
        list.addToFront(13);
        list.addToFront(15);
        list.addToFront(17);
        list.addToFront(19);


        list.printList();

        list.removeFromFront();
        list.removeFromFront();
        list.printList();
    }
}

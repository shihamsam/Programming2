public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayQueue queue = new ArrayQueue(10);

        queue.Add(10);
        queue.Add(20);
        queue.Add(30);

        queue.printQueue();

        queue.Remove();

        queue.printQueue();


    }
}

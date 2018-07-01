public class Main {

    public static void main(String[] args) {
	// write your code here

        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        queue.printQueue();

       int val1 = queue.dequeue();
        System.out.println("dequeued value is: " + val1);

        queue.printQueue();

        queue.enqueue(20);

        queue.printQueue();

        System.out.println(queue.peek());

        queue.printQueue();
    }
}

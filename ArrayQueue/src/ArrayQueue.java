import java.util.NoSuchElementException;

public class ArrayQueue {

    private int[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        this.queue = new int[capacity];
    }

    public void Add(int item) {

        // check if the file is full
        if (back == queue.length) {
            //resize the array
            int[] newArray = new int[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            this.queue = newArray;
        }

        this.queue[back] = item;
        back++;

    }

    public int size() {
        return back - front;
    }

    public int Remove() {
        //check if an item exists before removing
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        int item = this.queue[front];
        this.queue[front++] = 0;


        // This is some optimisation
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return item;
    }

    public int Peek() {

        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return this.queue[front];
    }

    public void printQueue() {

        System.out.println("");
        System.out.print("Front: " + front);
        System.out.println(", Back: " + back);

        for (int i = front; i < back; i++) {
            System.out.print(this.queue[i]);
            System.out.print(" -> ");

        }

    }


}

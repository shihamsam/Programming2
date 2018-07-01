public class CircularQueue {

    int front;
    int back;
    int maxSize;
    int nItems;

    int[] queue;
    // Core Functions
    // 1. enqueue
    // 2. dequeue
    // 3. peek

    // Supporting Functions
    //isEmpty
    //isFull
    //clear


    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];

    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Sorry, Queue is Full");
        } else {
            nItems++;
            queue[back] = item;
            back++;
            if (back == maxSize) {
                back = 0;
            }
        }
    }

    public int dequeue() {
        int item = -1;

        if (isEmpty()) {
            System.out.println("Sorry, Queue is Empty");
        } else {

            item = queue[front];
            front++;
            if (front == maxSize) {
                front = 0;
            }
        }
        return item;
    }

    public int peek(){
        int item = -1;

        if (isEmpty()) {
            System.out.println("Sorry, Queue is Empty");
        } else {

            item = queue[front];
        }
        return item;
    }

    private boolean isEmpty() {

        return nItems == 0;
    }

    private boolean isFull() {

        return maxSize == nItems;


    }

    public void printQueue(){
        for(int i= front; i < back; i++){
            System.out.print(queue[i]);
            System.out.print(",");
        }
        System.out.println("");
    }

    public void clear(){
        front = 0;
        back = 0;
        nItems = 0;
    }


}

public class CircularQueue {

    int front;
    int back;
    int maxSize;
    int nItems;

    int[] queue;

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
    //enqueue
    //dequeue
    //peek
    //isEmpty
    //isFull

    private boolean isEmpty() {

        return nItems == 0;
    }

    private boolean isFull() {


//        if(maxSize == nItems){
//            return true;
//        }else{
//            return false;
//
//        }

        return maxSize == nItems;


    }


}

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);
        stack.push("Jane");
        stack.push("John");
        stack.push("Mary");

        stack.printStack();

        System.out.println("pop " + stack.pop());

        stack.printStack();

        System.out.println("Peek " + stack.peek());

        stack.printStack();

    }
}

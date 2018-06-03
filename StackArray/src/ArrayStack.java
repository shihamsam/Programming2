import java.sql.SQLOutput;

public class ArrayStack {

    private int top;
    private int maxSize;
    private String[] stackArray;

    public ArrayStack(int size) {
        this.top = -1;
        this.maxSize = size;
        this.stackArray = new String[this.maxSize];
    }

    public void push(String name) {
        this.stackArray[++top] = name;

    }

    public String pop() {
        return this.stackArray[top--];

    }

    public String peek() {
        return this.stackArray[top];

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == this.stackArray.length -1;
    }


    public void printStack(){
            for(int i=0; i <= top;i++){
                System.out.print(stackArray[i]);
                System.out.print(" ");
            }
            System.out.println("");
    }



}

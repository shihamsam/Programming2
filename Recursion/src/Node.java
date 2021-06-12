public class Node {
    Person oPerson;

    Node leftChild;
    Node rightChild;

    void addRight(Node rightNode){
        this.rightChild = rightNode;
    }

    void addLeft(Node leftNode){
        this.leftChild = leftNode;
    }
}

package com.hallam;

public class TreeNode {

    private Object data;
    private TreeNode leftChild;
    private  TreeNode rightChild;

    public TreeNode(Object data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public TreeNode(Object data, TreeNode leftChild, TreeNode rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public String preOrderString() {

        String preOrderResult = new String("");
        
        preOrderResult += " " + data + " ";
        if(leftChild != null) preOrderResult += leftChild.preOrderString();
        if(rightChild != null) preOrderResult += rightChild.preOrderString();

        return preOrderResult;
    }

    public String inOrderString(){

        String inOrderResult = new String("");
        
        if(leftChild != null) inOrderResult += leftChild.inOrderString();
        inOrderResult += " " + data + " ";
        if(rightChild != null) inOrderResult += rightChild.inOrderString();

        return  inOrderResult;

    }

    // LRV
    public String postOrderString() {
        String postOrderResult = new String("");
        
        if(leftChild != null) postOrderResult += leftChild.postOrderString();
        if(rightChild != null) postOrderResult += rightChild.postOrderString();
        postOrderResult += " " + data + " ";

        return postOrderResult;
    }
}

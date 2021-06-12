package com.hallam;

public class BinaryTree {

    protected TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    public String preorderString(){
        if(!this.isEmpty()){
            return root.preOrderString();
        }else{
            return "";
        }
    }

    public String inOrderString(){
        if(!this.isEmpty())
            return root.inOrderString();
        else
            return "";
    }

    public String postOrderString(){
        if(!this.isEmpty()){
            return  root.postOrderString();
        }else{
            return "";
        }
    }
}

package com.hallam;

public class Main {

    public static void main(String[] args) {

        TreeNode nH = new TreeNode("H");
        TreeNode nK = new TreeNode("K");
        TreeNode nE = new TreeNode("E",nH,nK);
        TreeNode nD = new TreeNode("D");
        TreeNode nB = new TreeNode("B",nD,nE);
        TreeNode nG = new TreeNode("G");
        TreeNode nC = new TreeNode("C",null,nG);
        TreeNode nA = new TreeNode("A",nB,nC);

        BinaryTree tree = new BinaryTree(nA);
        System.out.println("Preorder result: " +  tree.preorderString());
        System.out.println("Inorder result: " +  tree.inOrderString());
        System.out.println("Postorder result: " +  tree.postOrderString());

    }
}

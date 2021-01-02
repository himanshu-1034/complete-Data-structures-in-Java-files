package com.test.trees.binarySearchTree;

public class BSTmain {
    public static void main(String[] args) {
        BSTclass tree = new BSTclass();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.inOrderTraversal();
        System.out.println();

        System.out.println(tree.minVal());
        System.out.println();
        System.out.println(tree.maxVal());

        tree.deleteNode(25);
        tree.inOrderTraversal();


        System.out.println();
        System.out.println();
        System.out.println("PRE ORDER TRAVERSAL");
        tree.preOrderTraversal();





    }
}

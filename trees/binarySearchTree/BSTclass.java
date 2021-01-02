package com.test.trees.binarySearchTree;

public class BSTclass {

    private treeNode root;

    public void insert(int val){
        if (root==null){
            root = new treeNode(val);
        }

        else {
            root.insert(val);
        }
    }

    public void inOrderTraversal(){
        if (root!=null)
        root.inOrderTraversal();
    }

    public void preOrderTraversal(){
        if (root!=null)
            root.preOrderTraversal();
    }

    public treeNode get(int val){
        if (root!=null)
            return root.get(val);
        return null;
    }

    public int minVal(){
        if (root==null)
            return Integer.MIN_VALUE;
        else
            return root.minVal();
    }

    public int maxVal(){
        if (root==null)
            return Integer.MAX_VALUE;
        else
            return root.maxVal();
    }

    public void deleteNode(int value){

        root = delete(root,value);

    }

    private treeNode delete(treeNode subTreeroot,int value){
        if (subTreeroot==null)
            return null;
        if (value<subTreeroot.getData())
        {
            subTreeroot.setLeftchild(delete(subTreeroot.getLeftchild(),value));
        }
        else if (value>subTreeroot.getData()){
            subTreeroot.setRightchild(delete(subTreeroot.getRightchild(),value));
        }
        else {
            if (subTreeroot.getLeftchild() == null){
                return subTreeroot.getRightchild();
            }
            else if (subTreeroot.getRightchild()==null)
            {
                return subTreeroot.getLeftchild();
            }
            // case when root has two children

            // replace the sub tree root with the min value in right child
            subTreeroot.setData(subTreeroot.getRightchild().minVal());

            // set the replaced value to null
            subTreeroot.setRightchild(delete(subTreeroot.getRightchild(),subTreeroot.getData()));

        }
        return subTreeroot;
    }


}

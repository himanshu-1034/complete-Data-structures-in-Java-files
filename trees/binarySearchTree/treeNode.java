package com.test.trees.binarySearchTree;

public class treeNode {
    private int data;
    private treeNode leftchild;
    private treeNode rightchild;

    public treeNode(int data){
        this.data = data;
    }

    public void inOrderTraversal(){
        if (leftchild!=null){
            leftchild.inOrderTraversal();
        }
        System.out.print("DATA= "+data+", ");
        if (rightchild!=null){
            rightchild.inOrderTraversal();
        }
    }

    public void preOrderTraversal(){
        System.out.print("DATA= "+data+", ");
        if (leftchild!=null)
            leftchild.preOrderTraversal();
        if (rightchild!=null)
            rightchild.preOrderTraversal();
    }


    public treeNode get(int val){
        if (val==data)
            return this;
        if (val<data)
        {
            if (leftchild!=null)
            {
                return leftchild.get(val);
            }
        }
        else {
            if (rightchild!=null){
                return rightchild.get(val);
            }
        }
        return null;
    }

    public int minVal(){
        if (this.leftchild!=null)
            leftchild.minVal();

        return data;

    }

    public int maxVal(){
        if (this.rightchild!=null)
            rightchild.maxVal();
        return data;
    }


    public void insert(int val){
        if (val==data)
        {return;}
        if (val<data){
            if (leftchild==null){
                leftchild=new treeNode(val);
            }
            else {
                leftchild.insert(val);
            }
        }
        else {
            if (rightchild==null){
                rightchild = new treeNode(val);
            }
            else {
                rightchild.insert(val);
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public treeNode getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(treeNode leftchild) {
        this.leftchild = leftchild;
    }

    public treeNode getRightchild() {
        return rightchild;
    }

    public void setRightchild(treeNode rightchild) {
        this.rightchild = rightchild;
    }
}

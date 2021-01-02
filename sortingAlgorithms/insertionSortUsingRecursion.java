package com.test.sortingAlgorithms;

public class insertionSortUsingRecursion {


    public static void main(String[] args) {
        int insertionArr[] = {20,35,-15,7,55,1,-22};

        insertionSortFunc(insertionArr,insertionArr.length);

        for (int j:insertionArr
        ) {
            System.out.print(j+" ");
        }
        System.out.println(); //print




    }

    public static void insertionSortFunc(int[] arr,int numItems){
        if(numItems<=1) return;

        insertionSortFunc(arr,numItems-1);

        int newElement = arr[numItems-1];
        int i;
        for (i = numItems-1; i > 0 && arr[i - 1] > newElement; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = newElement;

    }

//    public static void insertionSortFunc(int[] arr,int firstUnsortedIndex){
//        if(firstUnsortedIndex==arr.length) return;
//
//        int newElement = arr[firstUnsortedIndex];
//        int i;
//        for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[i] = newElement;
//        insertionSortFunc(arr,firstUnsortedIndex+1);
//    }
}

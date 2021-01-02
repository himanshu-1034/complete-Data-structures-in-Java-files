package com.test.sortingAlgorithms;
//O(n²)
public class insertionSort {
    public static void main(String[] args) {
        int insertionArr[] = {20,35,-15,7,55,1,-22};
        for (int j:insertionArr
        ) {
            System.out.print(j+" ");
        }
        System.out.println(); //print










        for(int firstUnsortedIndex=1;firstUnsortedIndex<insertionArr.length;firstUnsortedIndex++) {
            int newElement = insertionArr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && insertionArr[i - 1] > newElement; i--) {
                insertionArr[i] = insertionArr[i - 1];
            }
            insertionArr[i] = newElement;




            // print
            for (int j : insertionArr
            ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

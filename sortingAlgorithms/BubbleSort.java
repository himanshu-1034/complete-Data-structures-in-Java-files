package com.test.sortingAlgorithms;
//O(n²)
public class BubbleSort {

    static void Swap(int[] a,int i,int j){
        if(i==j) return;
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }

    public static void main(String[] args) {
        int bubbleArr[] = {20,35,-15,7,55,1,-22};
        int unsortedPartitionIndex = bubbleArr.length-1;
//         This is the last index of unsorted partition.Which ,initially will be the last index of unsorted array and after the first sorting loop bubbleArr[unsortedPartitionIndex] will be sorted and we will decrement this value by 1 until we dont get the sorted array.
        while(unsortedPartitionIndex>0){
            for(int i=0;i<unsortedPartitionIndex;i++){
                if(bubbleArr[i]>bubbleArr[i+1]){
                   Swap(bubbleArr,i,i+1);
                }
            }
            for (int i:bubbleArr
                 ) {
                System.out.print(i+" ");

            }
            System.out.println();
            unsortedPartitionIndex--;
        }

    }
}

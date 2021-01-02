package com.test.sortingAlgorithms;
//O(n²)
public class selectionSort {
    public static void Swap(int[] arr,int i,int j){
        if(i==j) return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int selectionArr[] = {20,35,-15,7,55,1,-22};
        int unsortedPartitionIndex = selectionArr.length-1;
        for (int i:selectionArr
             ) {
            System.out.print(i+" ");

        }
        System.out.println();
//         This is the last index of unsorted partition.Which ,initially will be the last index of unsorted array and after the first sorting loop bubbleArr[unsortedPartitionIndex] will be sorted and we will decrement this value by 1 until we dont get the sorted array.
        while(unsortedPartitionIndex>0){

            int largest = 0;
            for(int i=1;i<=unsortedPartitionIndex;i++){
                if(selectionArr[i]>selectionArr[largest]){
                    largest=i;
                }
            }
            Swap(selectionArr,largest,unsortedPartitionIndex);
            unsortedPartitionIndex--;

            for (int i:selectionArr
                 ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

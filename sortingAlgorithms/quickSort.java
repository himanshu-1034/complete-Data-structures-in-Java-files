package com.test.sortingAlgorithms;

// O(nlogn)
public class quickSort {
    public static void main(String[] args) {
        int[] quickArr = {20,35,-15,7,55,1,-22};
        quickSortFunc(quickArr,0,quickArr.length);
        for (int f:quickArr
             ) {
            System.out.print(f+" ");
        }
        System.out.println();
    }
    public static void quickSortFunc(int[] arr,int start,int end){
        if(end-start<=1){
            return;
        }

        int pivot = partition(arr,start,end);
        quickSortFunc(arr,start,pivot);
        quickSortFunc(arr,pivot+1,end);
    }
    public static int partition(int[] arr,int start,int end){
        // pivot will be the first element;
        int pivot = arr[start];
        int i=start;
        int j=end;
        while (i<j){
            // EMPTY LOOP just to find the value smaller than pivot from right to left.
            while (i<j && arr[--j]>=pivot);
            if(i<j){
                arr[i] = arr[j];
            }
            // EMPTY LOOP  just to find value greater than pivot from left to right.
            while (i<j && arr[++i]<=pivot);
            if(i<j){
                arr[j] = arr[i];
            }

        }
        arr[j] = pivot;
        return j;
    }
}

package com.test.sortingAlgorithms;
//O(nlogn)
public class mergeSort {
    public static void main(String[] args) {
        int[] mergeSortArr = {20,35,-15,7,55,1,-22};
        mergeSortFunc(mergeSortArr,0,mergeSortArr.length);

        for (int a:mergeSortArr
             ) {
            System.out.print(a+" ");
        }
        System.out.println();


    }

    public static void mergeSortFunc(int[] arr, int start, int end){
        if(end-start<=1){
            return;
        }
        int mid = (start+end)/2;
        mergeSortFunc(arr,start,mid);
        mergeSortFunc(arr,mid,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr,int start,int mid,int end){

        if(arr[mid-1]<=arr[mid]){
            return;
        }

        int i=start;
        int j=mid;
        int tempIndex = 0;
        int temp[] = new int[end-start];

        while(i<mid&&j<end){
            temp[tempIndex++] = arr[i]<=arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr,i,arr,start+tempIndex,mid-i);
        System.arraycopy(temp,0,arr,start,tempIndex);



    }
}

package com.test.sortingAlgorithms;
// data should have same radix and width
// data must be integers or strings
// first we sort on the basis of digits at ones position
// then tens position
// we have to use a stable sort algo .......!
// O(n)
// uses stable counting sort algo


public class radixSort {
    public static void main(String[] args) {
        int[] radixArr = {4725,4586,1330,8792,1594,5729};
        radixSortFunc(radixArr,10,4);
        for (int g:radixArr
             ) {
            System.out.print(g+" ");
        }
        System.out.println();
    }
    public static void radixSortFunc(int[] input,int radix,int width){
        for(int i=0;i<width;i++){
            radixSingleSort(input,i,radix);
        }
    }
    public static void radixSingleSort(int[] input,int position,int radix){
        int numItems = input.length;
        int[] countArray = new int[radix];
        for(int value:input){
            countArray[getDigit(position,value,radix)]++;
        }
        // adjust the count array
        for(int j=1;j<radix;j++){
            countArray[j]+=countArray[j-1];
        }

        int[] temp = new int[numItems];
        for(int k= numItems-1;k>=0;k--){
            temp[--countArray[getDigit(position,input[k],radix)]] = input[k];
        }

        for(int k=0;k<numItems;k++){
            input[k]  = temp[k];
        }

    }
    public static int getDigit(int position,int value,int radix){
        return value/(int) Math.pow(radix,position) % radix;
    }

}

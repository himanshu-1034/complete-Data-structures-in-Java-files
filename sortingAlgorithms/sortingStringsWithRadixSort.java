package com.test.sortingAlgorithms;

import java.util.Arrays;

public class sortingStringsWithRadixSort {
    public static void main(String[] args) {
        String[] radixArr = {"bcdef","dbaqc","abcde","omadd","bbbbb"};

radixSortFunc(radixArr,26,5);
        for(String g:radixArr
        ) {
            System.out.print(g+" ");
        }
        System.out.println();
    }

    public static void radixSortFunc(String[] input,int radix,int width){
        for(int i=width-1;i>=0;i--){
            radixSingleSort(input,i,radix);
        }
    }
    public static void radixSingleSort(String[] input,int position,int radix){
        int numItems = input.length;
        int[] countArray = new int[radix];
        for(String value:input){
            countArray[getIndex(position,value)]++;
        }
        // adjust the count array
        for(int j=1;j<radix;j++){
            countArray[j]+=countArray[j-1];
        }

        String[] temp = new String[numItems];
        for(int k= numItems-1;k>=0;k--){
            temp[--countArray[getIndex(position,input[k])]] = input[k];
        }

        for(int k=0;k<numItems;k++){
            input[k]  = temp[k];
        }

    }

    public static int getIndex(int position,String value){
        return value.charAt(position) - 'a';
    }

}

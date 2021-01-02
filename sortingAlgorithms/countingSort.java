package com.test.sortingAlgorithms;
// this algorithm sorts on the basis of occurences of elements
// works only with non-negative discrete numbers.
// works in a specific range of numbers.
// the range of numbers in the input array should be near to the length of that array . Ex :- array of length 10 should contain values 1-10.
// dont work with floats ,chars or strings.
// O(n)
public class countingSort {

    public static void main(String[] args) {
        int[] countingArr = {2,5,9,8,2,8,7,10,4,3};

        countingSortFunc(countingArr,1,10);
        for (int g:countingArr
             ) {
            System.out.print(g+" ");
        }
        System.out.println();

    }
    public static void countingSortFunc(int[] arr,int min,int max){
        int[] countarr = new int[max-min+1];
        for(int i=0;i<arr.length;i++){
            countarr[arr[i]-min]++;
        }
        int j=0;
        for(int i=min;i<=max;i++){
            while(countarr[i-min]>0){
                arr[j++] = i;
                countarr[i-min]--;
            }

        }
    }
}

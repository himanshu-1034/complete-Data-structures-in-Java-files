package com.test.searchAlgorithms;

import java.util.Arrays;
// data must be sorted./.!
public class binarySearch {


    public static void main(String[] args) {
        int[] arr = {3,5,1,78,6,4,7,98};
        Arrays.sort(arr);

        System.out.println(binarySearchfunc(arr,78));
        System.out.println(binarySearchfunc(arr,0));
        System.out.println();

        System.out.println("RECURSIVE FUNCTION ->");

        System.out.println(recursivebinarySearchfunc(arr,78));
        System.out.println();
        System.out.println(recursivebinarySearchfunc(arr,0));
        System.out.println();






    }

    public static int binarySearchfunc(int[] input,int val){
        int start = 0;
        int end = input.length;

        while (start<end){
            int midpoint = (start+end)/2;
            if (input[midpoint]==val){
                return midpoint;
            }
            else if(val>input[midpoint]){
                start = midpoint+1;
            }
            else {
                end=midpoint;
            }
        }
            return -1;
    }

    public static int recursivebinarySearchfunc(int[] arr,int val){
        return recursivebinarySearch(arr,0,arr.length,val);
    }

    public static int recursivebinarySearch(int[] input,int start,int end,int val){
        if (start>=end)
            return -1;

        int mid = (start+end)/2;
        System.out.println("midpoint: "+mid);

        if (input[mid]==val)
            return mid;
        else if (input[mid]<val)
            return recursivebinarySearch(input,mid+1,end,val);
        else
            return recursivebinarySearch(input,start,mid,val);
    }
}

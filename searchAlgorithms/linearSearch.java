package com.test.searchAlgorithms;

public class linearSearch {
    public static void main(String[] args) {
        int[] linearArr = {20,35,-15,7,55,1,-22};

        System.out.println(linearSearchFunc(0,linearArr));
        System.out.println(linearSearchFunc(-15,linearArr));
    }
    public static int linearSearchFunc(int val,int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==val)
                return i;
        }
        return -1;
    }
}

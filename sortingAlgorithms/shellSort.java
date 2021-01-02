package com.test.sortingAlgorithms;
//O(n²)
public class shellSort {

    public static void main(String[] args) {
                int shellArr[] = {20,35,-15,7,55,1,-22};
        for (int f:shellArr
             ) {
            System.out.print(f+" ");
        }
        System.out.println();




        for(int gap=shellArr.length/2;gap>0;gap/=2){

            for(int i=gap;i<shellArr.length;i++){
                int newElement = shellArr[i];
                int j = i;
                while(j>=gap && shellArr[j-gap]>newElement){
                    shellArr[j]=shellArr[j-gap];
                    j-=gap;
                }
                shellArr[j] = newElement;





                //print every step of sorted array.
                for (int f:shellArr
                ) {
                    System.out.print(f+" ");
                }
                System.out.println();

            }

        }
    }
}



// in shell sort, we choose the gap depending upon the formula ((three raised to the power k)-1)/2
// the initial gap we choose should be as much close to the length of array as possible but should not exceed its length
// for example , for array of length 15 we would choose the value of k as 3 so that initial gap becomes 13 which is less than 15(length of array)
// this is the basic consideration .... we can choose our own gap size but it should decrement in a linear way.
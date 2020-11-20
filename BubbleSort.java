package com.algorithms.sortingAndSearching;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {8,2,10,6,8,23,9,3};
        arr = bSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] bSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}

package com.algorithms.sortingAndSearching;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {8,2,10,6,8,23,9,3};
        arr = iSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] iSort(int[] arr) {
        for(int i=1; i< arr.length;i++){
            int k=arr[i];
            int j= i-1;
            while(j>=0 && k < arr[j]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
        return arr;
    }
}

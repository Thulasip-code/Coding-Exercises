package com.algorithms.sortingAndSearching;


public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 8, 1, 7, 0};
        int n = arr.length -1;
        quickSort(arr, 0, n);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i: arr)
            System.out.println(i);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if(left >= right)
            return;
        int index = partition(arr, left, right);
        quickSort(arr, left, index-1);
        quickSort(arr,index, right);
    }

    private static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];
        int i = (left-1);
        for (int j=left; j<right; j++)
        {
            if (arr[j] < pivot)
            {
                i++;

                swap(arr, i, j);
            }
        }

        swap(arr, i+1, right);

        return i+1;

    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

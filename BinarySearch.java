package com.algorithms.searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {8,2,10,6,8,23,9,3};
        int n = 10;
        Arrays.sort(arr);
        int index = bSearch(arr, n);
        System.out.println("element index: " + index);
    }

    private static int bSearch(int[] arr, int n) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == n)
                return mid;

            if (arr[mid] < n)
                l = mid + 1;

            else
                r = mid - 1;
        }

        return -1;


    }


}

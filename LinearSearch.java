package com.algorithms.sortingAndSearching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,49,6,3,2,7,5,10};
        int x = 5;
        int result = search(arr,x);

        if(result == -1)
            System.out.println("The given number "+x+" is not present in the array");
        else
            System.out.println("The given number \"+x+\" is present at the index : " +result);
    }

    private static int search(int[] arr, int x) {
        for(int i= 0;i<arr.length;i++)
            if(arr[i] == x)
                return i;
        return -1;
    }
}

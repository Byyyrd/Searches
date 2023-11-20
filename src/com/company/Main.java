package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(binarySearchEntry(new int[]{0,1,3,4,5,6,7,8,9,10},3));
    }

    int findNumberIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == number)
                return i;
        return -1;
    }

    private static int findNumberIndexSorted(int[] array, int number) {
        int high = array.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] == number) {
                return mid;
            }
            if (array[mid] < number) {
                low = mid + 1;
            } else if (array[mid] > number) {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearchEntry(int[] array,int number){
        return binarySearchRecursive(array, number, 0, array.length - 1);
    }
    private static int binarySearchRecursive(int[] array, int number, int low, int high) {
        int mid = (high + low) / 2;
        if (low > high)
            return -1;

        if (array[mid] == number) {
            return mid;
        }
        if (array[mid] < number) {
            low = mid + 1;
        } else if (array[mid] > number) {
            high = mid - 1;
        }
        return binarySearchRecursive(array, number, low, high);
    }
}

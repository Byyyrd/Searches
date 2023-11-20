package com.company;

public class BinarySearchGeneric {

    public static <T extends Number>  int  binarySearch(T[] array, T number) {
        int high = array.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid].doubleValue() == number.doubleValue()) {
                return mid;
            }
            if (array[mid].doubleValue() < number.doubleValue()) {
                low = mid + 1;
            } else if (array[mid].doubleValue() > number.doubleValue()) {
                high = mid - 1;
            }
        }
        return -1;
    }
}

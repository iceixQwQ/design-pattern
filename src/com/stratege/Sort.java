package com.stratege;

/**
 * @Author: iceixQwQ
 * @Date: 2020/11/11 - 11 - 11 - 22:06
 * @Description: com.stratege
 * @Version: 1.0
 */
public class Sort {
    public static void selectSort(Object[] arr, Comparator comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            Object min = arr[i];
            int minPtr = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(comparator.compare(arr[minPtr], arr[j]) > 0){
                    minPtr = j;
                }
            }
            swap(arr, minPtr, i);
        }
    }

    private static void swap(Object[] arr, int i, int j){
        Object tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

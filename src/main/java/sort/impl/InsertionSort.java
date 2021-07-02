package sort.impl;

import sort.IArraySortable;

import java.util.Arrays;

public class InsertionSort implements IArraySortable {

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }


}

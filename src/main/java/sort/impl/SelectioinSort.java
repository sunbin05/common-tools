package sort.impl;

import sort.IArraySortable;

import java.util.Arrays;

public class SelectioinSort implements IArraySortable {
    @Override
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for (int j = i+1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //arr[i] = arr[min];
            if(i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

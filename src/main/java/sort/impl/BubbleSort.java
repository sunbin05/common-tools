package sort.impl;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }


}

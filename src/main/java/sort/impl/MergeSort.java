package sort.impl;

import java.util.Arrays;

public class MergeSort {

    public void sort(int[] arr, int low, int height){
        int mid = (low + height) / 2;
        System.out.println(low+":"+mid+":"+height);
        if(low < height){
            System.out.println("left<<<<<<<<<<<<<");
            sort(arr, low, mid);
            System.out.println("right>>>>>>>>>>>>");
            sort(arr, mid + 1, height);
            System.out.println("merge============");
            merge(arr, low, mid, height);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void merge(int[] arr, int low, int mid, int height){
        int[] temp = new int[height - low + 1];
        int k = 0;
        int i = low;
        int j = mid + 1;
        while (i <= mid && j <= height){
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <= height){
            temp[k++] = arr[j++];
        }
        for(int k2 = 0; k2 < temp.length; k2++){
            arr[k2+low] = temp[k2];
        }
        //System.out.println(Arrays.toString(temp));
    }

    public static int fibonacci(int num){
        // 5! = 5 * 4 * 3 * 2 * 1
        if(num == 1){
            return 1;
        }
        return num * fibonacci(num - 1);
    }


}

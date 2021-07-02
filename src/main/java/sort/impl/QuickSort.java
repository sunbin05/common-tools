package sort.impl;

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] arr, int low, int height){
        if(low > height){
            return;
        }

        int divide = divide(arr, low, height);
        sort(arr, low, divide - 1);
        sort(arr, divide + 1, height);

        System.out.println(Arrays.toString(arr));
    }

    public int divide(int[]  arr, int low, int height){
        int base = arr[height];
        while (low < height) {
            while (low < height && arr[low] < base)
                low++;
            if(low < height){
                int temp = arr[low];
                arr[low] = arr[height];
                arr[height] = temp;
                height--;
            }
            while (low < height && arr[height] > base)
                height--;
            if(low < height){
                int temp = arr[low];
                arr[low] = arr[height];
                arr[height] = temp;
                low++;
            }
        }
        System.out.println(Arrays.toString(arr)+", low:"+low+", height:"+height);
        return low;
    }

//    public void divide(int[] arr, int low, int height){
//        if(height == 1){
//            return;
//        }
//        int[] left = new int[10];
//        int[] right = new int[10];
//        int base = arr[height];
//        int l = 0, r = 0;
//        for(int i = 0; i <height; i++){
//            System.out.println("i="+i+", val="+arr[i]+", base="+base);
//            if(arr[i] < base){
//                left[l++] = arr[i];
//            }else{
//                right[r++] = arr[i];
//            }
//            System.out.println(Arrays.toString(left));
//            System.out.println(Arrays.toString(right));
//        }
//        System.out.println("--------------");
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
//
//
////        divide(left, 0, left.length-1);
////        divide(right, 0, right.length - 1);
//
//    }
}

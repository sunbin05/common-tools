package sort;

import sort.impl.MergeSort;
import sort.impl.SelectioinSort;

public class TestSort {

    public static int[] arr = new int[]{100, 23,50,30,40,80,60,70};

    public static void main(String[] args) {

//        new QuickSort().sort(arr, 0, arr.length - 1);

        new MergeSort().sort(arr, 0, arr.length - 1);
//        new BubbleSort().sort(arr);

//        new InsertionSort().sort(arr);

//        new SelectioinSort().sort(arr);
    }

}

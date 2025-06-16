package day7;

import java.util.Arrays;

public class task2 {

    public static void quickSort(int[] sample, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(sample, low, high);

            quickSort(sample, low, pivotIndex - 1);
            quickSort(sample, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] sample, int low, int high) {
        int pivot = sample[high];  
        int i = low - 1;  

        for (int j = low; j < high; j++) {
            if (sample[j] <= pivot) {
                i++;
                
                int temp = sample[i];
                sample[i] = sample[j];
                sample[j] = temp;
            }
        }

        int temp = sample[i + 1];
        sample[i + 1] = sample[high];
        sample[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {22, 3, 55, 33, 4};
        System.out.println("Before sorting: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}

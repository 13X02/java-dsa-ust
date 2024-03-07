package Homework;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
          for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
              int temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
          }
        }
      }
      public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
          int pivot = partition(arr, low, high);
          quickSort(arr, low, pivot - 1);
          quickSort(arr, pivot + 1, high);
        }
      }
    
      private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
          if (arr[j] <= pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
      }
        public static void mergeSort(int[] arr, int l, int r) {
            if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
            }
        }
        private static void merge(int[] arr, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;
            int[] L = new int[n1];
            int[] R = new int[n2];
            for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
            }
            for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
            }
            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
            }
            while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
            }
            while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
            }
        }

        public static void main(String[] args) {
            int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
            bubbleSort(arr);
            System.out.println("Bubble Sort: ");
            for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");
            }
            System.out.println();
            int[] arr2 = { 64, 34, 25, 12, 22, 11, 90 };
            quickSort(arr2, 0, arr2.length - 1);
            System.out.println("Quick Sort: ");
            for (int i = 0; i < arr2.length; i++) {
              System.out.print(arr2[i] + " ");
            }
            System.out.println();
            int[] arr3 = { 64, 34, 25, 12, 22, 11, 90 };
            mergeSort(arr3, 0, arr3.length - 1);
            System.out.println("Merge Sort: ");
            for (int i = 0; i < arr3.length; i++) {
              System.out.print(arr3[i] + " ");
            }
        }
}

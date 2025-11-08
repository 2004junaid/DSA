
public class MergeSort {
    public static void main(String args[]) {
        int[] arr = { 10, 5, 7, 3, 4, 2, 1, 1, 8 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);

        System.out.println("The sorted array is " + java.util.Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }

    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] mix = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // if array is empty and the other is still there then copy the elements of
        // other array
        while (i <= mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        // copy the mix array(sorted) into the original array
        for (int l = 0; l < mix.length; l++) {
            arr[low + l] = mix[l];
        }

    }

}

package Demo55;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8, 11 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        int start = left;
        int end = right;

        if (start > end) {
            return;
        }

        int basenumber = arr[start];
        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < basenumber) {
                    break;
                }
                end--;
            }
            while (true) {
                if (start >= end || arr[start] > basenumber) {
                    break;
                }
                start++;
            }
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        int temp = arr[end];
        arr[end] = basenumber;
        arr[left] = temp;

        quickSort(arr, left, start - 1);
        quickSort(arr, start + 1, right);

    }
}

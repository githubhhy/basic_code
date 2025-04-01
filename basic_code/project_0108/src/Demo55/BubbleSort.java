package Demo55;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("冒泡排序");
        int[] arr = { 5, 2, 1, 3, 4 };
        arr = bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 -i ; j++) {
                if (arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}

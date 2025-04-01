package Demo55;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        // arr = selectSort(arr);
        arr = selectSort2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            //交换min位置和i位置
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static int[] selectSort2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

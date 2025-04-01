package Demo55;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        arr = insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] insertSort(int[] arr) {
        //查找无序部分的开始索引 
        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                start = i+1;
                break;
            }
        }

        for (int i = start; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        return arr;
    }
}

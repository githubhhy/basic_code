public class Demo12 {
    public static void main(String[] args) {
        int[] array = new int[10] ;
        for (int i = 0; i < array.length; i++) {
            array[i] = i*10+1;
            System.out.println(array[i]);
        }
        System.out.println("=============");
        int[] newArray = copyOfRange(array, 3, 8);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArray = new int[to-from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArray[index] = arr[i];
            index++;
        }
        return newArray;
    }
}

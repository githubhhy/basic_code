public class Demo11 {
    public static void main(String[] args) {
        int [] array = {11,22,33,44,55};
        printArray(array);        
        int max = getMax(array);
        System.out.println(max);

        System.out.println(findExist(array, 10));
        
    }


    public static void printArray(int[] array) {
       System.out.print("[");
        for (int i = 0; i < (array.length-1); i++) {
            System.out.print(array[i]+", ");
        }
       System.out.print(array[array.length-1]);
       System.out.print("]");
    }
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public static boolean findExist(int[] array,int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num) {
                return true;
            }
        }
        return false;
    }
}

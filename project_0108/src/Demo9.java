public class Demo9 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("sum is "+sum);
    }
}

package Demo34;

public class ArrayUtil {
    private ArrayUtil(){}

    public static String pingtArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = average + arr[i];
        }
        return average/arr.length;
    }
}

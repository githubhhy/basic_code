import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[6];
        for (int i = 0; i < array.length; i++) {
            double score;
            score = scanner.nextDouble();
            if (score >= 0 && score <= 100) {
                array[i] = score;
            }
            else 
                i--;
        }
        scanner.close();
        double sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum = sum + array[j];
        }
        sum = sum - getMax(array) - getMin(array);
        System.out.println(sum);
        System.out.println(sum/4.0);

    }
    public static double getMax(double[] array) {
        double max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        return max;
    }

    public static double getMin(double[] array) {
        double min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        return min;
    }

}

import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int temp = num;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        int[] array = new int[count];
        for (int i = array.length - 1; i >=0; i--) {
            array[i] = temp % 10;
            temp = temp / 10;
        }
        
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 5;
            array[i] = array[i] % 10;
        }
        int tmp;
        for (int i = 0,j = array.length-1 ; i < j; i++,j--) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp; 
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result*10 + array[i];
        }
        System.out.println(result);

        int tmp2;
        for (int i = 0,j = array.length - 1; i < j; i++, j--) {
            tmp2 = array[i];
            array[i] = array[j];
            array[j] = tmp2;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=5) {
                array[i] = array[i] - 5;
            }
            else
                array[i] = array[i] + 10 - 5;
        }
        
        int result2 = 0;
        for (int i = 0; i < array.length; i++) {
            result2 = result2 *10 + array[i];
        }
        System.out.println(result2);

    }
}

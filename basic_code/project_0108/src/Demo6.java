import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int i = 0;
        int square = 0;
        while (square<=num) {
            i++;
            square = i*i;
        }
        System.out.println(i-1);
    }
}

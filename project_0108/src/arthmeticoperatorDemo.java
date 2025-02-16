import java.util.Scanner;

public class arthmeticoperatorDemo {
    public static void main(String[] args) {
        System.out.println("please input a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number/100);
        System.out.println(number/10%10);
        System.out.println(number%10);
        scanner.close();
    }
}

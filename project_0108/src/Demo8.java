import java.util.Random;
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand_number = random.nextInt(100)+1;//1~100
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("please guess the number");
        int guess = scanner.nextInt();
        while (true) {
            if (guess>rand_number) {
                System.out.println("please guess small");
                guess = scanner.nextInt();
            } else if (guess<rand_number) {
                System.out.println("please guess big ");
                guess = scanner.nextInt();
            } else{
                System.out.println("guess right");
                break;
            }
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int i=2;
        for (i = 2; i < num; i++) {
            if(num%i==0){
                System.out.println("no a zhishu");
                break;
            }   
        }
        if (i==num) {
            System.out.println("is a zhishu");
        }
    }
}

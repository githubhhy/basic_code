import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        // 计算num1/num2 和num1%num2 ， 不使用*、/、%
        int a=0;
        int b=0;
        while (num1>num2) {
            num1 = num1-num2;
            a=a+1;
            if (num1<num2) {
                b = num1;
            }
        }
        System.out.println("shang is "+a);
        System.out.println("yushu is "+b);
    }
}

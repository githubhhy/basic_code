import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        System.out.println("num is "+ num);
        int num2 = 0;
        while (temp >0 ) {
            int ge = temp%10;
            temp = temp/10;
            num2 = num2*10+ge;
        }
        System.out.println("num2 is "+num2);
        if((num2-num)==0)
            System.out.println("is the huiwenshu");
        else 
            System.out.println("not a huiwenshu");
        scanner.close();
    }
}

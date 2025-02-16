package keyboard;

//import package
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //creat object
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number");
        //receive data
        int i = scanner.nextInt();
        //print data
        System.out.println(i);
        scanner.close();
    }
}

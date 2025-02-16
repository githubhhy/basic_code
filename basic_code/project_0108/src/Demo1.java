import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input tow number");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int count=0;
        for(int i=start;i<=end;i++){
            if((i%3==0) &&(i%5==0)){
                count++;
                System.out.println(i);
            }
               
        }
        scanner.close();
        System.out.println("the sum is "+count);
    }
}

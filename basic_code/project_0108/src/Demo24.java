import java.util.Scanner;

public class Demo24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money = scanner.nextInt();
            if (money>=0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效,重新输入");
            }
        }
        scanner.close();
        System.out.println(numToString(money));
    }

    public static String numToString(int money) {
        String[] arr1 = {"壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String[] arr2 = {"佰","拾","万","仟","佰","拾","元"}; 
        String str = "";
        for (int i = 0; i < 7; i++) {
            int ge = money % 10;
            if (ge > 0) {
                str = arr1[ge-1] + arr2[7-i-1] + str;
            } else {
                str = '零' + arr2[7-i-1] + str;
            }
            money = money / 10;
        }
        return str;
    }
}

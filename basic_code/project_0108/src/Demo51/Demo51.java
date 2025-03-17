package Demo51;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo51 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String str = scanner.nextLine();
            int num = Integer.parseInt(str);
            if (num<1 || num>100) {
                System.out.println("数据范围有误");
                continue;
            }
            list.add(num);//自动装箱，相当于list.add(Integer.valueOf(num))
            int sum = getSum(list);
            if (sum>200) {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        scanner.close();
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        return sum;
    }       
                
}

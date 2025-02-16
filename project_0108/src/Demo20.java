

import java.util.Random;
import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        //1-随机生成中奖号码
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < 6; ) {
            int rednumber = random.nextInt(33) + 1;
            if (!contains(arr, rednumber)) {
                arr[i] = rednumber;
                i++;
            }
        }
        arr[6] = random.nextInt(16) + 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

        //2-用户输入号码
        System.out.println("请输入6个红球(1-33)和1个蓝球(1-16)");
        int[] myarray = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6;) {
            int inputnum= scanner.nextInt();
            if (inputnum>=1 && inputnum <=33) {
                if (!contains(myarray, inputnum)){
                    myarray[i] = inputnum;
                    i++;
                }
                else
                    System.out.println("不能重复输入");
            }
            else
                System.out.println("输入违法");
        }
            int inputnum= scanner.nextInt();
            if (inputnum>=1 && inputnum <=16) {
                if (!contains(myarray, inputnum)){
                    myarray[6] = inputnum;
                }
                else
                    System.out.println("不能重复输入");
            }
            else
                System.out.println("输入违法");
        scanner.close();

        //3-判断
        int countRed = 0;
        int countBlue = 0;
        for (int i = 0; i < 6; i++) {
            if ( contains(arr,myarray[i]) )
                countRed++;
        }
        if ( contains(arr,myarray[6]) )
            countBlue++;
        
        // System.out.println(countRed);
        // System.out.println(countBlue);
        if(countRed == 6 && countBlue == 1)
            System.out.println("一等奖1000w");
        else if (countRed == 6 && countBlue == 0)
            System.out.println("二等奖500w");
        else if (countRed == 5 && countBlue == 1)
            System.out.println("三等奖3000");
        else if ( (countRed == 5 && countBlue == 0) || (countRed == 4 && countBlue == 1) )
            System.out.println("四等奖200");
        else if ( (countRed == 4 && countBlue == 0) || (countRed == 3 && countBlue == 1) )
            System.out.println("五等奖10");
        else if ( (countRed == 2 && countBlue == 1) || (countRed == 1 && countBlue == 1) || (countRed == 0 && countBlue == 1) )
            System.out.println("六等奖5");    
        else
            System.out.println("未中奖");
    }



    public static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}

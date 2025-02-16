import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("money:");
        double money = scanner.nextDouble();
        System.out.println("mounth:");
        int mounth = scanner.nextInt();
        scanner.nextLine();//在调用nextLine()之前，先调用一次nextLine()来清除缓冲区中的换行符
        /*
            nextInt()、nextDouble()等方法只会读取输入的数字部分，
            而不会读取输入后的换行符。
            因此，当你在nextInt()之后调用nextLine()时，nextLine()会读取到缓冲区中残留的换行符，
            导致它直接返回空字符串并继续执行
        */
        System.out.println("tdc or jjc?");
        String level = scanner.nextLine();
        scanner.close();
        //System.out.println(level);

        if ( mounth>=5 && mounth<=10 ){
            if ( level.equals("tdc") ) 
                System.out.println("the real money = "+ money*0.9);
            else
                System.out.println("the real money = "+ money*0.85);
        }
        else if ( (mounth>=1 && mounth<=4) || (mounth>=11 && mounth<=12) ){
            if ( level.equals("tdc") )
                System.out.println("the real money = "+ money*0.7);
            else
                System.out.println("the real money = "+ money*0.65);
        }

    }
}

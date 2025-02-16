package Demo22;

import java.util.Scanner;
/*创建了 Car 数组但没有初始化每个元素导致的。
    在 Java 中，创建对象数组后，每个元素默认是 null，
    你需要先实例化每个 Car 对象才能调用它的方法。

*/public class Demo23 {
    public static void main(String[] args) {
        Car[] array = new Car[3];//这里只是创建了数组容器，但每个元素都是 null
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("录入Car "+i+" 品牌,价格和颜色");
            array[i] = new Car();//先创建 Car 对象再调用方法
            array[i].setBrand(scanner.next());
            array[i].setPrice(scanner.nextInt());
            array[i].setColor(scanner.next());
        }
        System.out.println("展示： ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getBrand()+", "
                +array[i].getPrice()+", "
                +array[i].getColor());
        }
        
    }
}

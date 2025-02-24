/*
    static表示静态，是java中的一个修饰类，可以修饰成员方法，成员变量
    变量被static修饰后，静态变量被该类所有对象共享，随着类的加载而加载，优先于对象而存在
    调用方式：  类名调用  Student.teachername = "xxx";
                对象名调用  student.teachername = "xxx";

    方法被static修饰后，静态方法多用在测试类和工具类中，javabean类中很少会用
    调用方式：  类名调用  Student.get();
                对象名调用  student.get();

    工具类：类名见名知意，私有化构造方法，方法定义为静态
*/ 
package Demo34;

public class Demo34 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        String str = ArrayUtil.pingtArr(arr1);
        System.out.println(str);

        double[] arr2 = {100,88,76,45,23};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}

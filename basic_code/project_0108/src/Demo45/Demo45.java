package Demo45;

public class Demo45 {
    public static void main(String[] args) {
        /*
         * JDK8以后，允许在接口中定义默认方法了，使用关键字default修饰，用来解决接口升级的问题
         * 原来：在接口中新增了方法，所有实现了接口的地方也要进行实现新增方法
         * 现在：使用default修饰就不强制重写了。重写的时候，只需要去掉重写处的default就好
         * public default void show(){}
         * 注意：如果实现了多个接口，多个接口中存在名字相同的默认方法，子类就必须对该方法进行重写
         */

         IntetImpl impl = new IntetImpl();
         impl.method();
         impl.show();
        /*
         * JDK8以后，允许在接口中定义静态方法，用static修饰
         * public static void show(){}
         * 静态方法只能通过接口名调用
         * 
         */
        Inter.Smethon();
    }
}

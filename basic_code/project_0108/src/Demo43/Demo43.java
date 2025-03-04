package Demo43;

public class Demo43 {
    public static void main(String[] args) {
        /*
         * 接口 interface
         * 接口不能实例化
         * 接口和类之间是实现关系，可以单实现，也可以多实现，即可以实现多个接口
         *      public class 类名 implements 接口名{}
         * 接口的子类（实现类）：要么重写接口中的所有抽象方法，要么是抽象类
         * 
         * 可以把接口理解为更加抽象的抽象类
         */
        
        Frog f = new Frog("哇哇哇", 10);
        System.out.println(f.getName()+", "+f.getAge());
        f.eat();
        f.swim();
        

    }
}

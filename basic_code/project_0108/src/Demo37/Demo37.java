/*
继承：    
    构造方法：均不能继承
    成员变量：共有的能继承能使用，私有的能继承不能使用
    成员方法：共有的能继承能使用，私有的不能继承

this关键字
super关键字

方法的重写：当父类的方法不能满足子类当前需求时，需要进行方法重写
    @Override重写注解，写在重写后的方法之前
    重写方法的名称、形参必须与父类一致
    访问权限必须大于等于父类 public > protected > 空着不写
    返回值类型子类小于等于父类
    只有被添加到虚方法表里的才能被重写（非private、非静态、非final修饰）
 */

package Demo37;

public class Demo37 {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();

        System.out.println("---------------");
        Sharpei s = new Sharpei();
        s.eat();
        s.drink();
        s.lookHome();
        
        System.out.println("---------------");        
        Chinesedog cd = new Chinesedog();
        cd.eat();
        cd.drink();
        cd.lookHome();
        
    }
}

package Demo40;

public class Demo40 {
    public static void main(String[] args) {
        //多态方式创建对象 Fu f = new Zi();
        Animal a = new Dog();
        
        //调用成员变量：编译看左边，运行看左边
        //编译时，javac，会看左边的父类中有没有这个变量，如果有编译成功，否则，编译i失败
        //运行时，java,实际获取的就是左边父类里的成员变量的值
        System.out.println(a.name);

        //调用成员方法：编译看左边，运行看右边
        //编译时，javac，会看左边的父类中有没有这个方法，如果有编译成功，否则，编译i失败
        //运行时，java，实际调用的右边子类里的成员方法
        a.show();

        //多态的弊端：不能调用子类的特有功能, a.lookHome();会报错
        //解决方案，强制转换回子类的类型就可以了
        Dog d = (Dog)a;
        d.lookHome();


        // if (a instanceof Dog) {
        //     Dog d = (Dog)a;
        //     d.lookHome();
        // }else if (a instanceof Cat) {
        //     Cat c = (Cat)a;
        // } else{
        //     System.out.println("转换失败");
        // }
    }
    
}

class Animal {
    String name = "动物";
    public void show(){
        System.out.println("Animal__show方法");
    }
}

class Dog extends Animal {
    String name = "狗";
    
    @Override
    public void show() {
        System.out.println("Dog__show方法");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}

class Cat extends Animal{
    String name = "猫";
    @Override
    public void show() {
        System.out.println("Cat__show方法");
    }
}
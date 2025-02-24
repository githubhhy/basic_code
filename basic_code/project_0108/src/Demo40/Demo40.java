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
}

class Cat extends Animal{
    String name = "猫";
    @Override
    public void show() {
        System.out.println("Cat__show方法");
    }
}
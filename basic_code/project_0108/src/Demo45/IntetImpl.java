package Demo45;

public class IntetImpl implements Inter,Inter2{

    @Override
    public void method() {
        System.out.println("重写的抽象方法");
    }

    @Override
    public void show() {
        System.out.println("重写的show方法");
    }
}

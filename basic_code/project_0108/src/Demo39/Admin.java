package Demo39;

public class Admin extends Person{
    @Override
    public void show() {
        System.out.println("管理员的信息为："+"name: "+getName()+" age: "+getAge());
    }
}

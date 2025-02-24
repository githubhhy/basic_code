/*
多态：
    同种类型的对象，表现出的不同形态
    父类类型 对象名称 = 子类对象；
    多态的前提条件：
        有继承关系
        有父类引用指向子类对象 Fu f = new Zi();
        有方法重写
    好处:
        使用父类作为参数，可以接收所有子类对象
        体现多态的可扩展性与便利
 */


package Demo39;

public class Demo39 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge("13");

        Teacher teacher = new Teacher();
        teacher.setName("lisi");
        teacher.setAge("30");

        Admin admin = new Admin();
        admin.setName("wangwu");
        admin.setAge("35");

        register(student);
        register(teacher);
        register(admin);
    }


    public static void register(Person p){
        p.show();
    }
}

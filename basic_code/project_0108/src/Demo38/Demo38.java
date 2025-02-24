package Demo38;

public class Demo38 {
    public static void main(String[] args) {
        Manager manager = new Manager("heima001","zhangsan",15000,2000);
        System.out.println(manager.getId()+", "+
                        manager.getName()+", "+
                        manager.getSalary()+", "+
                        manager.getBouns());
        manager.work();
        manager.eat();


        Cook cook = new Cook();
        cook.setId("heima002");
        cook.setName("lisi");
        cook.setSalary(10000);
        System.out.println(cook.getId()+", "+
                        cook.getName()+", "+
                        cook.getSalary());
        cook.work();
        cook.eat();
    }
}

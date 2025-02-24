package Demo38;

public class Manager extends Employee{
    private double bouns;
    
    public Manager() {
    }

    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("吃米饭");
    }
}

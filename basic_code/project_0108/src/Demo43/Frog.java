package Demo43;

public class Frog extends Animal implements Swim{
    public Frog() {
    }
    public Frog(String name, int age) {
        super(name, age);
    }
    @Override
    public void swim() {
        System.out.println("蛙泳");
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }
    
}

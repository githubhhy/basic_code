package Demo41;

public class Demo41 {
    public static void main(String[] args) {
        Dog dog = new Dog(2,"黑");
        Cat cat = new Cat(3,"灰");
        Person p1 = new Person("老王", 30);
        Person p2 = new Person("老李", 25);
        p1.keepPet(dog, "骨头");
        p2.keepPet(cat, "鱼");
    }
}

class Animal{
    private int age;
    private String color;

    public Animal() {
    }
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public void eat(String sth){
        System.out.println("动物吃"+sth);
    }
}


class Dog extends Animal{
    
    public Dog() {
    }
    public Dog(int age, String color){
        super(age, color);
    }
    
    @Override
    public void eat(String sth){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住"+sth+"猛吃");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}

class Cat extends Animal{
    public Cat() {
    }
    public Cat(int age, String color){
        super(age, color);
    }
    
    @Override
    public void eat(String sth){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛侧着头吃"+sth);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public void keepPet(Animal animal,String something){
        if (animal instanceof Dog) {
            System.out.println("年龄为"+age+"的"+name+"养了一只"+animal.getColor()+"颜色的"+animal.getAge()+"岁的狗");
            ((Dog)animal).eat(something);
            
        } else if (animal instanceof Cat) {
            System.out.println("年龄为"+age+"的"+name+"养了一只"+animal.getColor()+"颜色的"+animal.getAge()+"岁的猫");
            ((Cat)animal).eat(something);
        }
        
    }
}
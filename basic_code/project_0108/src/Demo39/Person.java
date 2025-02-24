package Demo39;

public class Person {
    private String name;
    private String age;
    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    
    public void show(){
        System.out.println("name: "+name+" age: "+age);
    }
}

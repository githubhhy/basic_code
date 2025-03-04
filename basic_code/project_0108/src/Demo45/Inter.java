package Demo45;

public interface Inter {
    
    public abstract void method();
    
    public default void show(){
        System.out.println("默认show1方法");
    }

    public static void Smethon(){
        System.out.println("静态方法");
    }
}

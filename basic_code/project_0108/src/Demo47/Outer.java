package Demo47;

public class Outer {
    String name;

    private class Inner{
        //JDK16以前，内部成员类中不可以定义静态变量
        //Static 
        int a = 10;    
    }
    
    public Inner getInner(){
        return new Inner();
    }
}

package Demo48;

public class Outer {
    private int a = 10;

    class Inner{
        int a = 20;
        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }
    }

}

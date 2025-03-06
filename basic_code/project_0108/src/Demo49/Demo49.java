package Demo49;

public class Demo49 {
    public static void main(String[] args) {
        /*
         * 匿名内部类
         * 隐藏了名字的内部类，可以写在成员位置，也可以写在局部位置
         * 格式：
         *  new 类名/接口名(){
         *       重写方法;
         *  };
         * 
         * 本质上，整体是一个对象
         * 
         * 使用场景：如果实现类只实现一次，就可以使用匿名内部类，从而简化代码
         */

        new Swim() {
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        };

        function(
            new Swim() {
                @Override
                public void swim() {
                    System.out.println("游泳111");
                }
            }
        );

        new Animal() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        };

        function2(
            new Animal() {
                @Override
                public void eat() {
                    System.out.println("吃东西111");
                }
            }
        );
        
        
        new Animal() {
            @Override
            public void eat() {
                System.out.println("吃东西222");
            }
        }.eat();


        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("吃东西333");
            }
        };
        a.eat();


    }



    public static void function(Swim s){
        s.swim();
    }
    public static void function2(Animal s){
        s.eat();
    }
}

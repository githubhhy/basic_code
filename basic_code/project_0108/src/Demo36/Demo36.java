/*
    子类只能访问父类中非私有的成员
 */

package Demo36;

public class Demo36 {
    public static void main(String[] args) {
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();
        System.out.println("---------------");
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();
    }
}

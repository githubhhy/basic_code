package Demo22;

public class Demo22 {
    public static void main(String[] args) {
        Object object1 = new Object("001", "手机", 2000, 10);
        Object object2 = new Object("002", "电脑", 9999, 3);
        Object object3 = new Object("003", "平板", 40, 88);

        Object[] objects_array = new Object[3];
        objects_array[0] = object1;
        objects_array[1] = object2;
        objects_array[2] = object3;

        for (int i = 0; i < objects_array.length; i++) {
            System.out.println("商品"+i+"信息:");
            System.out.println('\t'+"id: "+objects_array[i].getId());
            System.out.println('\t'+"name: "+objects_array[i].getName());
            System.out.println('\t'+"price: "+objects_array[i].getPrice());
            System.out.println('\t'+"store: "+objects_array[i].getStore());
        }

        
    }
}

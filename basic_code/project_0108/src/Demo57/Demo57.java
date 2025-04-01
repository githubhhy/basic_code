package Demo57;

import java.util.Arrays;
import java.util.Comparator;

public class Demo57 {
    public static void main(String[] args) {
        girlfriend g1 = new girlfriend("zhangsan", 20, 168);
        girlfriend g2 = new girlfriend("lisi", 20, 168);
        girlfriend g3 = new girlfriend("wangwu", 20, 168);

        girlfriend[] arr = new girlfriend[3];
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        // Arrays.sort(arr, new Comparator<girlfriend>() {
        //     @Override
        //     public int compare(girlfriend o1, girlfriend o2) {
        //         if (o1.getAge()!=o2.getAge()) {
        //             return o1.getAge()-o2.getAge();
        //         }
        //         if (o1.getHeight()!=o2.getHeight()) {
        //             return o1.getHeight()-o2.getHeight();
        //         }
        //         return o1.getName().compareTo(o2.getName());
        //     }
        // });

        Arrays.sort(arr, (o1,o2)->{
                if (o1.getAge()!=o2.getAge()) {
                    return o1.getAge()-o2.getAge();
                }
                if (o1.getHeight()!=o2.getHeight()) {
                    return o1.getHeight()-o2.getHeight();
                }
                return o1.getName().compareTo(o2.getName());
            });

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i].getName()+", "+arr[i].getAge()+", "+arr[i].getHeight());
        // }
        System.out.println(Arrays.toString(arr));
            
    }
}

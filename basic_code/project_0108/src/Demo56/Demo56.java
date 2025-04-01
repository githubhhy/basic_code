package Demo56;

import java.util.Arrays;
import java.util.Comparator;

public class Demo56 {
    public static void main(String[] args) {
        //Lamada表达式
        //数组按照字符串长度进行排序
        String[] arr = {"123456","123","asdas","12","13214322","1"};
        // Arrays.sort(arr, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o1.length()-o2.length();
        //     }
        // });
        
        // Arrays.sort(arr,(String o1, String o2)->{
        //     return o1.length()-o2.length();
        // });

        Arrays.sort(arr, (o1,o2)->o1.length()-o2.length());

        System.out.println(Arrays.toString(arr));
    }
}

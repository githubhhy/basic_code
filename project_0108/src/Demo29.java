//集合ArrayList,可以自动扩容,可以理解为长度可变的数组
//数组可以存储基本数据类型和引用数据类型
//集合可以存储引用数据类型,不能直接存基本的数据类型,需要使用包装类

import java.util.ArrayList;

public class Demo29 {
    public static void main(String[] args) {
        //泛型：限定集合中存储的数据的类型
        ArrayList<String> list = new ArrayList<>();
        list.add("hhy");
        list.add("cjh");
        list.add("20250216");
        System.out.println(list);

        // list.remove("20250216");
        list.remove(0);
        System.out.println(list);

        list.set(1, "hhy");
        System.out.println(list);

        System.out.println(list.get(0));
    }
}

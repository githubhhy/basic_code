package Demo35;

import java.util.ArrayList;

public class Demo35 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("hhy", 23, "男");
        Student stu2 = new Student("hhy2", 24, "男");
        Student stu3 = new Student("hhy3", 25, "男");
        
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        System.out.println(StudentUtil.getMaxage(list));
    }
}

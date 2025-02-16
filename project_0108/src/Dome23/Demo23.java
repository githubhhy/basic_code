package Dome23;

import java.util.Random;

public class Demo23 {
    public static void main(String[] args) {
        System.out.println("task1: ");

        Student[] stu_arr = new Student[3];
        Student stu1 = new Student("heima001", "abc", 10);
        Student stu2 = new Student("heima002", "def", 20);
        Student stu3 = new Student("heima003", "ghi", 30);

        stu_arr[0] = stu1;
        stu_arr[1] = stu2;
        stu_arr[2] = stu3;
        showStudent(stu_arr);



        System.out.println("task2: ");
        Student[] new_stu_arr = new Student[stu_arr.length+1];
        Student stu_a = new Student("heima004", "jkl", 40);
        if (exist(stu_arr, stu_a.getId())) {
            System.out.println('\t'+"学号已经有了,添加失败");
        } else {
            //开始添加
            new_stu_arr = add_Student(stu_arr, stu_a);
            showStudent(new_stu_arr);
        }

        System.out.println("task3: ");
        String delet_id = "heima003";
        if (exist(new_stu_arr, delet_id)) { 
            new_stu_arr = delete_Student(new_stu_arr, delet_id);
            showStudent(new_stu_arr);
        } else {
            System.out.println("\t学号不存在, 删除失败");
        }

        System.out.println("task4: ");
        String search_id = "heima002";
        if (getIndex(new_stu_arr, search_id)!=-1) {
            int tmp_age = new_stu_arr[getIndex(new_stu_arr, search_id)].getAge();
            new_stu_arr[getIndex(new_stu_arr, search_id)].setAge(tmp_age+1);
        }
        showStudent(new_stu_arr);
        

    }


    public static boolean exist(Student[] arr, String id) {
       for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals(id)) {
                return true;
            }
       }  
        return false;
    }

    public static Student[] add_Student(Student[] arr, Student add_stu) {
        Student[] new_stu_arr = new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            new_stu_arr[i] = arr[i];
        }
        new_stu_arr[new_stu_arr.length-1] = add_stu;

        return new_stu_arr;
    }

    public static void showStudent(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println('\t'+arr[i].getId()+", "+arr[i].getName()+", "+arr[i].getAge());
        }
    }

    public static Student[] delete_Student(Student[] arr, String delet_id) {
        Student[] new_stu_arr = new Student[arr.length - 1];
        int index = 0;
        for (Student stu : arr) {
            if (stu != null && !stu.getId().equals(delet_id)) {
                new_stu_arr[index++] = stu;
            }
        }
        return new_stu_arr;
    }

    public static int getIndex(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}

package Demo33;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo32 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        loop : while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出");
            System.out.println("请输入您的选择： ");
            
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1 : {addStudent(list);
                            break;}
                case 2 : {deleteStudent(list);
                            break;}
                case 3 : {updateStudent(list);
                            break;}
                case 4 : {searchStudent(list);
                            break;}   
                case 5 : {System.out.println("退出成功");
                            break loop;}
                default : System.out.println("没有这个选项");
            }
        }
        
    }

    public static void addStudent(ArrayList<Student> list){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入ID:");
        String id = scanner.nextLine();

        System.out.println("请输入姓名:");
        String name = scanner.nextLine();

        System.out.println("请输入年龄:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("请输入地址:");
        String address = scanner.nextLine();

        Student student = new Student(id,name,age,address);
        //唯一性判断
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(student.getId())) {
                System.out.println("该ID已经存在,添加失败");
                flag = true;
                break;
            }
        }
        if (!flag) {
            list.add(student);
        }

    }


    public static void deleteStudent(ArrayList<Student> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生的ID");
        String id = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                flag = true;
                list.remove(i);
                System.out.println("删除成功");
            }
        }
        if (!flag) {
            System.out.println("ID不存在,删除失败");
        }
        
    }


    public static void updateStudent(ArrayList<Student> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生的ID");
        String id = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                flag = true;

                System.out.println("输入修改后的姓名");
                list.get(i).setName(scanner.nextLine());
                System.out.println("输入修改后的年龄");
                list.get(i).setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.println("输入修改后的地址");
                list.get(i).setAddress(scanner.nextLine());
                
                System.out.println("修改成功");
            }
        }
        if (!flag) {
            System.out.println("ID不存在,修改失败");
        }
    }


    public static void searchStudent(ArrayList<Student> list){
        if (list.size() == 0) {
            System.out.println("当前无学生信息,请添加后再查询");
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("ID:"+stu.getId()+" name:"+stu.getName()+" age:"+stu.getAge()+" address:"+stu.getAddress());
        }
    }


    


}

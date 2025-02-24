package Demo33;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo33 {
    public static void main(String[] args) {
        ArrayList<User> userlist = new ArrayList<>();
        ArrayList<Student> list = new ArrayList<>();
        //添加一个默认的后台系统管理员
        User admin = new User("admin", "admin", "111111111111111111", "11111111111");
        userlist.add(admin);

        page1:while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("请选择操作: 1.登录  2.注册   3.忘记密码");
            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    if(log_in(userlist)) {
                        System.out.println("登录成功");
                        break page1;
                    } else {
                        break;
                    }
                case "2":
                    sign_up(userlist);
                    break;
                case "3":
                    forget_Password(userlist);
                    break;
                default:
                    System.out.println("选项不存在,重新输入");
                    break;
            }
        }

        //上一个demo的代码：未升级的系统
        page2 : while (true) {
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
                            break page2;}
                default : System.out.println("没有这个选项");
            }
        }
        
    }
    //注册的相关函数
    public static boolean sign_up(ArrayList<User> userlist) {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password1 = "";
        String password2 = "";
        String idnumber = "";
        String phonenumber = "";
        //验证用户名是否符合要求
        boolean flag = false;
        while (!flag) {
            System.out.println("请输入注册用户名：");
            username = scanner.nextLine();
            flag = check_Username(userlist, username);
        }
        
        //设置密码
        flag = false;
        while (!flag) {
            System.out.println("请设置密码：");
            password1 = scanner.nextLine();
            System.out.println("重复密码：");
            password2 = scanner.nextLine();
            flag = password1.equals(password2);
            if(!flag)
                System.out.println("两次密码输入不一致,重新设置");
        }

        //验证身份证号码
        flag = false;
        while (!flag) {
            System.out.println("请输入用户身份证：");
            idnumber = scanner.nextLine();
            flag = check_Idnumber(idnumber);
        }
        
        //验证手机号
        flag = false;
        while (!flag) {
            System.out.println("请输入手机号：");
            phonenumber = scanner.nextLine();
            flag = check_Phonenumber(phonenumber);
        }

        User user = new User(username, password1, idnumber, phonenumber);
        userlist.add(user);
        System.out.println("注册成功");
        return true;
    }

    public static boolean check_Username(ArrayList<User> userlist, String username) {
        if (username.length()<3 || username.length()>15) {
            System.out.println("用户名长度必须在3~15之间");
            return false;
        } else {
            //长度满足,验证是否纯数字
            int count_num = 0;
            for (int i = 0; i < username.length(); i++) {
                if (username.charAt(i)>='0'&&username.charAt(i)<='9') {
                    count_num++;
                }
            }
            if (count_num==username.length()) {
                System.out.println("用户名为字母加数字,不能为纯数字");
                return false;
            }
        }
        //判断唯一
        for (int i = 0; i < userlist.size(); i++) {
            if (userlist.get(i).getUsername().equals(username)) {
                System.out.println("用户名已被使用,请重新取一个名字");
                return false;
            }
        }
        return true;
    }

    public static boolean check_Idnumber(String idnumber) {
        if (idnumber.length()!=18) {
            System.out.println("长度少于18位,不是有效的身份证号码");
            return false;
        }
        if (idnumber.charAt(0) == '0') {
            System.out.println("身份证号码不能以0开头,不是有效的身份证号码");
            return false;
        }

        for (int i = 0; i < idnumber.length() -1; i++) {
            if (idnumber.charAt(i)<'0' || idnumber.charAt(i)>'9') {
                System.out.println("前17位必须都是数字,不是有效的身份证号码");
                return false;
            }
        }
        if (idnumber.charAt(17)>='0'&& idnumber.charAt(17)<='9'){}
        else if (idnumber.charAt(17)=='x'|| idnumber.charAt(17)=='X') {}
        else {
            System.out.println("最后一位要是数字或x,不是有效的身份证号码");
            return false;
        }

        return true;
    }
    
    public static boolean check_Phonenumber(String phonenumber) {
        if (phonenumber.length()!=11) {
            System.out.println("长度少于18位,不是有效的手机号");
            return false;
        }
        if (phonenumber.charAt(0) == '0') {
            System.out.println("手机号不能以0开头,不是有效的手机号");
            return false;
        }
        for (int i = 0; i < phonenumber.length(); i++) {
            if (phonenumber.charAt(i)<'0' || phonenumber.charAt(i)>'9') {
                System.out.println("必须都是数字,不是有效的手机号");
                return false;
            }
        }
        return true;
    }
   
    //登录的相关函数
    public static boolean log_in(ArrayList<User> userlist) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < userlist.size(); i++) {
            if (userlist.get(i).getUsername().equals(username)) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("用户名未注册,请先注册");
            return false;
        }

        flag = false;
        String password = new String(); 
        int i = 0;
        detect3times:for (i = 0; i < 3; i++) {
            while (true) {
                System.out.println("请输入密码");
                password = scanner.nextLine();
                if (verify_detectNum())
                    break;
            }
            for (int j = 0; j < userlist.size(); j++) {
                if (userlist.get(j).getUsername().equals(username)) {
                    if (userlist.get(j).getPassword().equals(password)) {
                        flag =true;
                        break detect3times;
                    }
                }
            }
            if (!flag) {
                System.out.println("账号或密码有误,您还有 "+(2-i)+" 次机会");
            }
        }
        if (i==3) {
            System.out.println("您的账户已被锁定");
            return false;
        }
        return true;
    }
    
    public static String create_detectNum() {
        String str = new String();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            str = str + random.nextInt(10);
        }
        return str;
    }
    
    public static boolean verify_detectNum() {
        Scanner scanner = new Scanner(System.in);
        String detectnum = create_detectNum();
        System.out.println("验证码为："+detectnum);
        System.out.println("请输入验证码");
        String detectString = scanner.nextLine();

        if (!detectString.equalsIgnoreCase(detectnum)) {
            System.out.println("验证码输入有误,重新输入");
            return false;
        }
        return true;
    }

    //忘记密码的相关函数
    public static boolean forget_Password(ArrayList<User> userlist) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.nextLine();

        boolean flag = false;
        for (int i = 0; i < userlist.size(); i++) {
            if (userlist.get(i).getUsername().equals(username)) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("用户名未注册,请先注册");
            return false;
        }

        System.out.println("请输入身份证");
        String idnumber = scanner.nextLine();
        System.out.println("请输入手机号");
        String phonenumber = scanner.nextLine();

        int i = 0;
        for (i = 0; i < userlist.size(); i++) {
            if (userlist.get(i).getIdnumber().equals(idnumber) && userlist.get(i).getPhonenumber().equals(phonenumber)) {
                System.out.println("请输入新密码");
                String new_password = scanner.nextLine();
                userlist.get(i).setPassword(new_password);
                System.out.println("修改成功");
                return true;
            }
        }
        if (i == userlist.size()) {
            System.out.println("账号信息不匹配,修改密码失败");
            return false;
        }

        return true;
    }


    //上一个demo的代码：未升级的系统
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

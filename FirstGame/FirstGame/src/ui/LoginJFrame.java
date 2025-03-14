package ui;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import User.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginJFrame extends JFrame implements ActionListener{
    String usernamepath = "FirstGame\\image\\login\\用户名.png";
    String passwordpath = "FirstGame\\image\\login\\密码.png";
    String verifypath = "FirstGame\\image\\login\\验证码.png";
    String backgroundpath = "FirstGame\\image\\login\\background.png";
    String login1path = "FirstGame\\image\\login\\登录按钮.png";
    String login2path = "FirstGame\\image\\login\\登录按下.png";
    String register1path = "FirstGame\\image\\login\\注册按钮.png";
    String register2path = "FirstGame\\image\\login\\注册按下.png";

    static ArrayList<User> userlist = new ArrayList<>();

    String rightcode = new String();
    JTextField username = new JTextField();
    JTextField password = new JTextField();
    JTextField verifycode = new JTextField();
    JButton loginJButton = new JButton(new ImageIcon(login1path));
    JButton registerJButton = new JButton(new ImageIcon(register1path));

    public LoginJFrame() {
        User user1 = new User("zhangsan", "12345");
        User user2 = new User("lisi", "12345");
        userlist.add(user1);
        userlist.add(user2);

        initJFrame();

        initView();
    
        //监听
        loginJButton.addActionListener(this);
        registerJButton.addActionListener(this);

        this.setVisible(true);
    }

    private void initJFrame(){
        this.setSize(488,430);
        this.setTitle("拼图小游戏 登录界面");   //Title
        this.setAlwaysOnTop(true);  //界面置顶
        this.setLocationRelativeTo(null);       //界面居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //关闭方式
    }

    private void initView(){
        this.getContentPane().removeAll();

        //用户名提示
        JLabel usernameImage = new JLabel(new ImageIcon(usernamepath));
        usernameImage.setBounds(115, 140, 47, 14);
        this.getContentPane().add(usernameImage);
        //密码提示
        JLabel passwordImage = new JLabel(new ImageIcon(passwordpath));
        passwordImage.setBounds(125, 200, 32, 16);
        this.getContentPane().add(passwordImage);
        //验证码提示
        JLabel verifyImage = new JLabel(new ImageIcon(verifypath));
        verifyImage.setBounds(115, 256, 50, 30);
        this.getContentPane().add(verifyImage);
       //验证码参考
        JLabel verifycodejJLabel = new JLabel();
        verifycodejJLabel.setBounds(300, 256, 50, 30);
        generatecode();
        verifycodejJLabel.setText(rightcode);
        this.getContentPane().add(verifycodejJLabel);

        //用户名
        // JTextField username = new JTextField();
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //密码
        // JTextField password = new JTextField();
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);
        //验证码
        // JTextField verifycode = new JTextField();
        verifycode.setBounds(195, 256, 100, 30);
        this.getContentPane().add(verifycode);

        //登录按钮
        // JButton loginJButton = new JButton();
        loginJButton.setBounds(123, 310, 128, 47);
        loginJButton.setBorderPainted(false);//去除边框
        loginJButton.setContentAreaFilled(false);//去除背景
        this.getContentPane().add(loginJButton);
        //注册按钮
        //JButton registerJButton = new JButton(new ImageIcon(register1path));
        registerJButton.setBounds(256, 310, 128, 47);
        registerJButton.setBorderPainted(false);//去除边框
        registerJButton.setContentAreaFilled(false);//去除背景
        this.getContentPane().add(registerJButton);

        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon(backgroundpath));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        this.getContentPane().repaint();
    }
    
    private void generatecode(){
        char[] arr = {
            '0','1','2','3','4','5','6','7','8','9',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
        };
        String str = "";
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            str = str + arr[random.nextInt(arr.length)];
        }
        rightcode = str;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if (object == loginJButton) {
            System.out.println("登录按钮被按下");
            //验证 验证码
            if (!checkcode(verifycode.getText())) {
                showJDialog("验证码错误，请重试");
                generatecode();
                initView();
                return;
            }
            //验证 用户名和密码
            if (!checkuser(username.getText(), password.getText())) {
                showJDialog("账号或密码错误，请重试");
                initView();
                return;
            }
            System.out.println("登录成功");
            this.setVisible(false);
            new GameJFrame();
        } else if (object == registerJButton) {
            System.out.println("注册按钮被按下");
            
        }
    }
    
    private boolean checkcode(String str){
        if (str.equalsIgnoreCase(rightcode))
            return true;
        return false;
    }
    
    private boolean checkuser(String username, String password){
        for (int i = 0; i < userlist.size(); i++) {
            if (username.equals(userlist.get(i).getUsername()) && 
                    password.equals(userlist.get(i).getPassword()) ) {
                return true;
            }
        }
        return false;
    }
    
    private void showJDialog(String str){
        JDialog jDialog = new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning = new JLabel(str);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);
    }

    
}

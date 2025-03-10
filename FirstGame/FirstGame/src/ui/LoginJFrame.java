package ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class LoginJFrame extends JFrame{
    public LoginJFrame() {
        this.setSize(488,430);
        this.setTitle("拼图小游戏 登录界面");   //Title
        this.setAlwaysOnTop(true);  //界面置顶
        this.setLocationRelativeTo(null);       //界面居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //关闭方式



        this.setVisible(true);
    }

}

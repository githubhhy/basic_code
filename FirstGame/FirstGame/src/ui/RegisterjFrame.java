package ui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class RegisterjFrame extends JFrame{
    public RegisterjFrame() {
        this.setSize(488,500);
        this.setTitle("拼图小游戏 注册界面");   //Title
        this.setAlwaysOnTop(true);  //界面置顶
        this.setLocationRelativeTo(null);       //界面居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //关闭方式
        
        
        this.setVisible(true);
    }
}

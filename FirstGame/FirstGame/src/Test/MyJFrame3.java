package Test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyJFrame3 extends JFrame implements KeyListener{
    
    
    public MyJFrame3(){
        this.setSize(603, 680); // 宽高
        this.setTitle("拼图小游戏 v1.0"); // Title
        this.setAlwaysOnTop(true); // 界面置顶
        this.setLocationRelativeTo(null); // 界面居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭方式
        this.setLayout(null); // 取消窗体默认布局，不放在中间

        this.addKeyListener(this);


        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("按键按下");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("按键释放");
        int a = e.getKeyCode();
        System.out.println(a);
    }
}

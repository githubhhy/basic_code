package Test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyJFrame2 extends JFrame implements MouseListener{

    JButton jbt = new JButton("鼠标监听事务");

    public MyJFrame2(){
        this.setSize(603, 680); // 宽高
        this.setTitle("拼图小游戏 v1.0"); // Title
        this.setAlwaysOnTop(true); // 界面置顶
        this.setLocationRelativeTo(null); // 界面居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭方式
        this.setLayout(null); // 取消窗体默认布局，不放在中间

        jbt.setBounds(0, 0, 100, 50);
        jbt.addMouseListener(this);

        this.getContentPane().add(jbt);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("释放");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
    
}

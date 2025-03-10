package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603, 680); // 宽高
        jFrame.setTitle("Test1 演示"); // Title
        jFrame.setAlwaysOnTop(true); // 界面置顶
        jFrame.setLocationRelativeTo(null); // 界面居中
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭方式
        jFrame.setLayout(null); // 取消窗体默认布局，不放在中间

        JButton jbt = new JButton("Button1");
        jbt.setBounds(0, 0, 100, 50);
        
        //通过匿名抽象类的方式
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了（匿名类实现）");
            }
        });

        jFrame.getContentPane().add(jbt);

        jFrame.setVisible(true);
    }
}

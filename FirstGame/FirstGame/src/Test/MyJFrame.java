package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyJFrame extends JFrame implements ActionListener {

    JButton jbt1 = new JButton("按钮1");
    JButton jbt2 = new JButton("按钮2");

    public MyJFrame() {
        this.setSize(603, 680); // 宽高
        this.setTitle("拼图小游戏 v1.0"); // Title
        this.setAlwaysOnTop(true); // 界面置顶
        this.setLocationRelativeTo(null); // 界面居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭方式
        this.setLayout(null); // 取消窗体默认布局，不放在中间

        //使用继承类并实现接口的方式
        jbt1.setBounds(0, 0, 100, 50);
        jbt1.addActionListener(this);

        jbt2.setBounds(100, 0, 100, 50);
        jbt2.addActionListener(this);

        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取当前被操作的按钮对象
        Object source = e.getSource();

        // 对当前按钮进行判断
        if (source == jbt1) {
            jbt1.setSize(50, 50);
        } else if (source == jbt2) {
            Random random = new Random();
            jbt2.setLocation(random.nextInt(500), random.nextInt(500));
        }

    }

}

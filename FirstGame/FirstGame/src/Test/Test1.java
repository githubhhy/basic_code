package Test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Test1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603, 680); // 宽高
        jFrame.setTitle("Test1 演示"); // Title
        jFrame.setAlwaysOnTop(true); // 界面置顶
        jFrame.setLocationRelativeTo(null); // 界面居中
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭方式
        jFrame.setLayout(null); // 取消窗体默认布局，不放在中间

        //设置按钮，添加监听事务
        //通过类实现接口的方式
        JButton jbt = new JButton("Button1");
        jbt.setBounds(0, 0, 100, 50);
        jbt.addActionListener(new MyActionListener());

        jFrame.getContentPane().add(jbt);

        jFrame.setVisible(true);

    }

    


    
}

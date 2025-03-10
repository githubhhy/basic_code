package ui;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

public class GameJFrame extends JFrame {
    int[][] num = new int[4][4];

    // 表示游戏主界面，跟游戏相关逻辑在此处
    public GameJFrame() {
        // 初始化界面
        initJFrame();
        // 初始化菜单
        initJMenuBar();
        // 初始化图片
        initImage();

        this.setVisible(true); // 界面可视
    }

    private void initJFrame() {
        this.setSize(603, 680); // 宽高
        this.setTitle("拼图小游戏 v1.0"); // Title
        this.setAlwaysOnTop(true); // 界面置顶
        this.setLocationRelativeTo(null); // 界面居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭方式
        this.setLayout(null); // 取消窗体默认布局，不放在中间
    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");

        JMenuItem replaygameItem = new JMenuItem("重新游戏");
        JMenuItem reloginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem gzhItem = new JMenuItem("公众号");

        functionJmenu.add(replaygameItem);
        functionJmenu.add(reloginItem);
        functionJmenu.add(closeItem);
        aboutJmenu.add(gzhItem);

        jMenuBar.add(functionJmenu);
        jMenuBar.add(aboutJmenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initImage() {
        int[] temp_arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        Random random = new Random();
        // 打乱
        for (int i = 0; i < temp_arr.length; i++) {
            int j = random.nextInt(temp_arr.length);
            int temp = temp_arr[i];
            temp_arr[i] = temp_arr[j];
            temp_arr[j] = temp;
        }
        // 给二维数组
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = temp_arr[i * 4 + j];
            }
        }
        // 打印
        // for (int i = 0; i < num.length; i++) {
        // for (int j = 0; j < num[0].length; j++) {
        // System.out.printf("%d, " ,num[i][j]);
        // }
        // System.out.println();
        // }


        // 放置
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建JLable对象（即管理容器）
                JLabel jLabel = new JLabel(
                        new ImageIcon("FirstGame\\FirstGame\\image\\animal\\animal3\\" + num[i][j] + ".jpg"));// 创建ImageIcon对象

                // 指定位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(1));
                // 把管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }

        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon("FirstGame\\FirstGame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
    }

}

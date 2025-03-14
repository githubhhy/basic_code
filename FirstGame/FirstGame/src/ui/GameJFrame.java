package ui;

import java.util.Random;

import javax.management.JMRuntimeException;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameJFrame extends JFrame implements KeyListener,ActionListener {
    int[][] num = new int[4][4];
    int x;
    int y;
    int step = 0;

    String path = "FirstGame\\image\\animal\\animal3\\";
    String winpath = "FirstGame\\image\\win.png";
    String backgroundpath = "FirstGame\\image\\background.png";
    String gzhpath = "FirstGame\\image\\about.png";

    JMenuItem replaygameItem = new JMenuItem("重新游戏");
    JMenuItem reloginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem gzhItem = new JMenuItem("公众号");
    JMenuItem meinv = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    // 表示游戏主界面，跟游戏相关逻辑在此处
    public GameJFrame() {
        // 初始化界面
        initJFrame();
        // 初始化菜单
        initJMenuBar();
        // 初始化位置
        initArray();
        // 初始化图片
        initImage();

        // 添加按键监听
        this.addKeyListener(this);
        
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

        // JMenuItem replaygameItem = new JMenuItem("重新游戏");
        // JMenuItem reloginItem = new JMenuItem("重新登录");
        // JMenuItem closeItem = new JMenuItem("关闭游戏");
        // JMenuItem gzhItem = new JMenuItem("公众号");

        JMenu changeImage = new JMenu("更换图片");


        replaygameItem.addActionListener(this);
        reloginItem.addActionListener(this);
        closeItem.addActionListener(this);
        gzhItem.addActionListener(this);
        meinv.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);


        changeImage.add(meinv);
        changeImage.add(animal);
        changeImage.add(sport);
        functionJmenu.add(changeImage);

        functionJmenu.add(replaygameItem);
        functionJmenu.add(reloginItem);
        functionJmenu.add(closeItem);
        aboutJmenu.add(gzhItem);

        jMenuBar.add(functionJmenu);
        jMenuBar.add(aboutJmenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initArray() {
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
                if (num[i][j] == 0) {
                    x = i;
                    y = j;
                }
            }
        }
    }

    private void initImage() {
        this.getContentPane().removeAll();

        //胜利，显示祝贺图
        if (cheakWin()) {
            JLabel win = new JLabel(new ImageIcon(winpath));
            win.setBounds(203, 283, 197, 73);
            this.getContentPane().add(win);
        }

        JLabel setpJLabel = new JLabel("步数："+ step);
        setpJLabel.setBounds(50, 30, 100, 20);
        this.getContentPane().add(setpJLabel);


        // 放置
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建JLable对象（即管理容器）
                JLabel jLabel = new JLabel(
                        new ImageIcon(path + num[i][j] + ".jpg"));// 创建ImageIcon对象

                // 指定位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // 给图片添加边框
                jLabel.setBorder(new BevelBorder(1));
                // 把管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }

        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon(backgroundpath));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        this.getContentPane().repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int a = e.getKeyCode();
        if (a == 65) {
            System.out.println("a:查看原图");
            this.getContentPane().removeAll();
            JLabel allimage = new JLabel(new ImageIcon(path + "all.jpg"));
            allimage.setBounds(83, 134, 420, 420);
            this.getContentPane().add(allimage);
        }
        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon(backgroundpath));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        this.getContentPane().repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (cheakWin()) {
            return;
        }
        
        int i = e.getKeyCode();
        switch (i) {
            case 37:
                System.out.println("左");
                // 空白块和右边的块交换
                if (y == 3)
                    return;
                num[x][y] = num[x][y + 1];
                num[x][y + 1] = 0;
                y = y + 1;
                step++;
                break;
            case 38:
                System.out.println("上");
                // 空白块和下边的块交换
                if (x == 3)
                    return;
                num[x][y] = num[x + 1][y];
                num[x + 1][y] = 0;
                x = x + 1;
                step++;
                break;
            case 39:
                System.out.println("右");
                // 空白块和左边的块交换
                if (y == 0)
                    return;
                num[x][y] = num[x][y - 1];
                num[x][y - 1] = 0;
                y = y - 1;
                step++;
                break;
            case 40:
                System.out.println("下");
                // 空白块和上边的块交换
                if (x == 0)
                    return;
                num[x][y] = num[x - 1][y];
                num[x - 1][y] = 0;
                x = x - 1;
                step++;
                break;
            case 65:
                System.out.println("a:取消查看");
                break;
            case 87:
                System.out.println("w:作弊");
                setWin();
                break;
            default:
                break;
        }
        initImage();
    }

    private boolean cheakWin() {
        int[][] temp = new int[][] {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 0 }
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if (num[i][j] != temp[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private void setWin() {
        num = new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 0 }
        };
        initImage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if (object == replaygameItem) {
            System.out.println("重新游戏");
            initArray();
            step = 0;
            initImage();
        } else if (object == reloginItem) {
            System.out.println("重新登录");
            //关闭现在界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        } else if (object == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);
        } else if (object == gzhItem) {
            System.out.println("公众号");
            JDialog jDialog = new JDialog();
            JLabel gzh = new JLabel(new ImageIcon(gzhpath));
            gzh.setBounds(0, 0, 258, 258);
            jDialog.getContentPane().add(gzh);
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭，下方界面无法操作
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (object == meinv) {
            System.out.println("更换图片:美女");
            Random random = new Random();
            path = "FirstGame\\image\\girl\\girl"+(random.nextInt(13)+1)+"\\";
            initArray();
            initImage();
        } else if (object == animal) {
            System.out.println("更换图片:动物");
            Random random = new Random();
            path = "FirstGame\\image\\animal\\animal"+(random.nextInt(8)+1)+"\\";
            initArray();
            initImage();
        } else if (object == sport) {
            System.out.println("更换图片:运动");
            Random random = new Random();
            path = "FirstGame\\image\\sport\\sport"+(random.nextInt(10)+1)+"\\";
            initArray();
            initImage();
        }

    }
}

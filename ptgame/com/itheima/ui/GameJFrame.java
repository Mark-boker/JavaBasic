package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //主界面
    //上下左右代码
    //统计步数
    //一键通关.....
    //构造方法，开启界面创造对象就可以了，固定大小
    int[][] newArr = new int[4][4];
    int x = 0;
    int y = 0;
    String path = "C:\\Users\\Boker\\IdeaProjects\\ptgame\\image\\";
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}};
    //定义变量统计步数
    int step = 0;
    //创建选项条目
    JMenuItem replay = new JMenuItem("重新游戏");
    JMenuItem reLogin = new JMenuItem("重新登录");
    JMenuItem close = new JMenuItem("关闭游戏");
    JMenuItem rePicture = new JMenuItem("更换图片");

    JMenuItem account = new JMenuItem("公众号");

    public GameJFrame() {
        //this创建该对象后获取的地址
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMuneBar();

        //初始化数据（打乱）
        initData();

        //初始化图片
        initImage();


        //显示，建议写在最后
        this.setVisible(true);
    }

    private void initData() {
        int[] arrTemp = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Random r = new Random();

        for (int i = 0; i < arrTemp.length; i++) {
            int num = r.nextInt(arrTemp.length);
            int temp = arrTemp[i];
            arrTemp[i] = arrTemp[num];
            arrTemp[num] = temp;
        }

        for (int i = 0; i < arrTemp.length; i++) {
            if (arrTemp[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            newArr[i / 4][i % 4] = arrTemp[i];
        }

    }

    private void initImage() {
        //清空
        this.getContentPane().removeAll();
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon(path + "\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }
        JLabel stepCount = new JLabel("步数" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个图片对象
                //创建一个Jlabel的对象（管理容器）
                JLabel jLabel1 = new JLabel(new ImageIcon(path + "animal\\animal3\\" + newArr[i][j] + ".jpg"));
                //指定图片位置
                jLabel1.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //把管理容器添加到界面中
                jLabel1.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jLabel1);
            }
        }
        //添加背景
        JLabel background = new JLabel(new ImageIcon(path + "background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
        this.getContentPane().repaint();
    }


    private void initJMuneBar() {
        //创建整个菜单
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单的选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于");

        //将每一个选项的条目加到选项中
        functionJMenu.add(replay);
        functionJMenu.add(reLogin);
        functionJMenu.add(close);
        functionJMenu.add(rePicture);

        aboutJMenu.add(account);
        replay.addActionListener(this);
        close.addActionListener(this);
        reLogin.addActionListener(this);
        account.addActionListener(this);
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //宽高
        this.setSize(603, 680);

        this.setTitle("拼图单机版");
        //界面置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //设置关闭,3关闭模式，是接口常员变量
        this.setDefaultCloseOperation(3);
        //取消默认居中,才会按照xy添加组件
        this.setLayout(null);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "animal\\animal3\\all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //添加背景
            JLabel background = new JLabel(new ImageIcon(path + "background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            //结束方法
            return;
        }
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                return;
            }
            newArr[x][y] = newArr[x][y + 1];
            newArr[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                return;
            }
            newArr[x][y] = newArr[x + 1][y];
            newArr[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            newArr[x][y] = newArr[x][y - 1];
            newArr[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }
            newArr[x][y] = newArr[x - 1][y];
            newArr[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {//a键预览图
            initImage();
        } else if (code == 87) {//w键直接赢
            newArr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    //判断胜利
    public boolean victory() {
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                if (newArr[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replay) {
            step = 0;
            initData();
            initImage();

        } else if (obj == reLogin) {
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == close) {

        } else if (obj == account) {
            //弹框
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon(path + "about.png"));
            jLabel.setBounds(0, 0, 258, 258);
            //把图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);
            //弹框大小
            jDialog.setSize(344, 344);
            //弹框置顶
            jDialog.setAlwaysOnTop(true);
            //弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭无法操作
            jDialog.setModal(true);

            jDialog.setVisible(true);

        }
    }
}


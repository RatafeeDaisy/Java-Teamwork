package com.six.mainwindow;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    //创建构造方法构建窗体对象
    public MainWindow(String title) throws HeadlessException {
        super(title);
        init();
    }
    //窗体初始化
    public void init(){
        //设置窗口大小
        setSize(500,500);
        //设置窗口关闭按钮动作
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //创建画板对象
        JPanel helloJPanel = new JPanel();
        //创建按钮对象
        JButton okJButton = new JButton("确定");
        JButton defaultJButton = new JButton("取消");
        //将按钮添加到画板
        helloJPanel.add(okJButton);
        helloJPanel.add(defaultJButton);
        //将画板添加到窗体上
        setContentPane(helloJPanel);
        //设置窗口显示
        setVisible(true);
    }
}

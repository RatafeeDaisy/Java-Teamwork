package com.six.helloworld;

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        //创建窗口对象
        JFrame helloJFrame = new JFrame("芭娜娜");
        //设置窗口大小
        helloJFrame.setSize(500,500);
        //设置窗口关闭按钮动作
        helloJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //创建画板对象
        JPanel helloJPanel = new JPanel();
        //创建按钮对象
        JButton okJButton = new JButton("确定");
        JButton defaultJButton = new JButton("取消");
        //将按钮添加到画板
        helloJPanel.add(okJButton);
        helloJPanel.add(defaultJButton);
        //将画板添加到窗体上
        helloJFrame.setContentPane(helloJPanel);
        //设置窗口显示
        helloJFrame.setVisible(true);
    }
}
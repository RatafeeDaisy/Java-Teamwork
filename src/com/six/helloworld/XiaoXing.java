package com.six.helloworld;

import javax.swing.*;
import java.awt.*;

public class XiaoXing extends JFrame {
    public XiaoXing(String title) throws HeadlessException {
        super(title);
    }
    public void init(){
        //创建一个窗口对象
        JFrame helloJFrame = new JFrame("世界你好");
        //设置窗口大小
        setSize(500,500);
        //设置窗口关闭按钮动作
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //创建画板对象
        JPanel xiaoxingJPanel = new JPanel();
        JLabel myWordsLabel = new JLabel("It is a small world");
        xiaoxingJPanel.add(myWordsLabel);
        //将画板添加到窗体上
        setContentPane(xiaoxingJPanel);
        //设置窗口显示
        setVisible(true);
    }
}

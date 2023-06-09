package com.six.helloworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ricky extends JFrame {
    public Ricky(String title) throws HeadlessException{
        super(title);
        init();
    }
    public void init(){
        //设置窗口大小
        setSize(300,280);
        //设置窗口关闭按钮动作
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //创建画板对象
        JPanel RickyJPanel = new JPanel();
        //标签控件
        JLabel myWordsLabel = new JLabel("It is a small world");
        //标签控件放画板上
        RickyJPanel.add(myWordsLabel);
        //输入框
        JTextField inputWords = new JTextField(15);
        RickyJPanel.add(inputWords);
        //按钮
        JButton showButton = new JButton("show");
        RickyJPanel.add(showButton);
        //监听
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myWordsLabel.setText(inputWords.getText());
            }
        });
        //将画板添加到窗体上
        setContentPane(RickyJPanel);
        //设置窗口显示
        setVisible(true);
    }
}

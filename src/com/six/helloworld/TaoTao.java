package com.six.helloworld;


import javax.swing.*;
import java.awt.*;
public class TaoTao extends JFrame {
    public TaoTao(String title) throws HeadlessException {
        super(title);
        init();
    }
    public void init(){
        //设置窗体的大小
        setSize(500,500);
        //设置窗口关闭按钮动作
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //创建画板对象
        JPanel taotaoJPanel = new JPanel();
        JLabel myWordsLabel = new JLabel("It is a small world");
        taotaoJPanel.add(myWordsLabel);
        //创建输入控件
        JTextField inputwordsTextField = new JTextField(15);
        //输入放在画板
        taotaoJPanel.add(inputwordsTextField);
        JButton showButton = new JButton("show");
        taotaoJPanel.add(showButton);

        setContentPane(taotaoJPanel);
        //设置窗口显示
        setVisible(true);
    }
}

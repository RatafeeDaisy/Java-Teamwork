/*
 * Created by JFormDesigner on Fri Mar 17 09:19:21 CST 2023
 */

package com.six.mainwindow;

import com.six.subwindow.lcr.LcrForm;
import com.six.subwindow.ricky.RickyForm;
import com.six.subwindow.taotao.TaoForm;
import com.six.subwindow.xiaoxing.XiaoForm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author s303student
 */
public class MainForm extends JFrame {
    public MainForm() {
        initComponents();
    }

    private void Xiaoxing(ActionEvent e) {
        // TODO add your code here
        XiaoForm xiaoForm = new XiaoForm();
    }

    private void Tao(ActionEvent e) {
        // TODO add your code here
        TaoForm taoForm = new TaoForm();
    }

    private void Ricky(ActionEvent e) {
        // TODO add your code here
        RickyForm rickyForm = new RickyForm();
    }

    private void Lcr(ActionEvent e) {
        // TODO add your code here
        LcrForm lcrForm = new LcrForm();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        XiaoxingButton = new JButton();
        TaoButton = new JButton();
        RickyButton = new JButton();
        LcrButton = new JButton();

        //======== this ========
        setTitle("Bananice");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- XiaoxingButton ----
        XiaoxingButton.setText("Xiaoxing");
        XiaoxingButton.addActionListener(e -> Xiaoxing(e));
        contentPane.add(XiaoxingButton);
        XiaoxingButton.setBounds(55, 25, 110, 40);

        //---- TaoButton ----
        TaoButton.setText("TaoTao");
        TaoButton.addActionListener(e -> Tao(e));
        contentPane.add(TaoButton);
        TaoButton.setBounds(55, 75, 110, 40);

        //---- RickyButton ----
        RickyButton.setText("Ricky");
        RickyButton.addActionListener(e -> Ricky(e));
        contentPane.add(RickyButton);
        RickyButton.setBounds(55, 125, 110, 40);

        //---- LcrButton ----
        LcrButton.setText("LCR");
        LcrButton.addActionListener(e -> Lcr(e));
        contentPane.add(LcrButton);
        LcrButton.setBounds(55, 175, 110, 40);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(235, 295);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton XiaoxingButton;
    private JButton TaoButton;
    private JButton RickyButton;
    private JButton LcrButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

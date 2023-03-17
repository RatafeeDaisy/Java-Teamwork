/*
 * Created by JFormDesigner on Fri Mar 17 09:16:40 CST 2023
 */

package com.six.subwindow.ricky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author s303student
 */
public class RickyForm extends JFrame {
    public RickyForm() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        label1.setText(textField1.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setTitle("Ricky");
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8d8a\u5feb\u8d8a\u5f3a");
        contentPane.add(label1);
        label1.setBounds(20, 20, 205, 30);
        contentPane.add(textField1);
        textField1.setBounds(20, 60, 315, 35);

        //---- button1 ----
        button1.setText("\u663e\u793a");
        button1.addActionListener(e -> button1(e));
        contentPane.add(button1);
        button1.setBounds(260, 115, 93, 45);

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
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

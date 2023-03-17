/*
 * Created by JFormDesigner on Fri Mar 17 09:02:43 CST 2023
 */

package com.six.subwindow.xiaoxing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author s303student
 */
public class XiaoForm extends JFrame {
    public XiaoForm() {
        initComponents();
    }

    private void show(ActionEvent e) {
        // TODO add your code here
        myWorld.setText(inputMyworld.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        myWorld = new JLabel();
        inputMyworld = new JTextField();
        showButton = new JButton();

        //======== this ========
        setTitle("XiaoXing");
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- myWorld ----
        myWorld.setText("It is a small world");
        contentPane.add(myWorld);
        myWorld.setBounds(125, 70, 245, 35);
        contentPane.add(inputMyworld);
        inputMyworld.setBounds(120, 110, 260, 45);

        //---- showButton ----
        showButton.setText("\u663e\u793a");
        showButton.addActionListener(e -> show(e));
        contentPane.add(showButton);
        showButton.setBounds(270, 170, 110, 30);

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
        setSize(445, 295);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel myWorld;
    private JTextField inputMyworld;
    private JButton showButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

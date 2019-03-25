package view;

import javax.swing.*;
import java.awt.*;

public class MyLayout extends GroupLayout {

    public MyLayout(Container host) {
        super(host);
    }

    public void setHorizontalGroup(JTextField jTextField, JScrollPane jScrollPane, JButton jButton, JScrollPane jScrollPane2) {
        super.setHorizontalGroup(
                super.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, super.createSequentialGroup()
                                .addGroup(super.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                        .addComponent(jScrollPane))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(super.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)))
        );
    }

    public void setVerticalGroup(JTextField jTextField, JScrollPane jScrollPane, JButton jButton, JScrollPane jScrollPane2) {
        super.setVerticalGroup(
                super.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, super.createSequentialGroup()
                                .addGroup(super.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(jScrollPane))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(super.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField)
                                        .addComponent(jButton, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))));
    }
}

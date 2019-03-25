package model.jModels;

import model.Initialization;

import javax.swing.*;

public class MyJTextArea implements Initialization {

    @Override
    public JTextArea init(){
        JTextArea jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        jTextArea.setLineWrap(false);
        jTextArea.setFocusable(false);
        jTextArea.setColumns(20);
        jTextArea.setRows(5);

        return jTextArea;
    }
}

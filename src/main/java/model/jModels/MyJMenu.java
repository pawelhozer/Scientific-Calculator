package model.jModels;

import model.Initialization;

import javax.swing.*;

public class MyJMenu implements Initialization {

    @Override
    public JMenu init(){
        JMenu jMenu = new JMenu();
        jMenu.setText("File");

        return jMenu;
    }
}

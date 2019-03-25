package model.jModels;

import model.Initialization;

import javax.swing.*;

public class MyJButton implements Initialization {

    @Override
    public JButton init(){
        JButton jButton = new JButton();
        jButton.setText("Evaluate");

        return jButton;
    }
}

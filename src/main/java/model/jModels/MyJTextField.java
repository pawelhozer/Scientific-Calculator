package model.jModels;

import model.Initialization;

import javax.swing.*;
import java.awt.*;

public class MyJTextField implements Initialization {

    @Override
    public JTextField init(){
        JTextField jTextField = new JTextField();
        jTextField.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        return jTextField;
    }
}

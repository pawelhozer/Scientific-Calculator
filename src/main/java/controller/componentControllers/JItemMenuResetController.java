package controller.componentControllers;

import controller.Controller;

import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.event.*;

public class JItemMenuResetController implements Controller {

    private JMenuItem jMenuItem;
    private JTextArea jTextArea;
    private JTextField jTextField;

    public JItemMenuResetController(JMenuItem jMenuItem, JTextField jTextField, JTextArea jTextArea){
        this.jMenuItem = jMenuItem;
        this.jTextArea = jTextArea;
        this.jTextField = jTextField;
    }

    @Override
    public void addListeners(){
        jMenuItem.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent evt) {
                resetButtonMouseReleased(evt);
            }

            private void resetButtonMouseReleased(MouseEvent evt) {
                    jTextArea.setText("");
                    jTextField.setText(null);
            }
        });
    }
}

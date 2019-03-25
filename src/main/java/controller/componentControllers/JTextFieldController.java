package controller.componentControllers;

import controller.Controller;
import controller.Parser;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JTextFieldController implements Controller {

    private JTextField jTextField;
    private Parser parser;

    public JTextFieldController(JTextField jTextField, JTextArea jTextArea, Parser parser) {
        this.jTextField = jTextField;
        this.parser = parser;
    }

    @Override
    public void addListeners(){
        jTextField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                jTextFieldKeyReleased(evt);
            }

            private void jTextFieldKeyReleased(KeyEvent evt) {
                if(evt.getKeyCode() == KeyEvent.VK_ENTER)
                    parser.evaluate();
                if(evt.getKeyCode() == KeyEvent.VK_UP){
                    parser.getLastCommand();
                }
            }
        });
    }
}

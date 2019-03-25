package controller.componentControllers;

import controller.Controller;
import controller.Parser;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JButtonController implements Controller {

    private JButton jButton;
    private Parser parser;

    public JButtonController(JButton jButton, Parser parser) {
        this.jButton = jButton;
        this.parser = parser;
    }

    @Override
    public void addListeners(){
        jButton.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent evt) {
                jButtonMouseReleased(evt);
            }

            private void jButtonMouseReleased(MouseEvent evt) {
                parser.evaluate();
            }
        });
    }
}

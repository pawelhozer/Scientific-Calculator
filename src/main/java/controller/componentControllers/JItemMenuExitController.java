package controller.componentControllers;

import controller.Controller;

import javax.swing.*;
import java.awt.event.*;

public class JItemMenuExitController implements Controller {

    private JMenuItem jMenuItem;

    public JItemMenuExitController(JMenuItem jMenuItem) {
        this.jMenuItem = jMenuItem;
    }

    @Override
    public void addListeners(){
        jMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }

            private void resetButtonActionPerformed(ActionEvent evt) {
                    System.exit(0);
            }
        });

    }
}

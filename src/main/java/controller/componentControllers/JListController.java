package controller.componentControllers;


import controller.Controller;
import controller.Parser;
import model.MathematicalCharacters;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class JListController implements Controller {

    private JList<MathematicalCharacters> jList;
    private JTextField jTextField;
    private Parser parser;

    public JListController(JList<MathematicalCharacters> jList, JTextField jTextField, Parser parser) {
        this.jList = jList;
        this.jTextField = jTextField;
        this.parser = parser;
    }

    @Override
    public void addListeners(){
        jList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2){
                    String selectedSign = jList.getSelectedValue().getCode();
                    if(selectedSign.equals("")){
                        jTextField.setText(parser.getLastResult());
                    }
                    String tmp = jTextField.getText();
                    String tmp1 = tmp.substring(0,jTextField.getCaretPosition())+selectedSign + tmp.substring(jTextField.getCaretPosition());
                    jTextField.setText(tmp1);
                    if(selectedSign.contains(")")){
                        jTextField.setCaretPosition(tmp1.lastIndexOf('(')+1);
                        jTextField.requestFocus();
                    }
                }
            }
        });
    }
}


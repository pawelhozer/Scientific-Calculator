package controller;

import javax.swing.*;

public class Parser {

    private JTextField jTextField;
    private JTextArea jTextArea;
    private String lastCommand;
    private String lastResult;

    public Parser(JTextField jTextField, JTextArea jTextArea) {
        this.jTextField = jTextField;
        this.jTextArea = jTextArea;
    }

    public void evaluate(){
        String stringField = jTextField.getText();
        lastCommand = stringField;
        MessageFormat messageFormat = null;
        try {
            messageFormat = new MessageFormat(stringField);
            lastResult = Double.toString(messageFormat.getResult());
            jTextField.setText(null);
            messageFormat.printResult(jTextArea);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wpisane dane są niepoprawne!", "Błąd!", JOptionPane.ERROR_MESSAGE);
            jTextField.setText("");
            lastResult = "";
            lastCommand = "";
        }
    }

    public void getLastCommand() {
        jTextField.setText(lastCommand);
    }

    public String getLastResult() {
        return lastResult;
    }
}

package controller;


import javax.swing.JTextArea;
import org.mariuszgromada.math.mxparser.*;

class MessageFormat{
    private String message;
    private double result;
     
    MessageFormat(String message) throws Exception {
        this.message = message;
        Expression expression = new Expression(message);
        if(expression.checkLexSyntax()){
            this.result = expression.calculate();
            if(Double.isNaN(result)) throw new Exception();
        }else{
            String errorMessage = expression.getErrorMessage();
            throw new Exception(errorMessage);
        }
    }
    void printResult(JTextArea jTextArea){
        String currentText = jTextArea.getText();
        currentText += "\n"+ message + " = " + result;
        jTextArea.setText(currentText);
    }

    double getResult() {
        return result;
    }
}

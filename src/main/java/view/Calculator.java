package view;

import controller.*;
import controller.componentControllers.*;
import model.*;
import model.jModels.*;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Calculator extends JFrame {

    private JButton jButton;
    private JList<MathematicalCharacters> jList;
    private JMenu jMenu;
    private JMenuBar jMenuBar;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea;
    private JTextField jTextField;
    private JMenuItem resetButton;
    private JMenuItem exitButton;

    private JTextFieldController textFieldController;
    private JButtonController buttonController;
    private JItemMenuResetController resetController;
    private JItemMenuExitController exitController;
    private JListController listController;

    private MyLayout layout;
    private Parser parser;

    private Calculator(MyJTextArea myTextArea, MyJScrollPanel myScrollPanel, MyJScrollPanel myScrollPanel2, MyJList myJList, MyJTextField myTextField, MyJButton myButton, MyJMenu myMenu, MyJMenuItem myMenuItem, MyJMenuItem myMenuItem1, MyJMenuBar myMenuBar) throws HeadlessException {
        this.jTextArea = myTextArea.init();
        this.jList = myJList.init();
        this.jScrollPane1 = myScrollPanel.init(jTextArea);
        this.jScrollPane2 = myScrollPanel2.init(jList);
        this.jTextField = myTextField.init();
        this.jButton = myButton.init();
        this.jMenu = myMenu.init();
        this.resetButton = myMenuItem.init("Reset");
        this.exitButton = myMenuItem1.init("Exit");
        this.jMenuBar = myMenuBar.init(jMenu);

        this.layout = new MyLayout(getContentPane());
        this.parser = new Parser(jTextField,jTextArea);

        this.textFieldController = new JTextFieldController(jTextField,jTextArea, parser);
        this.buttonController = new JButtonController(jButton,parser);
        this.resetController = new JItemMenuResetController(resetButton,jTextField, jTextArea);
        this.exitController = new JItemMenuExitController(exitButton);
        this.listController = new JListController(jList,jTextField,parser);

        initComponents();
    }

    private void initComponents() {
        setOptions();
        setListeners();
        setLayout();
        pack();
    }

    private void setOptions(){
        jMenu.add(resetButton);
        jMenu.add(exitButton);
        setJMenuBar(jMenuBar);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void setListeners(){
        textFieldController.addListeners();
        buttonController.addListeners();
        resetController.addListeners();
        exitController.addListeners();
        listController.addListeners();
    }

    private void setLayout(){
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(jTextField,jScrollPane1, jButton,jScrollPane2);
        layout.setVerticalGroup(jTextField,jScrollPane1, jButton,jScrollPane2);
    }

    private static void setUIManager(){
        try {
            for (UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {

        setUIManager();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator(new MyJTextArea(),
                        new MyJScrollPanel(),
                        new MyJScrollPanel(),
                        new MyJList(),
                        new MyJTextField(),
                        new MyJButton(),
                        new MyJMenu(),
                        new MyJMenuItem(),
                        new MyJMenuItem(),
                        new MyJMenuBar() )
                        .setVisible(true);
            }
        });
    }
}

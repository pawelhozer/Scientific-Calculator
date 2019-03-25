package model.jModels;

import javax.swing.*;

public class MyJMenuBar {

    public JMenuBar init(JMenu jMenu){
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(jMenu);

        return jMenuBar;
    }
}

package model.jModels;

import javax.swing.*;

public class MyJMenuItem {

    public JMenuItem init(String string){
        JMenuItem jMenuItem = new JMenuItem();
        jMenuItem.setText(string);

        return jMenuItem;
    }
}

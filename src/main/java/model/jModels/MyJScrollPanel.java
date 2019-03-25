package model.jModels;

import javax.swing.*;
import java.awt.*;

public class MyJScrollPanel {


    public JScrollPane init(Component component){
        JScrollPane jScrollPane = new JScrollPane();

        jScrollPane.setViewportView(component);
        return  jScrollPane;
    }

}

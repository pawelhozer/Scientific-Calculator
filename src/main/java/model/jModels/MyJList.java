package model.jModels;

import bootstrap.BootstrapSigns;
import model.Initialization;
import model.MathematicalCharacters;

import javax.swing.*;


public class MyJList implements Initialization {

    @Override
    public JList<MathematicalCharacters> init() {
        BootstrapSigns bootstrapSigns = new BootstrapSigns();

        return new JList<>(bootstrapSigns.init());
    }
}
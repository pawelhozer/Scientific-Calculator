package bootstrap;

import model.MathematicalCharacters;

import javax.swing.*;

public class BootstrapSigns {

    public DefaultListModel<MathematicalCharacters> init(){
        MathematicalCharacters sin = new MathematicalCharacters("sinus","sin()");
        MathematicalCharacters cos = new MathematicalCharacters("cosinus","cos()");
        MathematicalCharacters tg = new MathematicalCharacters("tangens","tg()");
        MathematicalCharacters ctg = new MathematicalCharacters("cotanges","ctg()");
        MathematicalCharacters pi = new MathematicalCharacters("pi","pi");
        MathematicalCharacters e = new MathematicalCharacters("e","e");
        MathematicalCharacters plus = new MathematicalCharacters("plus","+");
        MathematicalCharacters minus = new MathematicalCharacters("minus","-");
        MathematicalCharacters multiplication = new MathematicalCharacters("mnożenie","*");
        MathematicalCharacters division = new MathematicalCharacters("dzielenie","/");
        MathematicalCharacters lastResult = new MathematicalCharacters("ostatni wynik","");

        DefaultListModel<MathematicalCharacters> listModel = new DefaultListModel<>();

        listModel.addElement(sin);
        listModel.addElement(cos);
        listModel.addElement(tg);
        listModel.addElement(ctg);
        listModel.addElement(pi);
        listModel.addElement(e);
        listModel.addElement(plus);
        listModel.addElement(minus);
        listModel.addElement(multiplication);
        listModel.addElement(division);
        listModel.addElement(lastResult);

        return listModel;
    }
}

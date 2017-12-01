/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc17F;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author kk892515
 */
public final class Controller extends JPanel {

    private final Model model;

    public Controller(Model model) {
        this.model = model;
        setBorder(BorderFactory.createLineBorder(Color.GREEN));
        setLayout(new GridLayout(6, 1));
        add(new ProgrammerPanel(model));
        add(new SizeXPanel(model));
        add(new SizeYPanel(model));
        add(new ColorPanel(model));
        add(new SolidPanel(model));
        add(new ViewPanel(model));
    }

}

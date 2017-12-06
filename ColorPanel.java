/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc17F;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;

/**
 *
 * @author kk892515
 */
public final class ColorPanel extends ControlPanel {

    private final JLabel jlColor = new JLabel("Set Color");
    private final JButton jbColor = new JButton("Change");

    public ColorPanel(Model model) {
        super(model);
        jbColor.addActionListener(ae -> changeColor());
        add(jlColor);
        add(jbColor);

    }

    private void changeColor() {
        model.setColor(JColorChooser.showDialog(
                this,
                "Choose new color",
                model.getColor()));

        model.getView().repaint();
    }

}

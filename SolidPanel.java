/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc17kkx;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Kexin
 */
public final class SolidPanel extends ControlPanel {

    JLabel jlSolid = new JLabel("Solid:");
    JRadioButton jrbYes = new JRadioButton("Yes");
    JRadioButton jrbNo = new JRadioButton("No");
    ButtonGroup bgSolid = new ButtonGroup();
    JPanel jpButtons = new JPanel();

    public SolidPanel(Model model) {
        super(model);
        if (model.isSolid()) {
            jrbYes.setSelected(true);
        } else {
            jrbNo.setSelected(true);
        }

        jrbYes.addActionListener(ae -> {
            model.setSolid(true);
            model.getView().repaint();
        }
        );

        jrbNo.addActionListener(ae -> {
            model.setSolid(false);
            model.getView().repaint();
        }
        );

        bgSolid.add(jrbYes);
        bgSolid.add(jrbNo);
        jpButtons.add(jrbYes);
        jpButtons.add(jrbNo);

        jpButtons.setBorder(BorderFactory.createLineBorder(Color. RED));

        add(jlSolid);
        add(jpButtons);
    }

}

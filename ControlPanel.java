/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc17F;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author kk892515
 */
public class ControlPanel extends JPanel{
    protected final Model model;

    public ControlPanel(Model model) {
        this.model = model;
        setBorder(BorderFactory.createEtchedBorder());
    }
    
    
}

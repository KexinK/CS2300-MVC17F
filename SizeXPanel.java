/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc17F;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kk892515
 */
public final class SizeXPanel extends ControlPanel {

    private final JLabel jlXSize = new JLabel("Set X Size : ");
    private final int TEXTFIELD_SIZE = 10; // adjust as needed or desired
    private final JTextField jtfXSize = new JTextField(TEXTFIELD_SIZE);

    public SizeXPanel(Model model) {
        super(model);
        jtfXSize.setText("" + model.getxSize());
        jtfXSize.addActionListener(ae -> updateXSize());
        add(jlXSize);
        add(jtfXSize);
    }

    void updateXSize() {
        String stringNewSize = jtfXSize.getText(); // get the string entered
        try {
            int newXSize = Integer.parseInt(stringNewSize); // parse to int
            model.setxSize(newXSize); // update model
            model.getView().repaint(); // draw again
        } catch (Exception e) { // deal with WTF
            jtfXSize.setText("BAD INPUT!"); // msg to jtf
            JOptionPane.showMessageDialog( // GUI msg
                    null,
                    "Invalid input. Not a number.", // error message
                    "CS 2300 Error Message:", // error title
                    JOptionPane.ERROR_MESSAGE); // error symbol
            jtfXSize.setText("" + model.getxSize()); // msg to jtf
        }
    }

}

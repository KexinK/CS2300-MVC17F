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
public final class SizeYPanel extends ControlPanel {

    private final JLabel jlYSize = new JLabel("Set Y Size : ");
    private final int TEXTFIELD_SIZE = 10; // adjust as needed or desired
    private final JTextField jtfYSize = new JTextField(TEXTFIELD_SIZE);

    public SizeYPanel(Model model) {
        super(model);
        jtfYSize.setText("" + model.getySize());
        jtfYSize.addActionListener(ae -> updateYSize());
        add(jlYSize);
        add(jtfYSize);
    }

    void updateYSize() {
        String stringNewSize = jtfYSize.getText(); // get the string entered
        try {
            int newYSize = Integer.parseInt(stringNewSize); // parse to int
            model.setySize(newYSize); // update model
            model.getView().repaint(); // draw again
        } catch (Exception e) { // deal with WTF
            jtfYSize.setText("BAD INPUT!"); // msg to jtf
            JOptionPane.showMessageDialog( // GUI msg
                    null,
                    "Invalid input. Not a number.", // error message
                    "CS 2300 Error Message:", // error title
                    JOptionPane.ERROR_MESSAGE); // error symbol
            jtfYSize.setText("" + model.getySize()); // msg to jtf
        }
    }
}

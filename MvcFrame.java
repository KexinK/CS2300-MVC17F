/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc17F;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author kk892515
 */
public final class MvcFrame extends JFrame {

    private final Model model;

    public MvcFrame(Model model) {
        this.model = model;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setTitle("MVC 17F");
        
        setLayout(new BorderLayout());
        add(model.getTitle(), BorderLayout.NORTH);
        add(model.getController(), BorderLayout.WEST);
        add(model.getView(), BorderLayout.CENTER);

        setVisible(true);

        System.out.println("MvcFrame c-tor");
    }

}

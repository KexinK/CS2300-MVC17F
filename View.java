/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc17F;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author kk892515
 */
public final class View extends JPanel {

    private final Model model;

    public View(Model model) {
        this.model = model;
        System.out.println("View c-tor");
        setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int xStart = xCenter - model.getxSize();
        int yStart = yCenter - model.getySize();
        int width = 2 * model.getxSize();
        int height = 2 * model.getySize();
        g.setColor(model.getColor()); 
        g.clearRect(0,0,getWidth(),getHeight());
        if (model.isSolid()) {
            g.fillOval(xStart, yStart, width, height);
        } else {
            g.drawOval(xStart, yStart, width, height);
        }
    }

}

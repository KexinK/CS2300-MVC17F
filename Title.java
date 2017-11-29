/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc17F;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author kk892515
 */
public class Title extends JPanel {

    public Title() {
        setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        Dimension dimension = new Dimension(144, 144);
        setPreferredSize(dimension);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        int halfWidthGuess = 180; // guess
        int xCenter = getWidth() / 2;
        int startTitleX = xCenter - halfWidthGuess;
        double magicFactor = 0.58; // guess
        int startTitleY = (int) (magicFactor * getHeight());
        Color titleFontColor = new Color(15, 15, 255);
        g.setColor(titleFontColor);
        Font font = new Font("Arial", Font.BOLD, 30);
        g.setFont(font);
        g.drawString("Model - View - Controller",
                startTitleX, startTitleY);
    }

}

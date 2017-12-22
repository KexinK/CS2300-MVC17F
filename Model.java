/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc17kkx;

import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author Kexin
 */
public class Model {

    private final Title title = new Title();
    private final Controller controller;
    private final View view;
    private final MvcFrame mvcFrame;

    private int xSize = 66;
    private int ySize = 44;
    private Color color = Color.BLUE;
    private boolean solid = true;

    public Model() {
        controller = new Controller(this);
        view = new View(this);
        mvcFrame = new MvcFrame(this);
        System.out.println("Model c-tor");
    }

    public Title getTitle() {
        return title;
    }

    public Controller getController() {
        return controller;
    }

    public View getView() {
        return view;
    }

    public MvcFrame getMvcFrame() {
        return mvcFrame;
    }

    public void setxSize(int xSize) {
        this.xSize = xSize;
    }

    public void setySize(int ySize) {
        this.ySize = ySize;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }

    public Color getColor() {
        return color;
    }

    public boolean isSolid() {
        return solid;
    }

    public static void main(String[] args) {
        System.out.println("MVC GUI Application");
        SwingUtilities.invokeLater(() -> {
            Model model = new Model();
        });
    }

}

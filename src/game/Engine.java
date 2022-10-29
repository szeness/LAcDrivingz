package game;
import gui.Gui;


import javax.swing.*;
import java.awt.*;

public class Engine {
 int x, y;
    public static boolean points = false;

    public static boolean explo(JLabel jayL) {

       // if (Gui.auto.getX() == jayL.getX()) {
        //if (Gui.weeDot.getY() == Gui.auto.getY()-110 && Gui.weeDot.getX() == Gui.auto.getX()+26) { jayL.setVisible(false); }
       // }

        int dx,dy;

        if (Gui.auto.getX() > jayL.getX()) {
            dx = (Gui.auto.getX()+26 - jayL.getX());
        } else dx = jayL.getX() - Gui.auto.getX();
        if (Gui.auto.getY() > jayL.getY()) {
            dy = (Gui.auto.getY() - jayL.getY());
        } else dy = jayL.getY() - Gui.auto.getY();

        if (dx <= 40 && dy <= 40) {

            return true;

        }



        return false;
    }

    public static Point ptc(int x, int y) {
        Point p = new Point(0, 0);
        p.x = x * 32 + Gui.xoff;
        p.y = y * 32 + Gui.yoff;

        return p;
    }

}

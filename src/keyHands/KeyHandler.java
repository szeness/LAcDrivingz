package keyHands;

import clocks.ClockWd;
import gui.Gui;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler extends JFrame implements KeyListener {

    public KeyHandler() {

}


    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                        Gui.auto.setLocation(Gui.auto.getX()-20,Gui.auto.getY());
                        if (Gui.auto.getX() < 410) Gui.auto.setIcon(Gui.autoLinksP);
                        else Gui.auto.setIcon(Gui.autoRechtsP);
                        break;
            case 'd':
                        Gui.auto.setLocation(Gui.auto.getX()+20,Gui.auto.getY());
                        if (Gui.auto.getX() < 410) Gui.auto.setIcon(Gui.autoLinksP);
                        else Gui.auto.setIcon(Gui.autoRechtsP);
                        break;
            case 'e':

                        Gui.weeDot.setLocation(490,350);
                        if (Gui.weeDot.isVisible()) Gui.weeDot.setVisible(false);
                        else Gui.weeDot.setVisible(true);
                        break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

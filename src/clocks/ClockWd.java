package clocks;

import game.Engine;
import gui.Gui;

public class ClockWd extends Thread {


    public void run() {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                int yDown = 0;
                int yZoom = 0;
                while (true) {
                    try {Thread.sleep(100);

                        yDown+=10;
                        yZoom+=3;
                        Gui.weeDot.setLocation(490, 350+yDown);
                        Gui.weeDot.setSize(8+yZoom,7+yZoom);
                        Engine.explo(Gui.weeDot);
                        if (Engine.explo(Gui.weeDot)) {
                            Gui.weeDot.setLocation(Gui.auto.getX()+50, Gui.auto.getY()+130);
                            Gui.weeDot.setSize(80,74);
                            break;
                        }

                        if (Gui.weeDot.getY()==600) {yZoom = 0;yDown=0;}

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        }; new Thread(r).start();
    }
}
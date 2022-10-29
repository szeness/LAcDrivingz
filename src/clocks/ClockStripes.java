package clocks;

import gui.Gui;

public class ClockStripes extends Thread {



    public void run() {

        Runnable r = new Runnable() {
            @Override
            public void run() {

                int yUp = 0;
                while (true) {
                    try {Thread.sleep(5);
                        yUp += 10;


                        Gui.stripeSmallerXX.setLocation(503, 353+(yUp/50 ));
                        Gui.stripeSmaller.setLocation(503,360+(yUp/10));
                        Gui.stripeSmall.setLocation(503,410+(yUp*3/10));
                        Gui.stripeBig.setLocation(503,460+yUp);
                        Gui.stripeBig2.setLocation(503,590+yUp);


                        if (Gui.stripeBig.getY() == 620) {Thread.sleep(20);yUp = 0;}




                        Thread.sleep(10);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };new Thread(r).start();


    }



}

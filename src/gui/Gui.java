package gui;

import keyHands.KeyHandler;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Gui extends JFrame {


    public static JLabel stripeSmall; static ImageIcon wpPic = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/road-g44177aa0f_12801024 Kopie.png")));
    public static ImageIcon stripeP = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/stripeBig.png")));
    public static ImageIcon stripeSmallP = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/stripeSmall.png")));
    public static ImageIcon autoRechtsP = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/autoRechts.png")));
    public static ImageIcon autoLinksP = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/autoLinks.png")));
    public static ImageIcon weeDotP = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/weedot.png")));

    public static JLabel stripeSmaller;
    public static JLabel stripeSmallerXX;
    public static JLabel wp;
    public static JLabel stripeBig;
    public static Gui framzz;
    public static JLabel stripeBig2;
    public static JLabel auto;
    public static JLabel weeDot;
    public static int yoff;
    public static int xoff;


    public void run() {

        framzz = new Gui();

        framzz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framzz.setSize(1024, 720);
        framzz.setLayout(null);
        framzz.addKeyListener(new keyHands.KeyHandler());
        framzz.setVisible(true);
        framzz.setLayout(null);
        framzz.getContentPane().setBackground(Color.BLACK);
        framzz.requestFocus();





        stripeBig2 = new JLabel();
        stripeBig2.setBounds(0, 0, 20, 51);
        stripeBig2.setLocation(503, 590);
        stripeBig2.setIcon(stripeP);
        stripeBig2.setBackground(Color.red);
        framzz.add(stripeBig2);
        stripeBig2.setVisible(true);


        stripeBig = new JLabel();
        stripeBig.setBounds(0, 0, 14, 47);
        stripeBig.setLocation(503, 460);
        stripeBig.setIcon(stripeP);
        stripeBig.setBackground(Color.red);
        framzz.add(stripeBig);
        stripeBig.setVisible(true);


        stripeSmall = new JLabel();
        stripeSmall.setBounds(0, 0, 8, 25);
        stripeSmall.setLocation(503, 410);
        stripeSmall.setIcon(stripeSmallP);
        stripeSmall.setBackground(Color.red);
        framzz.add(stripeSmall);
        stripeSmall.setVisible(true);
        stripeSmall.setOpaque(true);

        stripeSmaller = new JLabel();
        stripeSmaller.setBounds(0, 0, 5, 20);
        stripeSmaller.setLocation(503, 360);
        stripeSmaller.setIcon(stripeSmallP);
        stripeSmaller.setBackground(Color.red);
        framzz.add(stripeSmaller);
        stripeSmaller.setVisible(true);
        stripeSmaller.setOpaque(true);

        stripeSmallerXX = new JLabel();
        stripeSmallerXX.setBounds(0, 0, 2, 8);
        stripeSmallerXX.setLocation(503, 345);
        stripeSmallerXX.setIcon(stripeSmallP);
        stripeSmallerXX.setBackground(Color.red);
        framzz.add(stripeSmallerXX);
        stripeSmallerXX.setVisible(true);
        stripeSmallerXX.setOpaque(true);


        weeDot = new JLabel();
        weeDot.setBounds(0, 0, 8, 7);
        weeDot.setLocation(490,349);
        weeDot.setIcon(weeDotP);
        weeDot.setBackground(Color.red);
        framzz.add(weeDot);
        weeDot.setVisible(true);

        auto = new JLabel();
        auto.setBounds(0, 0, 221, 319);
        auto.setLocation(666, 350);
        auto.setIcon(autoRechtsP);
        auto.setBackground(Color.red);
        framzz.add(auto);
        auto.setVisible(true);



        wp = new JLabel();
        wp.setBounds(0, 0, 1024, 760);
        wp.setIcon(wpPic);
        wp.setBackground(Color.red);
        wp.setLocation(0,0);
        framzz.add(wp);
        wp.setVisible(true);
        Gui.wp.setVisible(true);
        Gui.wp.setVisible(false);
        Gui.wp.setVisible(true);





    }

}

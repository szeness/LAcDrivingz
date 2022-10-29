package game;
import clocks.ClockWd;
import clocks.ClockStripes;
import gui.Gui;

public class Main extends Gui{


    public static void main(String[] args) {

        new Gui().run();

        new ClockStripes().start();

        new ClockWd().start();

    }
}

package unidad2;


import java.awt.*;
import java.applet.Applet;

public class PrimeraLinea extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
    }

}

package unidad4;

import java.awt.*;

import java.applet.Applet;

/**
 *
 * Esta clase implementa hilos al dibujo de una casa.
 *
 *
 *
 * @author Martha Piña
 *
 * @version 3
 *
 */
public class CasitaHilos extends Applet implements Runnable {

    public int x = 100;

    Thread hilo;

    public void init() {

        hilo = new Thread(this);

        hilo.start();

        resize(700, 600); //Redimensionar tamaño applet.

    }

    public void paint(Graphics g) {

        g.setColor(Color.blue);

        g.setColor(Color.black);

        g.drawLine(100 + x, 200, 150 + x, 100);

        g.setColor(Color.red);

        g.drawLine(150 + x, 100, 200 + x, 200);

        g.setColor(Color.black);

        g.drawLine(150 + x, 100, 400 + x, 100);

        g.setColor(Color.green);

        g.drawLine(400 + x, 100, 400 + x, 200);

        g.setColor(Color.black);

        g.fillOval(250 + x, 200, 100, 100);

        g.setColor(Color.green);

        g.fillRect(120 + x, 300, 60, 100);

        g.setColor(Color.red);

        g.drawRect(200 + x, 200, 200, 200);

        g.setColor(Color.red);

        g.drawRect(100 + x, 200, 100, 200);

        x = x - 15;

    }

    /**
     * Método para ejecutar los eventos y transformaciones del applet, que
     * captura la excepción con un hilo de 1 segundo de movimiento.
     */
    @Override
    public void run() {

        while (true)//mientras sea verdad
        {

            repaint();

            try {

                hilo.sleep(1000);//hilo controlado con el tiempo de 1seg de movimiento de la applet

            } catch (InterruptedException e) {

            }

        }//fin del while

    }//fin del metodo run

}

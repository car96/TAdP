/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author carlos
 */
public class Edificio extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    //public void init() {
        // TODO start asynchronous download of heavy resources
    //}

    @Override
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawLine(50, 480, 420, 480);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.awt.*;
import java.applet.Applet;

/**
 *
 * @author carlos
 */
public class EdificioNoApplet extends Applet{
    @Override
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawLine(50, 480, 420, 480);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrellaventana;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Pepe
 */
public class Controlador implements WindowListener, MouseListener, KeyListener {

    private Vista vista;

    public Controlador() {
        vista = new Vista(this);
    }

    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {

    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Se ha minimizado la ventana");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Se ha restaurado la ventana");
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {     
    }

    @Override
    public void mousePressed(MouseEvent me) {     
    }

    @Override
    public void mouseReleased(MouseEvent me) {        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Dentro ratón");
        vista.ponerEstrellaAzul();
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Fuera ratón");
        vista.ponerEstrellaAmarilla();
    }

    @Override
    public void keyTyped(KeyEvent ke) { 
        System.out.println("Presionado "+ke.getKeyChar());
        char tecla= ke.getKeyChar();   
        vista.setLblMuestraTeclaPulsada(String.valueOf(tecla));
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       
    }

}

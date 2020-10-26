/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrellaventana;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Pepe
 */
public class Vista extends Frame {

    // private final JLabel ESTRELLA_AMARILLA = new ImageIcon(getClass().getResource("..//assets/... . png");
    private ImageIcon estrellaAmarilla = new ImageIcon(getClass().getResource("..//assets//estrella_amarilla.png"));
    private ImageIcon estrellaAzul = new ImageIcon(getClass().getResource("..//assets//estrella_azul.png"));
    private final JLabel ESTRELLA = new JLabel(estrellaAmarilla);
    //   private final JLabel ESTRELLA_AZUL = new JLabel(estrellaAzul);

    private Label lblMuestraTeclaPulsada;
    private Label lblMuestraCoordenadaX;
    private Label lblMuestraCoordenadaY;
    private TextField txtIndicaUbicacion;
    private int x = 0;
    private int y = 0;
    private Controlador controlador;
    private Panel pArriba;

    public Vista(Controlador controlador) {

        this.addWindowListener(controlador);    // Añado el escuchador a la ventana

        this.setBounds(500, 350, 300, 200);
        this.setLayout(new GridLayout(3, 0));

        pArriba = new Panel();
        pArriba.setLayout(new FlowLayout());
        this.add(pArriba);
        ponerEstrellaAmarilla();
        ESTRELLA.addMouseListener(controlador);  // El escuchador a la estrella Amarilla

        Panel pMedio = new Panel();
        pMedio.setLayout(new GridLayout(1, 2));
        this.add(pMedio);

        Panel pMedioIzda = new Panel();
        pMedioIzda.setLayout(new FlowLayout());
        pMedio.add(pMedioIzda);
        ponerLblMuestraTeclaPulsada(pMedioIzda);        // Añado Label letra

        Panel pMedioDcha = new Panel();
        pMedioDcha.setLayout(new GridLayout(2, 0));
        pMedio.add(pMedioDcha);

        ponerLblMuestraCoordenadaX(pMedioDcha);        // Añado Label coordenada X
        ponerLblMuestraCoordenadaY(pMedioDcha);        // Añado Label coordenada Y

        Panel pAbajo = new Panel();
        pArriba.setLayout(new FlowLayout());
        this.add(pAbajo);
        ponerTxtIndicaUbicacion(pAbajo);

        this.setVisible(true);
    }

    public void ponerEstrellaAmarilla() {
        pArriba.add(ESTRELLA);
        ESTRELLA.setIcon(estrellaAmarilla);

    }

    public void ponerEstrellaAzul() {
        ESTRELLA.setIcon(estrellaAzul);
    }

    public void ponerLblMuestraTeclaPulsada(Panel panel) {
        lblMuestraTeclaPulsada = new Label("L");
        this.lblMuestraTeclaPulsada.setFont(new Font("Arial", Font.BOLD, 30));
        panel.add(lblMuestraTeclaPulsada);
    }

    public void ponerLblMuestraCoordenadaX(Panel pMedioDcha) {
        lblMuestraCoordenadaX = new Label("X--> " + x);
        lblMuestraCoordenadaX.setFont(new Font("Arial", Font.BOLD, 15));
        pMedioDcha.add(lblMuestraCoordenadaX);
    }

    public void ponerLblMuestraCoordenadaY(Panel pMedioDcha) {
        lblMuestraCoordenadaY = new Label("Y--> " + y);
        lblMuestraCoordenadaY.setFont(new Font("Arial", Font.BOLD, 15));
        pMedioDcha.add(lblMuestraCoordenadaY);
    }

    public void ponerTxtIndicaUbicacion(Panel pAbajo) {
        txtIndicaUbicacion = new TextField(20);
        pAbajo.add(txtIndicaUbicacion);
    }

    public void setLblMuestraTeclaPulsada(String st) {
        lblMuestraTeclaPulsada.setText(st);
    }

    public void setX(int coordenadaX) {
        this.x = coordenadaX;
    }

    public void setY(int coordenadaY) {
        this.y = coordenadaY;
    }

    public void setTxtIndicaUbicacion(TextField txtIndicaUbicacion) {
        this.txtIndicaUbicacion = txtIndicaUbicacion;
    }

}

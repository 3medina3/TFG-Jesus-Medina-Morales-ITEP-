/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.awt.Image;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author 3medi
 */
public class Cliente implements Runnable {

    private int puerto;
    private String mensaje;
    private JFrame ventana;
    private JTextArea panel;
    private FileWriter fichero = null;
    private JLabel label;

    //Constructor principal
    public Cliente(int puerto, String mensaje, JFrame ventana, JTextArea panel,JLabel label) {
        this.puerto = puerto;
        this.mensaje = mensaje;
        this.ventana = ventana;
        this.panel = panel;
        this.label = label;
    }

    //extensión de hilo
    @Override
    public void run() {

        final String HOST = "localhost";
        //Puerto del servidor
        DataOutputStream out;

        try {
            //Creo el socket para conectarme con el cliente
            Socket servidor = new Socket(HOST, puerto);

            out = new DataOutputStream(servidor.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF(mensaje);

            servidor.close();

        } catch (ConnectException e) {

            //Si el usuario no esta conectado se guardan en un txt el archo 
                Utilidades.CargarDatos cargarDatos=new CargarDatos();
                cargarDatos.escribirArchivo(panel.getText());
                
                ImageIcon imagen = new ImageIcon(getClass().getResource("../Imagenes/icons8-desconectado-30.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
                label.setIcon(icono);
            

        } catch (UnknownHostException es) {
            JOptionPane.showMessageDialog(ventana, "No se ha encontrado al host.");
        } catch (SocketException pe) {
            JOptionPane.showMessageDialog(ventana, "El destinatario no esta conectado.");
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public FileWriter getFichero() {
        return fichero;
    }

    public void setFichero(FileWriter fichero) {
        this.fichero = fichero;
    }

}

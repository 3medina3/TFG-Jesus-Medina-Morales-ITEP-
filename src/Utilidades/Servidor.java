/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.awt.Image;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Observable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author 3medi
 */
public class Servidor extends Observable implements Runnable {

    private int puerto;
    private JFrame ventana;
    private JLabel label;

    //Constructor principal
    public Servidor(int puerto, JFrame ventana, JLabel label) {
        this.puerto = puerto;
        this.ventana = ventana;
        this.label = label;
    }

    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket cliente = null;
        DataInputStream in;

        try {
            //Arrancamos el servidor
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            //Buble infinito para aceptar a todos los usuarios
            while (true) {
                //Aceptamos a los clientes
                cliente = servidor.accept();
                System.out.println("Contacto");
                in = new DataInputStream(cliente.getInputStream());

                //Si el cliente está conectado 
                if (cliente.isConnected()) {
                    ImageIcon imagen = new ImageIcon(getClass().getResource("../Imagenes/icons8-conectado-30.png"));
                    Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
                    label.setIcon(icono);
                }
                //Leemos los mensajes
                String mensaje = in.readUTF();

                System.out.println("Mensaje enviado");
                System.out.println(mensaje);

                
                this.setChanged();
                //Notificamos al cliente 
                this.notifyObservers(mensaje);
                //Limpiamos
                this.clearChanged();

                //Cerramos al cliente 
                cliente.close();
            }
            //excepciones
        } catch (SocketException ex) {
            JOptionPane.showMessageDialog(ventana, "El destinatario ya no esta online");
           
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(ventana, "El servidor no ha arrancado correctamente");
        }

    }

}

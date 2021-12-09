/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Beans.Alumnos;
import Beans.Profesores;
import VentanasAdmin.VentanaVisualizarPersonas;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author 3medi
 */
public class CargarDatos {

    private DBCursor cursor;

    public void cargarAlumnoId(DBCursor busqueda, VentanaVisualizarPersonas ventana) {

        cursor = busqueda;

        try {
            //Bucle que recorre el cursor y manda la información a los campos
            while (cursor.hasNext()) {
                Alumnos alumno = new Alumnos((BasicDBObject) cursor.next(), 1);

                ventana.getNombre().setText(alumno.getNombreAlumno());
                ventana.getApellidos().setText(alumno.getApellidoAlumno());
                ventana.getEdad().setText(alumno.getEdadAlumno() + "");
                ventana.getCambio().setText(alumno.getCurso() + "");
                ventana.getTelefono().setText(alumno.getTelefonoAlumno() + "");
                ventana.getSexo().setText(alumno.getSexoAlumno());
                ventana.getjLabel_id().setText(alumno.getIdAlumno() + "");
                
            }

        } finally {
            cursor.close();
        }

    }

    public void cargarProfesoresId(DBCursor busqueda, VentanaVisualizarPersonas ventana) {

        cursor = busqueda;

        try {
            //Bucle que recorre el cursor y manda la información a los campos
            while (cursor.hasNext()) {
                Profesores profe = new Profesores((BasicDBObject) cursor.next(), 1);

                ventana.getNombre().setText(profe.getNombreProfesor());
                ventana.getApellidos().setText(profe.getApellidoProfesor());
                ventana.getEdad().setText(profe.getEdadProfesor() + "");
                ventana.getCambio().setText(profe.isAdmin() + "");
                ventana.getTelefono().setText(profe.getTelefonoProfesor() + "");
                ventana.getSexo().setText(profe.getSexoProfesor());
                ventana.getjLabel_id().setText(profe.getIdProfesor() + "");
                ventana.getContrasenia().setText(profe.getContraseniaProfesor());
            }

        } finally {
            cursor.close();
        }

    }

    public void leerTxt(JTextArea panelChat) {
        File archivo = new File("C:/Users/alex4/Documents/NetBeansProjects/TrabajoFinalGrado_AlejandroRamosDiaz/conversaciones.txt");
        try {

            //Guardamos el archivo que vamos a leer
            FileReader archivoLeer = new FileReader(archivo);
            
            //Creamos buffer
            BufferedReader bufferedReader = new BufferedReader(archivoLeer);
            String cadena = "", mensajes = "";

            //Mientras la cadena sea distinto de null 
            while (cadena != null) {
                //Lee el archivo 
                cadena = bufferedReader.readLine();
                if (cadena != null) {
                    //Lo guarda en la variable y la manda al panel de la ventana
                    mensajes = cadena;
                    panelChat.append(cadena + "\n");
                }

            }
            //Lo cerramos todo 

            bufferedReader.close();
            archivoLeer.close();

        } catch (IOException e) {
        }
    }

    public void escribirArchivo(String texto) {
        //Nos declaramos las variables 
        File archivo;
        FileWriter escribir;
        PrintWriter lineas;

        //guardamos el archivo en la variable 
        archivo = new File("C:/Users/alex4/Documents/NetBeansProjects/TrabajoFinalGrado_AlejandroRamosDiaz/conversaciones.txt");

        //Si no existe
        if (!archivo.exists()) {
            try {
                //Crea el archivo
                archivo.createNewFile();

                escribir = new FileWriter(archivo);
                //Distintas lineas
                lineas = new PrintWriter(escribir);

                //Lo lee
                lineas.println(texto);

                //Lo cerramos todo
                lineas.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(CargarDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }//Si existe
        else {
            try {

                escribir = new FileWriter(archivo);
                //Distintas lineas
                lineas = new PrintWriter(escribir);

                //Lo lee
                lineas.println(texto);

                //Lo cerramos todo
                lineas.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(CargarDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

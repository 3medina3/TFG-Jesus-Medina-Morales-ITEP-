/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Beans.Alumnos;
import Beans.Profesores;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author 3medi
 */
public class Inserts {

    public void insertAlumnos(DBCursor cursor, BusquedasMongo buscar, ArrayList<Alumnos> alumno, ConnectionMongoDB conexion, String nombre, Component rootPane, String apellido, int edad, String cambio, int telefono, String sexoU, String contrasenia, JRadioButton hombre) {
        int numDocumentos = 201;
        //Como en otras ocasiones damos valor a nuestros objetos
        buscar = new BusquedasMongo();
        cursor = buscar.buscarUsuarioCodigo(numDocumentos);
        //Si el cursor es igual a uno, significa que a encontrado a un usuario con esa id por lo que hara el bucle hasta qye encuentre a alguien que no tenga esa id
        while (cursor.size() == 1) {
            numDocumentos = numDocumentos + 1;
            cursor = buscar.buscarUsuarioCodigo(numDocumentos);
        }
        //añadimos los datos del alumno a nuestro array
        alumno.add(new Alumnos(numDocumentos, nombre, apellido, edad, cambio, telefono, sexoU, contrasenia));

        //Utilizamos un for each para insertar nuestro usuario en la collection
        for (Alumnos alum : alumno) {
            conexion.getColleccion().insert(alum.toDBObjectsAlumnos());
        }
        //Mensajes personalizados dependiendo de la opción que seleccione
        if (hombre.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Se inserto al alumno " + nombre + " satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Se inserto a la alumna " + nombre + " satisfactoriamente");
        }
    }

    public void insertProfesores(ConnectionMongoDB conexion, BusquedasMongo buscar, DBCursor cursor, ArrayList<Profesores> profe, String nombre, String apellido, int edad, JCheckBox admin, int telefono, String sexoU, String contrasenia, JRadioButton hombre, Component rootPane) {
        //Sacamos nuestra collección
        buscar = new BusquedasMongo();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Profesor");
        //Damos valor a nuestras variables y objetos
        int numDocumentos = 101;
        cursor = buscar.buscarProfesorId(numDocumentos);
        System.out.println(cursor.size());
        //si encuentra a alguien con esa id se le suma uno hasta que no encuentre a nadie
        while (cursor.size() == 1) {
            numDocumentos = numDocumentos + 1;
            cursor = buscar.buscarProfesorId(numDocumentos);
        }

        //Lo añadimos al array
        profe.add(new Profesores(numDocumentos, nombre, apellido, edad, admin.isSelected(), telefono, sexoU, contrasenia));

        for (Profesores pro : profe) {
            nuevaCollection.insert(pro.toDBObjectsProfe());
        }
        if (hombre.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Se inserto al profesor " + nombre + " satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Se inserto a la profesora " + nombre + " satisfactoriamente");
        }
    }
}

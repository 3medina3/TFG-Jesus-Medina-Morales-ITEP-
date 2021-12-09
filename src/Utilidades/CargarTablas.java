/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Beans.Alumnos;
import Beans.Asignaturas;
import Beans.FaltasAlumnos;
import Beans.FaltasProfesores;
import Beans.Profesores;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 3medi
 */
public class CargarTablas {

    private DefaultTableModel modeloTabla;
    private BusquedasMongo buscar;
    private DBCursor cursor;

    public void cargarTablaAlumnos(JTable table) {
        String[] titulo = {"_id", "Nombre", "Apellidos", "Edad", "Curso", "Telefono", "Sexo"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        buscar = new BusquedasMongo();
        cursor = buscar.buscarTodosUsuarios();

        try {
            while (cursor.hasNext()) {
                Alumnos alumno = new Alumnos((BasicDBObject) cursor.next(), 1);

                registro[0] = alumno.getIdAlumno() + "";
                registro[1] = alumno.getNombreAlumno();
                registro[2] = alumno.getApellidoAlumno();
                registro[3] = alumno.getEdadAlumno() + "";
                registro[4] = alumno.getCurso();
                registro[5] = alumno.getTelefonoAlumno() + "";
                registro[6] = alumno.getSexoAlumno();

                modeloTabla.addRow(registro);

            }
            table.setModel(modeloTabla);
            for (int i = 0; i < 7; i++) {
                table.getColumnModel().getColumn(i).setResizable(false);
            }
        } finally {
            cursor.close();
        }

    }

    public void cargarTablaAlumnosBusquedas(JTable table, DBCursor cursor) {
        String[] titulo = {"_id", "Nombre", "Apellidos", "Edad", "Curso", "Telefono", "Sexo"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        try {
            while (cursor.hasNext()) {
                Alumnos alumno = new Alumnos((BasicDBObject) cursor.next(), 1);

                registro[0] = alumno.getIdAlumno() + "";
                registro[1] = alumno.getNombreAlumno();
                registro[2] = alumno.getApellidoAlumno();
                registro[3] = alumno.getEdadAlumno() + "";
                registro[4] = alumno.getCurso();
                registro[5] = alumno.getTelefonoAlumno() + "";
                registro[6] = alumno.getSexoAlumno();
                

                modeloTabla.addRow(registro);

            }
            table.setModel(modeloTabla);
            for (int i = 0; i < 7; i++) {
                table.getColumnModel().getColumn(i).setResizable(false);
            }
        } finally {
            cursor.close();
        }

    }

    public void cargarTablaProfesores(Ventanas.VentanaAdmin ventanaAdmin) {
        String[] titulo = {"_id", "Nombre", "Apellidos", "Edad", "Admin", "Telefono", "Sexo"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        buscar = new BusquedasMongo();
        cursor = buscar.buscarTodosProfesores();

        try {
            while (cursor.hasNext()) {
                Profesores profe = new Profesores((BasicDBObject) cursor.next(), 1);

                registro[0] = profe.getIdProfesor() + "";
                registro[1] = profe.getNombreProfesor();
                registro[2] = profe.getApellidoProfesor();
                registro[3] = profe.getEdadProfesor() + "";
                registro[4] = profe.isAdmin() + "";
                registro[5] = profe.getTelefonoProfesor() + "";
                registro[6] = profe.getSexoProfesor();

                modeloTabla.addRow(registro);

            }
            ventanaAdmin.getTablaVisible().setModel(modeloTabla);
            for (int i = 0; i < 7; i++) {
                ventanaAdmin.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
            }
        } finally {
            cursor.close();
        }

    }

    public void cargarTablaAsignaturas(VentanasProfesor.VentanaNotas ventanaNotas, int codigo) {
        String[] titulo = {"_id", "Nombre", "Nota", "Fecha", "idAlumno", "Alumno", "Profesor"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        buscar = new BusquedasMongo();
        System.out.println(codigo);
        cursor = buscar.buscarTodasNotas(codigo);

        try {
            while (cursor.hasNext()) {
                Asignaturas asignatur = new Asignaturas((BasicDBObject) cursor.next(), 1);

                registro[0] = asignatur.getIdAsignaturas() + "";
                registro[1] = asignatur.getNombre();
                registro[2] = asignatur.getNotas() + "";
                registro[3] = asignatur.getFecha() + "";
                registro[4] = asignatur.getIdAlumno() + "";
                registro[5] = asignatur.getNombreAlum();
                registro[6] = asignatur.getNombrePro();

                modeloTabla.addRow(registro);

            }
            ventanaNotas.getTablaVisible().setModel(modeloTabla);

            for (int i = 0; i < 7; i++) {
                ventanaNotas.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
            }

        } finally {
            cursor.close();
        }
    }

    public void cargarTablaAsignaturasPorCodAlumno(VentanasAlumnos.VentanasAsignaturas ventanaNotas, int codigo) {
        String[] titulo = {"_id", "Nombre", "Nota", "Fecha", "Profesor"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        buscar = new BusquedasMongo();
        System.out.println(codigo);
        cursor = buscar.buscarTodasNotasCodAlumno(codigo);

        try {
            while (cursor.hasNext()) {
                Asignaturas asignatur = new Asignaturas((BasicDBObject) cursor.next(), 1);

                registro[0] = asignatur.getIdAsignaturas() + "";
                registro[1] = asignatur.getNombre();
                registro[2] = asignatur.getNotas() + "";
                registro[3] = asignatur.getFecha() + "";
                registro[4] = asignatur.getNombrePro();

                modeloTabla.addRow(registro);

            }
            ventanaNotas.getTablaVisible().setModel(modeloTabla);

            for (int i = 0; i < 4; i++) {
                ventanaNotas.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
            }

        } finally {
            cursor.close();
        }
    }

    public void cargarTablaAsignaturasPorNombre(VentanasAlumnos.VentanasAsignaturas ventanaNotas, DBCursor cursor) {
        String[] titulo = {"_id", "Nombre", "Nota", "Fecha", "Profesor"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        try {
            while (cursor.hasNext()) {
                Asignaturas asignatur = new Asignaturas((BasicDBObject) cursor.next(), 1);

                registro[0] = asignatur.getIdAsignaturas() + "";
                registro[1] = asignatur.getNombre();
                registro[2] = asignatur.getNotas() + "";
                registro[3] = asignatur.getFecha() + "";
                registro[4] = asignatur.getNombrePro();

                modeloTabla.addRow(registro);

            }
            ventanaNotas.getTablaVisible().setModel(modeloTabla);

            for (int i = 0; i < 4; i++) {
                ventanaNotas.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
            }

        } finally {
            cursor.close();
        }
    }

    public void cargarTablaAlumnoAsignaturas(DBCursor cursor, VentanasProfesor.VentanaNotas ventanaNotas) {
        String[] titulo = {"_id", "Nombre", "Nota", "Fecha", "idAlumno", "Alumno", "Profesor"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        try {
            while (cursor.hasNext()) {
                Asignaturas asignatur = new Asignaturas((BasicDBObject) cursor.next(), 1);

                registro[0] = asignatur.getIdAsignaturas() + "";
                registro[1] = asignatur.getNombre();
                registro[2] = asignatur.getNotas() + "";
                registro[3] = asignatur.getFecha() + "";
                registro[4] = asignatur.getIdAlumno() + "";
                registro[5] = asignatur.getNombreAlum();
                registro[6] = asignatur.getNombrePro();

                modeloTabla.addRow(registro);

            }
            ventanaNotas.getTablaVisible().setModel(modeloTabla);

            for (int i = 0; i < 4; i++) {
                ventanaNotas.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
            }

        } finally {
            cursor.close();
        }

    }

    public void cargarTablaFaltasAlumnos(VentanasProfesor.VentanaFaltasAlumnos ventanaAlumnos) {
        String[] titulo = {"_id", "Dia", "Justificada", "idAlumno", "NombreAlumno"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        buscar = new BusquedasMongo();
        cursor = buscar.buscarTodasFaltasAlumnos();

        try {
            while (cursor.hasNext()) {
                FaltasAlumnos faltasTabla = new FaltasAlumnos((BasicDBObject) cursor.next(), 1);

                registro[0] = faltasTabla.getIdFaltasAlumnos() + "";
                registro[1] = faltasTabla.getDia();
                registro[2] = faltasTabla.isJustificacion() + "";
                registro[3] = faltasTabla.getIdAlumno() + "";
                registro[4] = faltasTabla.getNombreAlumno();

                modeloTabla.addRow(registro);

            }
            ventanaAlumnos.getTablaVisible().setModel(modeloTabla);
            ventanaAlumnos.getTablaVisible().getColumnModel().getColumn(0).setPreferredWidth(1);
            ventanaAlumnos.getTablaVisible().getColumnModel().getColumn(3).setPreferredWidth(10);

            for (int i = 0; i < 4; i++) {
                ventanaAlumnos.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
            }

        } finally {
            cursor.close();
        }

    }

    public void cargarTablaFaltasAlumnos(VentanasAlumnos.VentanaRegistroFaltas ventanaAlumnos, int cod) {
        String[] titulo = {"_id", "Dia", "Justificada"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        buscar = new BusquedasMongo();
        cursor = buscar.buscarTodasFaltasIdAlumno(cod);

        try {
            while (cursor.hasNext()) {
                FaltasAlumnos faltasTabla = new FaltasAlumnos((BasicDBObject) cursor.next(), 1);

                registro[0] = faltasTabla.getIdFaltasAlumnos() + "";
                registro[1] = faltasTabla.getDia();
                registro[2] = faltasTabla.isJustificacion() + "";

                modeloTabla.addRow(registro);

            }
            ventanaAlumnos.getTablaVisible().setModel(modeloTabla);

            for (int i = 0; i < 3; i++) {
                ventanaAlumnos.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
            }

        } finally {
            cursor.close();
        }

    }

    public void cargarTablaFaltasAlumnos(VentanasAlumnos.VentanaRegistroFaltas ventanaAlumnos, int cod, DBCursor cursor) {
        String[] titulo = {"_id", "Dia", "Justificada"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        try {
            while (cursor.hasNext()) {
                FaltasAlumnos faltasTabla = new FaltasAlumnos((BasicDBObject) cursor.next(), 1);

                registro[0] = faltasTabla.getIdFaltasAlumnos() + "";
                registro[1] = faltasTabla.getDia();
                registro[2] = faltasTabla.isJustificacion() + "";

                modeloTabla.addRow(registro);

            }
            ventanaAlumnos.getTablaVisible().setModel(modeloTabla);

            for (int i = 0; i < 3; i++) {
                ventanaAlumnos.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
            }

        } finally {
            cursor.close();
        }

    }

    public void cargarTablaFaltasProfesores(VentanasProfesor.VentanaFaltasProfesor ventanaFaltasProfesor) {
        String[] titulo = {"_id", "Dia", "idProfe", "NombreProfe"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        buscar = new BusquedasMongo();
        cursor = buscar.buscarTodasFaltasProfesores();

        while (cursor.hasNext()) {
            FaltasProfesores faltasTabla = new FaltasProfesores((BasicDBObject) cursor.next(), 1);

            registro[0] = faltasTabla.getIdFaltasProfesores() + "";
            registro[1] = faltasTabla.getDia();

            registro[2] = faltasTabla.getIdProfesor() + "";
            registro[3] = faltasTabla.getNombreProfesor();

            modeloTabla.addRow(registro);

        }
        ventanaFaltasProfesor.getTablaVisible().setModel(modeloTabla);
        ventanaFaltasProfesor.getTablaVisible().getColumnModel().getColumn(0).setPreferredWidth(1);
        ventanaFaltasProfesor.getTablaVisible().getColumnModel().getColumn(1).setPreferredWidth(50);
        ventanaFaltasProfesor.getTablaVisible().getColumnModel().getColumn(2).setPreferredWidth(1);

        for (int i = 0; i < 3; i++) {
            ventanaFaltasProfesor.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
        }

        cursor.close();

    }

    public void cargarTablaAlumnosPorAsignatura(int codigo, VentanasProfesor.VentanaVisualizarAlumno ventanaAlumnoAsig, int codProfesor) {
        String[] titulo = {"Asignatura", "Nota", "Fecha", "Alumno", "Profesor"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        buscar = new BusquedasMongo();
        cursor = buscar.buscarTodasAsignaturasIdAlumnoProfesor(codigo, codProfesor);
        System.out.println(cursor.size());
        if (cursor.size() != 0) {
            try {
                while (cursor.hasNext()) {
                    Asignaturas asignaturas = new Asignaturas((BasicDBObject) cursor.next(), 1);

                    registro[0] = asignaturas.getNombre();
                    registro[1] = asignaturas.getNotas() + "";
                    registro[2] = asignaturas.getFecha() + "";
                    registro[3] = asignaturas.getNombreAlum();
                    registro[4] = asignaturas.getNombrePro();

                    modeloTabla.addRow(registro);

                }
                ventanaAlumnoAsig.getTablaVisible().setModel(modeloTabla);

                for (int i = 0; i < 5; i++) {
                    ventanaAlumnoAsig.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
                }
                ventanaAlumnoAsig.getGraficar().setEnabled(true);

            } finally {
                cursor.close();
            }
        } else {
            JOptionPane.showMessageDialog(ventanaAlumnoAsig, "Este alumno no tiene ninguna asignatura suya");
        }
    }

    public void cargarTablaAlumnosPorFaltas(int codigo, VentanasProfesor.VentanaVisualizarAlumno ventanaAlumnoAsig) {
        String[] titulo = {"Fecha", "Justificada"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        buscar = new BusquedasMongo();
        cursor = buscar.buscarTodasFaltasIdAlumno(codigo);
        System.out.println(cursor.size());

        if (cursor.size() != 0) {
            try {
                while (cursor.hasNext()) {
                    FaltasAlumnos faltasAlumnos = new FaltasAlumnos((BasicDBObject) cursor.next(), 1);

                    registro[0] = faltasAlumnos.getDia() + "";
                    registro[1] = faltasAlumnos.isJustificacion() + "";

                    modeloTabla.addRow(registro);

                }
                ventanaAlumnoAsig.getTablaVisible().setModel(modeloTabla);

                for (int i = 0; i < 2; i++) {
                    ventanaAlumnoAsig.getTablaVisible().getColumnModel().getColumn(i).setResizable(false);
                }

            } finally {
                cursor.close();
            }

        } else {
            JOptionPane.showMessageDialog(ventanaAlumnoAsig, "Este alumno no ha faltado ningún dia.");
        }
        ventanaAlumnoAsig.getGraficar().setEnabled(false);
    }

    public void cargarTablaFaltasProfesores(VentanasAlumnos.DiasFaltasProfesores veFaltasProfesores, DBCursor cursor) {
        String[] titulo = {"_id", "Dia", "IdProfesor", "Nombre"};
        String[] registro = new String[50];

        modeloTabla = new DefaultTableModel(null, titulo);

        try {
            while (cursor.hasNext()) {
                FaltasProfesores faltas = new FaltasProfesores((BasicDBObject) cursor.next(), 1);

                registro[0] = faltas.getIdFaltasProfesores() + "";
                registro[1] = faltas.getDia();
                registro[2] = faltas.getIdProfesor() + "";
                registro[3] = faltas.getNombreProfesor();

                modeloTabla.addRow(registro);

            }
            veFaltasProfesores.getTablaFaltasProfesores().setModel(modeloTabla);
            for (int i = 0; i < 4; i++) {
                veFaltasProfesores.getTablaFaltasProfesores().getColumnModel().getColumn(i).setResizable(false);
            }
        } finally {
            cursor.close();
        }

    }
}

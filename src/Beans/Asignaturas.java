package Beans;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBRef;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author 3medi
 */
public class Asignaturas {

    private int idAsignaturas;
    private String nombre;
    private int notas;
    private String fecha;
    private int idAlumno;
    private String nombreAlum;
    private int idProfesores;
    private String nombrePro;
    

    public Asignaturas() {
    }

    public Asignaturas(int notas, String nombre, String fecha, int idAlumno,String nombreAlum, int idProfesores,String nombrePro) {
        this.nombre = nombre;
        this.notas = notas;
        this.fecha = fecha;
        this.idAlumno = idAlumno;
        this.nombreAlum=nombreAlum;
        this.idProfesores = idProfesores;
        this.nombrePro=nombrePro;
    }

    public Asignaturas(int idAsignaturas, String nombre, int notas, String fecha, int idAlumno,String nombreAlum, int idProfesores,String nombrePro) {
        this.idAsignaturas = idAsignaturas;
        this.nombre = nombre;
        this.notas = notas;
        this.fecha = fecha;
        this.idAlumno = idAlumno;
        this.nombreAlum=nombreAlum;
        this.idProfesores = idProfesores;
        this.nombrePro=nombrePro;
    }

    public Asignaturas(BasicDBObject dbobjeto) {
        this.notas = (int)dbobjeto.get("notas");
        this.nombre = dbobjeto.getString("nombre");
        this.fecha = dbobjeto.getString("fecha");
        this.idAlumno = (int) dbobjeto.get("idAlumno");
        this.nombreAlum= dbobjeto.getString("nombreAlumno");
        this.idProfesores = (int) dbobjeto.get("idProfesor");
        this.nombrePro=dbobjeto.getString("nombreProfesor");
    }

    public Asignaturas(BasicDBObject dbobjeto, int i) {
        this.idAsignaturas = dbobjeto.getInt("_id");
        this.nombre = dbobjeto.getString("nombre");
        this.notas = (int)dbobjeto.getInt("notas");
        this.fecha = dbobjeto.getString("fecha");
        this.idAlumno = (int) dbobjeto.get("idAlumno");
        this.nombreAlum= dbobjeto.getString("nombreAlumno");
        this.idProfesores = (int) dbobjeto.get("idProfesor");
         this.nombrePro=dbobjeto.getString("nombreProfesor");
    }

    public BasicDBObject toDBObjectsCalificaciones() {
        BasicDBObject objeto = new BasicDBObject();
        objeto.append("_id", this.getIdAsignaturas());
        objeto.append("nombre", this.getNombre());
        objeto.append("notas", this.getNotas());
        objeto.append("fecha", this.getFecha());
        objeto.append("idAlumno", this.getIdAlumno());
        objeto.append("nombreAlumno", this.getNombreAlum());
        objeto.append("idProfesor", this.getIdProfesores());
        objeto.append("nombreProfesor", this.getNombrePro());

        return objeto;
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdAsignaturas() {
        return idAsignaturas;
    }

    public void setIdAsignaturas(int idAsignaturas) {
        this.idAsignaturas = idAsignaturas;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdProfesores() {
        return idProfesores;
    }

    public void setIdProfesores(int idProfesores) {
        this.idProfesores = idProfesores;
    }

}

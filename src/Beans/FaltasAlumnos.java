package Beans;

import com.mongodb.BasicDBObject;
import com.mongodb.DBRef;

/**
 *
 * @author 3medi
 */
public class FaltasAlumnos {

    private int idFaltasAlumnos;
    private String dia;
    private boolean justificacion;
    private int idAlumno;
    private String nombreAlumno;

    public FaltasAlumnos() {
    }

    public FaltasAlumnos(String dia, boolean justificacion, int idAlumno, String nombreAlumno) {
        this.dia = dia;
        this.justificacion = justificacion;
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
    }

    public FaltasAlumnos(int idFaltasAlumnos, String dia, boolean justificacion, int idAlumno, String nombreAlumno) {
        this.idFaltasAlumnos = idFaltasAlumnos;
        this.dia = dia;
        this.justificacion = justificacion;
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
    }
    

    public FaltasAlumnos(BasicDBObject dbobjeto) {
        this.dia = dbobjeto.getString("dia");
        this.justificacion = dbobjeto.getBoolean("justificada");
        this.idAlumno =  dbobjeto.getInt("idAlumno");
        this.nombreAlumno = dbobjeto.getString("nombre");

    }

    public FaltasAlumnos(BasicDBObject dbobjeto, int i) {
        this.idFaltasAlumnos = dbobjeto.getInt("_id");
        this.dia = dbobjeto.getString("dia");
        this.justificacion = dbobjeto.getBoolean("justificada");
        this.idAlumno =  dbobjeto.getInt("idAlumno");
        this.nombreAlumno = dbobjeto.getString("nombreAlumno");
    }
   

    public BasicDBObject toDBObjectsFaltasAlumnos() {
        BasicDBObject objeto = new BasicDBObject();
        objeto.append("_id", this.getIdFaltasAlumnos());
        objeto.append("dia", this.getDia());
        objeto.append("justificada", this.isJustificacion());
        objeto.append("idAlumno", this.getIdAlumno());
        objeto.append("nombreAlumno", this.getNombreAlumno());

        return objeto;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getIdFaltasAlumnos() {
        return idFaltasAlumnos;
    }

    public void setIdFaltasAlumnos(int idFaltasAlumnos) {
        this.idFaltasAlumnos = idFaltasAlumnos;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public boolean isJustificacion() {
        return justificacion;
    }

    public void setJustificacion(boolean justificacion) {
        this.justificacion = justificacion;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

   

}

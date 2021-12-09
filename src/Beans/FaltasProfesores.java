package Beans;

import com.mongodb.BasicDBObject;

/**
 *
 * @author 3medi
 */
public class FaltasProfesores {

    private int idFaltasProfesores;
    private String dia;
    private int idProfesor;
    private String nombreProfesor;

    public FaltasProfesores() {
    }

    public FaltasProfesores(String dia, int idProfesor) {
        this.dia = dia;
        this.idProfesor = idProfesor;
    }

    public FaltasProfesores(int idFaltasProfesores, String dia, int idProfesor, String nombreProfesor) {
        this.idFaltasProfesores = idFaltasProfesores;
        this.dia = dia;
        this.idProfesor = idProfesor;
        this.nombreProfesor = nombreProfesor;
    }

    public FaltasProfesores(BasicDBObject dbobjeto, int i) {
        this.idFaltasProfesores = dbobjeto.getInt("_id");
        this.dia = dbobjeto.getString("dia");
        this.idProfesor = (int) dbobjeto.get("idProfesor");
        this.nombreProfesor = dbobjeto.getString("nombreProfesor");

    }

    public FaltasProfesores(BasicDBObject dbobjeto) {
        this.dia = dbobjeto.getString("dia");
        this.idProfesor = (int) dbobjeto.get("idProfesor");
        this.nombreProfesor = dbobjeto.getString("nombreProfesor");
    }

    public BasicDBObject toDBObjectsFaltasProfesores() {
        BasicDBObject objeto = new BasicDBObject();
        objeto.append("_id", this.getIdFaltasProfesores());
        objeto.append("dia", this.getDia());
        objeto.append("idProfesor", this.getIdProfesor());
        objeto.append("nombreProfesor", this.getNombreProfesor());
        return objeto;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getIdFaltasProfesores() {
        return idFaltasProfesores;
    }

    public void setIdFaltasProfesores(int idFaltasProfesores) {
        this.idFaltasProfesores = idFaltasProfesores;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

}

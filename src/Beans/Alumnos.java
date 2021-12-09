package Beans;

import com.mongodb.BasicDBObject;

/**
 *
 * @author 3medi
 */
public class Alumnos {

    private int idAlumno;
    private String nombreAlumno;
    private String apellidoAlumno;
    private int edadAlumno;
    private String curso;
    private int telefonoAlumno;
    private String sexoAlumno;
    private String contraseniaAlumno;

    public Alumnos() {
    }

    public Alumnos(String nombreAlumno, String apellidoAlumno, int edadAlumno, String curso, int telefonoAlumno, String sexoAlumno, String contraseniaAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.edadAlumno = edadAlumno;
        this.curso = curso;
        this.telefonoAlumno = telefonoAlumno;
        this.sexoAlumno = sexoAlumno;
        this.contraseniaAlumno = contraseniaAlumno;
    }

    public Alumnos(int idAlumno, String nombreAlumno, String apellidoAlumno, int edadAlumno, String curso, int telefonoAlumno, String sexoAlumno, String contraseniaAlumno) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.edadAlumno = edadAlumno;
        this.curso = curso;
        this.telefonoAlumno = telefonoAlumno;
        this.sexoAlumno = sexoAlumno;
        this.contraseniaAlumno = contraseniaAlumno;
    }
    
    public Alumnos(BasicDBObject dbobjeto, int i) {

        this.idAlumno = dbobjeto.getInt("_id");
        this.nombreAlumno = dbobjeto.getString("nombre");
        this.apellidoAlumno = dbobjeto.getString("apellidos");
        this.edadAlumno = dbobjeto.getInt("edad");
        this.curso = dbobjeto.getString("curso");
        this.telefonoAlumno = dbobjeto.getInt("telefono");
        this.sexoAlumno = dbobjeto.getString("sexo");
        this.contraseniaAlumno = dbobjeto.getString("contrasenia");

    }
     public Alumnos(BasicDBObject dbobjeto) {

        this.nombreAlumno = dbobjeto.getString("nombre");
        this.apellidoAlumno = dbobjeto.getString("apellidos");
        this.edadAlumno = dbobjeto.getInt("edad");
        this.curso = dbobjeto.getString("curso");
        this.telefonoAlumno = dbobjeto.getInt("telefono");
        this.sexoAlumno = dbobjeto.getString("sexo");
        this.contraseniaAlumno = dbobjeto.getString("contrasenia");

    }
     
     //Un metodo que devuelve un objeto de tipo basicDBObjet que es para convertir los valores a basicDB
      public BasicDBObject toDBObjectsAlumnos(){
        BasicDBObject objeto=new BasicDBObject();
        objeto.append("_id", this.getIdAlumno());
        objeto.append("nombre", this.getNombreAlumno());
        objeto.append("apellidos", this.getApellidoAlumno());
        objeto.append("edad", this.getEdadAlumno());
        objeto.append("curso", this.getCurso());
        objeto.append("telefono", this.getTelefonoAlumno());
        objeto.append("sexo", this.getSexoAlumno());
        objeto.append("contrasenia", this.getContraseniaAlumno());
        return objeto;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public int getEdadAlumno() {
        return edadAlumno;
    }

    public void setEdadAlumno(int edadAlumno) {
        this.edadAlumno = edadAlumno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getTelefonoAlumno() {
        return telefonoAlumno;
    }

    public void setTelefonoAlumno(int telefonoAlumno) {
        this.telefonoAlumno = telefonoAlumno;
    }

    public String getSexoAlumno() {
        return sexoAlumno;
    }

    public void setSexoAlumno(String sexoAlumno) {
        this.sexoAlumno = sexoAlumno;
    }

    public String getContraseniaAlumno() {
        return contraseniaAlumno;
    }

    public void setContraseniaAlumno(String contraseniaAlumno) {
        this.contraseniaAlumno = contraseniaAlumno;
    }

      
}


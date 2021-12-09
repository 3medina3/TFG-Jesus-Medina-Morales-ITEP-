/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import com.mongodb.BasicDBObject;

/**
 *
 * @author 3medi
 */
public class Profesores {

    private int idProfesor;
    private String nombreProfesor;
    private String apellidoProfesor;
    private int edadProfesor;
    private boolean admin;
    private int telefonoProfesor;
    private String sexoProfesor;
    private String contraseniaProfesor;

    public Profesores() {
    }

    public Profesores(String nombreProfesor, String apellidoProfesor, int edadProfesor, boolean admin, int telefonoProfesor, String sexoProfesor, String contraseniaProfesor) {
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.edadProfesor = edadProfesor;
        this.admin = admin;
        this.telefonoProfesor = telefonoProfesor;
        this.sexoProfesor = sexoProfesor;
        this.contraseniaProfesor = contraseniaProfesor;
    }

    public Profesores(int idProfesor, String nombreProfesor, String apellidoProfesor, int edadProfesor,  boolean admin, int telefonoProfesor, String sexoProfesor, String contraseniaProfesor) {
        this.idProfesor = idProfesor;
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.edadProfesor = edadProfesor;
        this.admin = admin;
        this.telefonoProfesor = telefonoProfesor;
        this.sexoProfesor = sexoProfesor;
        this.contraseniaProfesor = contraseniaProfesor;
    }
    
    public Profesores(BasicDBObject dbobjeto, int i) {

        this.idProfesor = dbobjeto.getInt("_id");
        this.nombreProfesor = dbobjeto.getString("nombre");
        this.apellidoProfesor = dbobjeto.getString("apellidos");
        this.edadProfesor = dbobjeto.getInt("edad");
        this.admin = dbobjeto.getBoolean("admin");
        this.telefonoProfesor = dbobjeto.getInt("telefono");
        this.sexoProfesor = dbobjeto.getString("sexo");
        this.contraseniaProfesor = dbobjeto.getString("contrasenia");

    }
     public Profesores(BasicDBObject dbobjeto) {

        this.nombreProfesor = dbobjeto.getString("nombre");
        this.apellidoProfesor = dbobjeto.getString("apellidos");
        this.edadProfesor = dbobjeto.getInt("edad");
        this.admin = dbobjeto.getBoolean("admin");
        this.telefonoProfesor = dbobjeto.getInt("telefono");
        this.sexoProfesor = dbobjeto.getString("sexo");
        this.contraseniaProfesor = dbobjeto.getString("contrasenia");

    }
     
     //Un metodo que devuelve un objeto de tipo basicDBObjet que es para combertir los valores a basicDB
      public BasicDBObject toDBObjectsProfe(){
        BasicDBObject objeto=new BasicDBObject();
        objeto.append("_id", this.getIdProfesor());
        objeto.append("nombre", this.getNombreProfesor());
        objeto.append("apellidos", this.getApellidoProfesor());
        objeto.append("edad", this.getEdadProfesor());
        objeto.append("admin", this.isAdmin());
        objeto.append("telefono", this.getTelefonoProfesor());
        objeto.append("sexo", this.getSexoProfesor());
        objeto.append("contrasenia", this.getContraseniaProfesor());
        return objeto;
    }

      
      //Sección de gets and sets
    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public int getEdadProfesor() {
        return edadProfesor;
    }

    public void setEdadProfesor(int edadProfesor) {
        this.edadProfesor = edadProfesor;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    

    public int getTelefonoProfesor() {
        return telefonoProfesor;
    }

    public void setTelefonoProfesor(int telefonoProfesor) {
        this.telefonoProfesor = telefonoProfesor;
    }

    public String getSexoProfesor() {
        return sexoProfesor;
    }

    public void setSexoProfesor(String sexoProfesor) {
        this.sexoProfesor = sexoProfesor;
    }

    public String getContraseniaProfesor() {
        return contraseniaProfesor;
    }

    public void setContraseniaProfesor(String contraseniaProfesor) {
        this.contraseniaProfesor = contraseniaProfesor;
    }
      
      
}


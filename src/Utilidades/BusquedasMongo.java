/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 *
 * @author 3medi
 */
public class BusquedasMongo {

    private ConnectionMongoDB conexion = null;
    private DBCursor cursor = null;

    public BusquedasMongo() {
    }

   
    public DBCursor buscarTodosUsuarios() {
        conexion = new ConnectionMongoDB();
        DBObject query = new BasicDBObject("_id", 1);
        cursor = conexion.colleccion.find().sort(query);

        return cursor;
    }

    public DBCursor buscarTodosProfesores() {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Profesor");
        DBObject query = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find().sort(query);

        return cursor;

    }

    public DBCursor buscarTodasFaltasProfesores() {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("FaltasProfesor");
        DBObject query = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find().sort(query);

        return cursor;

    }
    public DBCursor buscarTodasFaltasAlumnos() {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("FaltasAlumno");
        DBObject query = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find().sort(query);

        return cursor;

    }
     public DBCursor buscarTodasNotas(int i) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Asignaturas");
        DBObject query = new BasicDBObject("idProfesor", i);
        DBObject sort = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find(query).sort(sort);

        return cursor;

    }
     public DBCursor buscarTodasNotasCodAlumno(int i) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Asignaturas");
        DBObject query = new BasicDBObject("idAlumno", i);
        DBObject sort = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find(query).sort(sort);

        return cursor;

    }
      public DBCursor buscarTodasNotasNombre(String i, int p) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Asignaturas");
        DBObject query = new BasicDBObject("nombre", i).append("idAlumno", p);
        DBObject sort = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find(query).sort(sort);

        return cursor;

    }
     public DBCursor buscarTodasAsignaturasIdAlumnoProfesor(int i, int p) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Asignaturas");
        DBObject query = new BasicDBObject("idAlumno", i).append("idProfesor", p);
        DBObject sort = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find(query).sort(sort);

        return cursor;

    }
     public DBCursor buscarTodasFaltasIdAlumno(int i) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("FaltasAlumno");
        DBObject query = new BasicDBObject("idAlumno", i);
        DBObject sort = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find(query).sort(sort);

        return cursor;

    }
      public DBCursor buscarFaltasPorDia(String i) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("FaltasAlumno");
        DBObject query = new BasicDBObject("dia", i);
        DBObject sort = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find(query).sort(sort);

        return cursor;

    }
       public DBCursor buscarFaltasPorDiaProfesores(String i) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("FaltasProfesor");
        DBObject query = new BasicDBObject("dia", i);
        DBObject sort = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find(query).sort(sort);

        return cursor;

    }
     public DBCursor buscarPorCodigo(int i,String clase) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection(clase);
        DBObject query = new BasicDBObject("_id", i);
        cursor = nuevaCollection.find(query).sort(query);

        return cursor;

    }
     public DBCursor buscarAsignaturasPorCodigo(int i) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Asignaturas");
        DBObject query = new BasicDBObject("_id", i);
        cursor = nuevaCollection.find(query).sort(query);

        return cursor;

    }
     public DBCursor buscarAsignaturasPorCodigoAlumno(int i, int y) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Asignaturas");
        DBObject query = new BasicDBObject("idAlumno", i).append("idProfesor", y);
        DBObject sort = new BasicDBObject("_id", 1);
        cursor = nuevaCollection.find(query).sort(sort);

        return cursor;

    }

    public DBCursor buscarFaltasProfesorPorCodigo(int i) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("FaltasProfesor");
        DBObject query = new BasicDBObject("_id", i);
        cursor = nuevaCollection.find(query).sort(query);

        return cursor;

    }
    public DBCursor buscarFaltasProfesorPorCodigoEIdProfe(int i, int p) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("FaltasProfesor");
        DBObject query = new BasicDBObject("_id", i).append("idProfesor", p);
        cursor = nuevaCollection.find(query);

        return cursor;

    }

    public DBCursor buscarUsuarioId(int id) {
        conexion = new ConnectionMongoDB();

        DBObject query = new BasicDBObject("_id", id);

        cursor = conexion.colleccion.find(query);

        return cursor;

    }
     public DBCursor buscarUsuarioNombre(String nombre) {
        conexion = new ConnectionMongoDB();

        DBObject query = new BasicDBObject("nombre", nombre);

        cursor = conexion.colleccion.find(query);

        return cursor;

    }

    public DBCursor buscarProfesorId(int id) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Profesor");

        DBObject query = new BasicDBObject("_id", id);

        cursor = nuevaCollection.find(query);

        return cursor;

    }

    public DBCursor buscarUsuarioCodigo(int i) {
        conexion = new ConnectionMongoDB();

        DBObject query = new BasicDBObject("_id", i);

        cursor = conexion.colleccion.find(query);

        return cursor;

    }

    public DBCursor buscarUsuarioContrasenia(String contrasenia) {
        conexion = new ConnectionMongoDB();

        DBObject query = new BasicDBObject("contrasenia", contrasenia);

        cursor = conexion.colleccion.find(query);

        return cursor;

    }

    public DBCursor buscarUsuarioNombreTelefono(String nombre, int telefono) {
        conexion = new ConnectionMongoDB();

        DBObject query = new BasicDBObject("nombre", nombre).append("telefono", telefono);

        cursor = conexion.colleccion.find(query);

        return cursor;
    }

    public DBCursor buscarProfesorNombreTelefono(String nombre, int telefono) {
        DBCollection nuevaCollection = conexion.getDb().getCollection("Profesor");

        DBObject query = new BasicDBObject("nombre", nombre).append("telefono", telefono);

        cursor = nuevaCollection.find(query);

        return cursor;

    }

    public DBCursor buscarUsuarioNombreContrasenia(String nombre, String contrasenia) {
        conexion = new ConnectionMongoDB();

        DBObject query = new BasicDBObject("nombre", nombre).append("contrasenia", contrasenia);

        cursor = conexion.colleccion.find(query);

        return cursor;

    }

    public DBCursor buscarProfesorNombreContrasenia(String nombre, String contrasenia) {
        DBCollection nuevaCollection = conexion.getDb().getCollection("Profesor");

        DBObject query = new BasicDBObject("nombre", nombre).append("contrasenia", contrasenia);

        cursor = nuevaCollection.find(query);

        return cursor;

    }
    public DBCursor buscarAdministrador(int i, String contrasenia) {
        conexion = new ConnectionMongoDB();
        DBCollection nuevaCollection = conexion.getDb().getCollection("Profesor");

        DBObject query = new BasicDBObject("_id", i).append("contrasenia", contrasenia);

        cursor = nuevaCollection.find(query);

        return cursor;

    }

}
//

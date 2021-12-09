/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3medi
 */
public class ConnectionMongoDB {

    Mongo mongo;
    DB db;
    DBCollection colleccion;

    public ConnectionMongoDB() {
        try {
            mongo = new Mongo("localhost", 27017);
            //base de datos
            db = mongo.getDB("InstitutoPF");
            //coleccion
            colleccion = db.getCollection("Alumnos");
            

        } catch (UnknownHostException ex) {
            System.out.println("Se ha producido un error al conectar con la base de datos, cerramos");
            System.exit(-1);
        }
    }

    public Mongo getMongo() {
        return mongo;
    }

    public void setMongo(Mongo mongo) {
        this.mongo = mongo;
    }

    public DB getDb() {
        return db;
    }

    public void setDb(DB db) {
        this.db = db;
    }

    public DBCollection getColleccion() {
        return colleccion;
    }

    public void setColleccion(DBCollection colleccion) {
        this.colleccion = colleccion;
    }

}

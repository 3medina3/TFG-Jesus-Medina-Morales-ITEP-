/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Beans.Alumnos;
import Beans.Profesores;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

/**
 *
 * @author 3medi
 */
public class DevGente {

    private DBCursor cursor;
    private Alumnos a;
    private Profesores p;

    public Alumnos devAlumno(DBCursor cursor) {
        this.cursor=cursor; 
        
        if (this.cursor.size() != 0) {

            while (this.cursor.hasNext()) {

                Alumnos alumno = new Alumnos((BasicDBObject) cursor.next());
               
                return alumno;
            }
            
        }
        return a;
    }
    public Profesores devProfe(DBCursor cursor){
         this.cursor=cursor; 
        
        if (this.cursor.size() != 0) {

            while (this.cursor.hasNext()) {

                Profesores profesores = new Profesores((BasicDBObject) cursor.next());
               
                return profesores;
            }
            
        }
        return p;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorVigilante;

import java.sql.Connection;
import Modelo.ClaseVisualizarResidencias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ALFARO
 */
public class VisualizarResidenciasController {
    
    private Connection cn;
    private String residencia;
    private String numeroRe;
    private String direccionRe;
    private String zona;
    private String residente;
    
     public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setNumeroRe(String numeroRe) {
        this.numeroRe = numeroRe;
    }

    public String getDireccionRe() {
        return direccionRe;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getResidente() {
        return residente;
    }
    
    public void setResidente(String residente) {
        this.residente = residente;
    }    
     
    public void VisualizarResidenciasController(){
   //Establecemos la conexion
       ClaseVisualizarResidencias con = new ClaseVisualizarResidencias();
       cn = con.conectar();
    }
   
    //método para guardar
    public boolean guardarProyecto(){
        boolean res = false; 
        try{ //Realizar consulta INSERT
           String sql = "INSERT INTO proyecto (idResidencia, numeroResidencia, direccionResidencia, idZona, idResidente) values(?,?,?,?,?)";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la tabla
           cmd.setString(1, residencia); //codigoP es como se definio en la clase aunque en la base se llama codigoProyecto
           cmd.setString(2, numeroRe);
           cmd.setString(3, direccionRe);
           cmd.setString(4, zona);
           cmd.setString(5, residente);

           //Si da error devuelve 1, caso contrario 
           //Tomar en cuenta que el ! es negación
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    //método para modificar
    public boolean modificarProyecto(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "UPDATE Proyecto SET  numeroResidencia =?, direccionResidencia =?, idZona=?, idResidente=?, WHERE idResidencia=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setString(1, residencia); //codigoP es como se definio en la clase aunque en la base se llama codigoProyecto
           cmd.setString(2, numeroRe);
           cmd.setString(3, direccionRe);
           cmd.setString(4, zona);
           cmd.setString(5, residente);
      
            //Si da error devuelve 1, caso contrario 
           //Tomar en cuenta que el ! es negación
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    //método para eliminar
    public boolean eliminarProyecto(){
        boolean res = false;
        try{ //Realizar consulta DELETE
           String sql = "DELETE FROM Proyecto WHERE idResidencia=?";
           PreparedStatement cmd = cn.prepareStatement(sql);//Lenar los parámetros 
           cmd.setString(1, residencia); 
            //Si da error devuelve 1, caso contrario 
           //Tomar en cuenta que el ! es negación
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    //método para consultar
    public boolean consultarProyecto(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "SELECT idResidencia, numeroResidencia, numerodireccion, idZona, idResidente FROM Proyecto WHERE idResidencia=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setString(1, residencia);
           
           //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              residencia = rs.getString(1);
               residencia = rs.getString(2);
               numeroRe= rs.getString(3);
               direccionRe = rs.getString(4);
               zona = rs.getString(5);
               residente = rs.getString(6);
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }

    public void setResidencia(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorVigilante;

import java.sql.Connection;
import Modelo.ClaseRegistroLlamadas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author CRISTIAN
 */
public class RegistroLlamadasController {
    private Connection cn;
    private String registroLla;
    private Integer personal;
    private Integer porton;
    private String residencia;
    private String fecha;
    private String motivo;
    
    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public String getRegistroLla() {
        return registroLla;
    }

    public void setPersonal(Integer personal) {
        this.personal = personal;
    }

    public Integer getPorton() {
        return porton;
    }

    public void setPorton(Integer porton) {
        this.porton = porton;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }    
     
    public String getMotivo() {
        return motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

     public void RegistroLlamadaController(){
   //Establecemos la conexion
       ClaseRegistroLlamadas con = new ClaseRegistroLlamadas();
       cn = con.conectar();
    }
   
    //método para guardar
    public boolean guardarProyecto(){
        boolean res = false; 
        try{ //Realizar consulta INSERT
           String sql = "INSERT INTO proyecto (idRegistroLl, idPersonal, idPorton, idResidencia, fecha, motivoLlamada) values(?,?,?,?,?)"; //se pasan por referencia por seguridad
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la tabla
           cmd.setString(1,registroLla); //codigoP es como se definio en la clase aunque en la base se llama codigoProyecto
           cmd.setInt(2, personal);
           cmd.setInt(3, porton);
           cmd.setString(4, residencia);
           cmd.setString(5, fecha);
           cmd.setString(6, motivo);

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
           String sql = "UPDATE Proyecto SET  idPersonal =?, idPorton =?, idResidencia=?, fecha=?, motivoLlamada=? WHERE idRegistroLl=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setString(1,registroLla); 
           cmd.setInt(2, personal);
           cmd.setInt(3, porton);
           cmd.setString(4, residencia);
           cmd.setString(5, fecha);
           cmd.setString(6, motivo);
           

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
           String sql = "DELETE FROM Proyecto WHERE idRegistroLla=?";
           PreparedStatement cmd = cn.prepareStatement(sql);//Lenar los parámetros 
           cmd.setString(1,registroLla); 
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
           String sql = "SELECT idRegistroLl, idPersonal, idPorton, idResidencia, fecha, motivoLlamada FROM Proyecto WHERE idRegistroLl=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setString(1, registroLla);
           
           //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              registroLla = rs.getString(1);
              personal = rs.getInt(2);
              porton = rs.getInt(3);
              residencia = rs.getString(4);
              fecha = rs.getString(5);
              motivo = rs.getString(6);
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }

    public void setResidencia(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
